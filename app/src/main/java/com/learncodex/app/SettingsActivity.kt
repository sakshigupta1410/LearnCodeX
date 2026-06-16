package com.learncodex.app

import android.content.Intent
import android.os.Bundle
import android.text.InputType
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.EmailAuthProvider
import com.google.firebase.auth.FirebaseAuth

class SettingsActivity : AppCompatActivity() {


    private lateinit var notificationLayout: LinearLayout
    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        // Firebase Auth instance
        auth = FirebaseAuth.getInstance()

        // Find views
        notificationLayout = findViewById(R.id.notificationLayout)


        // Notifications Click (Coming Soon)
        notificationLayout.setOnClickListener {
            Toast.makeText(this, "🔔 Notifications — Coming Soon!", Toast.LENGTH_SHORT).show()
        }
    }


    override fun onBackPressed() {
        super.onBackPressed()
        // Navigate back to MainActivity (HomeFragment)
        val intent = Intent(this, MainActivity::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP
        startActivity(intent)
        finish()
    }
}
