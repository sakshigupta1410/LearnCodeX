package com.learncodex.app

import android.Manifest
import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.Bitmap
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.view.MenuItem
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.GravityCompat
import com.bumptech.glide.Glide
import com.google.android.material.navigation.NavigationView
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.UserProfileChangeRequest
import com.google.firebase.storage.FirebaseStorage
import com.learncodex.app.databinding.ActivityMainBinding
import com.learncodex.app.utils.ProfileImageManager
import java.io.File
import java.io.FileOutputStream
import java.util.UUID

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    private lateinit var binding: ActivityMainBinding
    private lateinit var auth: FirebaseAuth
    private lateinit var userProfileImage: ImageView

    private val storageRef by lazy { FirebaseStorage.getInstance().reference }
    private val prefs by lazy { getSharedPreferences("user_prefs", MODE_PRIVATE) }

    // --- Activity Result APIs ---
    private val galleryLauncher =
        registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
            if (result.resultCode == Activity.RESULT_OK && result.data?.data != null) {
                val imageUri = result.data!!.data!!
                saveLocalAndBroadcast(imageUri)
                uploadImageToFirebase(imageUri)
            }
        }

    private val cameraLauncher =
        registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
            if (result.resultCode == Activity.RESULT_OK) {
                val photoBitmap = result.data?.extras?.get("data") as? Bitmap
                if (photoBitmap != null) {
                    val uri = saveBitmapToCache(photoBitmap)
                    if (uri != null) {
                        saveLocalAndBroadcast(uri)
                        uploadImageToFirebase(uri)
                    } else {
                        Toast.makeText(this, "Failed to save photo", Toast.LENGTH_SHORT).show()
                    }
                }
            }
        }

    private val requestCameraPermission =
        registerForActivityResult(ActivityResultContracts.RequestPermission()) { granted ->
            if (granted) launchCamera()
            else Toast.makeText(this, "Camera permission denied", Toast.LENGTH_SHORT).show()
        }

    // ----------------------------

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        auth = FirebaseAuth.getInstance()

        setSupportActionBar(binding.toolbar)

        val toggle = ActionBarDrawerToggle(
            this,
            binding.drawerLayout,
            binding.toolbar,
            R.string.navigation_drawer_open,
            R.string.navigation_drawer_close
        )
        binding.drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        binding.navView.setNavigationItemSelectedListener(this)

        if (auth.currentUser == null) {
            startActivity(Intent(this, OnboardingActivity::class.java))
            finish()
            return
        }

        updateNavHeader()

        if (savedInstanceState == null) {
            loadFragment(HomeFragment())
        }
    }

    private fun updateNavHeader() {
        val currentUser = auth.currentUser ?: return
        val headerView = binding.navView.getHeaderView(0)

        val userNameText = headerView.findViewById<TextView>(R.id.userNameText)
        val userEmailText = headerView.findViewById<TextView>(R.id.userEmailText)
        userProfileImage = headerView.findViewById(R.id.userProfileImage)

        userNameText.text = currentUser.displayName ?: "User"
        userEmailText.text = currentUser.email ?: "No Email"

        // Load FirebaseAuth photoUrl if exists
        val remoteUrl = currentUser.photoUrl
        if (remoteUrl != null) {
            Glide.with(this)
                .load(remoteUrl)
                .placeholder(R.drawable.ic_profile)
                .circleCrop()
                .into(userProfileImage)
            ProfileImageManager.setImageUri(remoteUrl)
        } else {
            val local = prefs.getString("profile_image_local", null)
            if (local != null) {
                val localUri = Uri.parse(local)
                Glide.with(this)
                    .load(localUri)
                    .placeholder(R.drawable.ic_profile)
                    .circleCrop()
                    .into(userProfileImage)
                ProfileImageManager.setImageUri(localUri)
            } else {
                userProfileImage.setImageResource(R.drawable.ic_profile)
            }
        }

        // Listen for changes (instant update when photo is changed)
        ProfileImageManager.getImageUri().observe(this) { uri ->
            Glide.with(this)
                .load(uri ?: R.drawable.ic_profile)
                .placeholder(R.drawable.ic_profile)
                .circleCrop()
                .into(userProfileImage)
        }

        userProfileImage.setOnClickListener { showImageSourceDialog() }
    }

    private fun showImageSourceDialog() {
        val hasPhoto = prefs.getString("profile_image_local", null) != null ||
                prefs.getString("profile_image_remote", null) != null ||
                auth.currentUser?.photoUrl != null

        val options = if (hasPhoto) {
            arrayOf("Choose from Gallery", "Take Photo", "Remove Photo")
        } else {
            arrayOf("Choose from Gallery", "Take Photo")
        }

        AlertDialog.Builder(this)
            .setTitle("Update Profile Picture")
            .setItems(options) { _, which ->
                when (which) {
                    0 -> pickImageFromGallery()
                    1 -> ensureCameraPermissionThenLaunch()
                    2 -> if (hasPhoto) removeProfilePhoto()
                }
            }
            .show()
    }

    private fun removeProfilePhoto() {
        AlertDialog.Builder(this)
            .setTitle("Remove Profile Photo")
            .setMessage("Are you sure you want to remove your profile photo?")
            .setPositiveButton("Yes") { _, _ ->
                val user = auth.currentUser ?: return@setPositiveButton

                // 1. Clear locally saved images
                prefs.edit().remove("profile_image_local").apply()
                prefs.edit().remove("profile_image_remote").apply()

                // 2. Reset UI instantly
                userProfileImage.setImageResource(R.drawable.ic_profile)
                ProfileImageManager.setImageUri(null)

                // 3. Update FirebaseAuth profile (remove photo URL)
                val updates = UserProfileChangeRequest.Builder()
                    .setPhotoUri(null)
                    .build()

                user.updateProfile(updates)
                    .addOnSuccessListener {
                        Toast.makeText(this, "Profile photo removed!", Toast.LENGTH_SHORT).show()
                    }
                    .addOnFailureListener { e ->
                        Toast.makeText(this, "Failed to update profile: ${e.message}", Toast.LENGTH_SHORT).show()
                    }

                // 4. Delete from Firebase Storage (optional, silent if fails)
                val fileRef = storageRef.child("profile_images/${user.uid}.jpg")
                fileRef.delete()
                    .addOnSuccessListener {
                        // File deleted successfully (optional: log or toast if needed)
                    }
                    .addOnFailureListener {
                        // Ignore errors: file may not exist or already deleted
                    }
            }
            .setNegativeButton("Cancel", null)
            .show()
    }



    private fun pickImageFromGallery() {
        val intent = Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI)
        galleryLauncher.launch(intent)
    }

    private fun ensureCameraPermissionThenLaunch() {
        val granted = ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA) ==
                PackageManager.PERMISSION_GRANTED
        if (granted) launchCamera() else requestCameraPermission.launch(Manifest.permission.CAMERA)
    }

    private fun launchCamera() {
        val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
        cameraLauncher.launch(intent)
    }

    private fun saveBitmapToCache(bitmap: Bitmap): Uri? {
        return try {
            val file = File(cacheDir, "pf_${UUID.randomUUID()}.jpg")
            FileOutputStream(file).use { out ->
                bitmap.compress(Bitmap.CompressFormat.JPEG, 95, out)
            }
            Uri.fromFile(file)
        } catch (e: Exception) {
            e.printStackTrace()
            null
        }
    }

    private fun saveLocalAndBroadcast(localUri: Uri) {
        prefs.edit().putString("profile_image_local", localUri.toString()).apply()
        ProfileImageManager.setImageUri(localUri)
    }

    private fun uploadImageToFirebase(imageUri: Uri) {
        val user = auth.currentUser ?: return
        val fileRef = storageRef.child("profile_images/${user.uid}.jpg")

        fileRef.putFile(imageUri)
            .addOnSuccessListener {
                fileRef.downloadUrl.addOnSuccessListener { downloadUri ->
                    prefs.edit().putString("profile_image_remote", downloadUri.toString()).apply()

                    val updates = UserProfileChangeRequest.Builder()
                        .setPhotoUri(downloadUri)
                        .build()
                    user.updateProfile(updates)
                        .addOnSuccessListener {
                            ProfileImageManager.setImageUri(downloadUri)
                            Toast.makeText(this, "Profile picture updated!", Toast.LENGTH_SHORT).show()
                        }
                        .addOnFailureListener { e ->
                            Toast.makeText(this, "Failed to update profile: ${e.message}", Toast.LENGTH_SHORT).show()
                        }
                }
            }
            .addOnFailureListener { e ->
                Toast.makeText(this, "Upload failed: ${e.message}", Toast.LENGTH_SHORT).show()
            }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.nav_home -> loadFragment(HomeFragment())
            R.id.nav_courses -> loadFragment(CoursesFragment())
            R.id.nav_settings -> startActivity(Intent(this, SettingsActivity::class.java))
            R.id.nav_share -> {
                val intent = Intent(Intent.ACTION_SEND).apply {
                    type = "text/plain"
                    putExtra(Intent.EXTRA_SUBJECT, "Check out LearnCodeX!")
                    putExtra(Intent.EXTRA_TEXT, "Download LearnCodeX now: https://play.google.com/store/apps/details?id=com.learncodex.app")
                }
                startActivity(Intent.createChooser(intent, "Share via"))
            }
            R.id.nav_about -> loadFragment(AboutFragment())
            R.id.nav_logout -> {
                AlertDialog.Builder(this)
                    .setTitle("Logout")
                    .setMessage("Are you sure you want to logout?")
                    .setPositiveButton("Yes") { _, _ ->
                        auth.signOut()
                        val intent = Intent(this, OnboardingActivity::class.java)
                        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
                        startActivity(intent)
                        finish()
                    }
                    .setNegativeButton("Cancel", null)
                    .show()
            }
        }
        binding.drawerLayout.closeDrawer(GravityCompat.START)
        return true
    }

    private fun loadFragment(fragment: androidx.fragment.app.Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .commit()
    }

    override fun onBackPressed() {
        if (binding.drawerLayout.isDrawerOpen(GravityCompat.START)) {
            binding.drawerLayout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }
}