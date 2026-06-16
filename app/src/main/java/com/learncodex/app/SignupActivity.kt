package com.learncodex.app

import android.content.Intent
import android.os.Bundle
import android.util.Patterns
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.UserProfileChangeRequest
import android.text.SpannableString
import android.text.Spannable
import android.text.style.ForegroundColorSpan
import android.text.style.UnderlineSpan

class SignupActivity : AppCompatActivity() {

    private lateinit var nameEditText: EditText
    private lateinit var emailEditText: EditText
    private lateinit var passwordEditText: EditText
    private lateinit var registerButton: Button
    private lateinit var loginRedirectText: TextView
    private lateinit var progressBar: ProgressBar

    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        auth = FirebaseAuth.getInstance()

        nameEditText = findViewById(R.id.signup_name)
        emailEditText = findViewById(R.id.signup_email)
        passwordEditText = findViewById(R.id.signup_password)
        registerButton = findViewById(R.id.register_btn)
        loginRedirectText = findViewById(R.id.login_redirect_text)
        progressBar = findViewById(R.id.progressBar)

        // ✅ Make only "Log In" blue (#1B5EAB) + underlined
        val fullText = "Already have an account? Log In"
        val spannable = SpannableString(fullText)
        val customBlue = android.graphics.Color.parseColor("#1B5EAB")
        val start = fullText.indexOf("Log In")
        val end = start + "Log In".length

        spannable.setSpan(
            ForegroundColorSpan(customBlue),
            start,
            end,
            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
        )

        spannable.setSpan(
            UnderlineSpan(),
            start,
            end,
            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
        )

        loginRedirectText.text = spannable

        registerButton.setOnClickListener { registerUser() }

        // Redirect to LoginActivity
        loginRedirectText.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
            finish()
        }
    }

    private fun registerUser() {
        val name = nameEditText.text.toString().trim()
        val email = emailEditText.text.toString().trim()
        val password = passwordEditText.text.toString().trim()

        if (name.isEmpty()) {
            nameEditText.error = "Full name is required"
            nameEditText.requestFocus()
            return
        }
        if (email.isEmpty() || !Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            emailEditText.error = "Enter a valid email"
            emailEditText.requestFocus()
            return
        }
        if (password.isEmpty() || password.length < 6) {
            passwordEditText.error = "Password must be at least 6 characters"
            passwordEditText.requestFocus()
            return
        }

        progressBar.visibility = View.VISIBLE

        auth.createUserWithEmailAndPassword(email, password)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    val user = auth.currentUser
                    val profileUpdates = UserProfileChangeRequest.Builder()
                        .setDisplayName(name)
                        .build()

                    user?.updateProfile(profileUpdates)?.addOnCompleteListener { updateTask ->
                        progressBar.visibility = View.GONE
                        if (updateTask.isSuccessful) {
                            // ✅ Save name and email to SharedPreferences
                            val sharedPref = getSharedPreferences("user_prefs", MODE_PRIVATE)
                            with(sharedPref.edit()) {
                                putString("user_name", name)
                                putString("user_email", email)
                                apply()
                            }

                            Toast.makeText(this, "Registration Successful", Toast.LENGTH_SHORT).show()
                            startActivity(Intent(this, MainActivity::class.java))
                            finish()
                        } else {
                            Toast.makeText(this, "Name update failed!", Toast.LENGTH_SHORT).show()
                        }
                    }
                } else {
                    progressBar.visibility = View.GONE
                    Toast.makeText(this, "Registration Failed: ${task.exception?.message}", Toast.LENGTH_LONG).show()
                }
            }
    }
}
