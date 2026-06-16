package com.learncodex.app.utils

import android.net.Uri
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.storage.FirebaseStorage
import com.google.firebase.storage.StorageReference

object ProfileImageManager {

    private val storage: FirebaseStorage = FirebaseStorage.getInstance()
    private val auth: FirebaseAuth = FirebaseAuth.getInstance()

    // LiveData for observing profile image changes
    private val _imageUri = MutableLiveData<Uri?>()
    fun setImageUri(uri: Uri?) {
        _imageUri.postValue(uri)
    }
    fun getImageUri(): LiveData<Uri?> = _imageUri

    /**
     * Upload image to Firebase Storage
     */
    fun uploadProfileImage(uri: Uri, onResult: (Boolean, String?) -> Unit) {
        val uid = auth.currentUser?.uid ?: return
        val fileRef: StorageReference = storage.reference.child("profile_images/$uid.jpg")

        fileRef.putFile(uri)
            .addOnSuccessListener {
                fileRef.downloadUrl.addOnSuccessListener { downloadUri ->
                    // Update both LiveData types
                    _imageUri.value = downloadUri
                    onResult(true, downloadUri.toString())
                }
            }
            .addOnFailureListener { e ->
                Log.e("ProfileImageManager", "Upload failed", e)
                onResult(false, e.localizedMessage)
            }
    }

    /**
     * Fetch existing profile image
     */
    fun fetchProfileImage() {
        val uid = auth.currentUser?.uid ?: return
        val fileRef: StorageReference = storage.reference.child("profile_images/$uid.jpg")

        fileRef.downloadUrl
            .addOnSuccessListener { uri -> _imageUri.value = uri }
            .addOnFailureListener { _imageUri.value = null }
    }
}
