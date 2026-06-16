package com.learncodex.app

import android.content.Intent
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.TextUtils
import android.text.style.ForegroundColorSpan
import android.text.style.UnderlineSpan
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth

class LoginActivity : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth

    private lateinit var emailInput: EditText
    private lateinit var passwordInput: EditText
    private lateinit var loginBtn: Button
    private lateinit var forgotPassword: TextView
    private lateinit var signUpText: TextView
    private lateinit var progressBar: ProgressBar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        auth = FirebaseAuth.getInstance()

        emailInput = findViewById(R.id.login_email)
        passwordInput = findViewById(R.id.login_password)
        loginBtn = findViewById(R.id.login_btn)
        forgotPassword = findViewById(R.id.forgot_password)
        signUpText = findViewById(R.id.signup_text)
        progressBar = findViewById(R.id.login_progressBar)
        progressBar.visibility = View.GONE

        // ✅ Make only "Sign Up" blue (#1B5EAB) + underlined
        val fullText = "Don't have an account? Sign Up"
        val spannable = SpannableString(fullText)
        val customBlue = android.graphics.Color.parseColor("#1B5EAB")
        val start = fullText.indexOf("Sign Up")
        val end = start + "Sign Up".length

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

        signUpText.text = spannable

        // Login button click
        loginBtn.setOnClickListener {
            val email = emailInput.text.toString().trim().lowercase()
            val password = passwordInput.text.toString().trim()

            if (TextUtils.isEmpty(email)) {
                emailInput.error = "Email is required!"
                return@setOnClickListener
            }

            if (TextUtils.isEmpty(password)) {
                passwordInput.error = "Password is required!"
                return@setOnClickListener
            }

            progressBar.visibility = View.VISIBLE
            loginBtn.isEnabled = false

            auth.signInWithEmailAndPassword(email, password)
                .addOnCompleteListener { task ->
                    progressBar.visibility = View.GONE
                    loginBtn.isEnabled = true
                    if (task.isSuccessful) {
                        Toast.makeText(this, "Login successful", Toast.LENGTH_SHORT).show()
                        startActivity(Intent(this, MainActivity::class.java))
                        finish()
                    } else {
                        val message = when (task.exception?.message) {
                            "The email address is badly formatted." -> "Invalid email format."
                            "There is no user record corresponding to this identifier. The user may have been deleted." ->
                                "No account found with this email."
                            "The password is invalid or the user does not have a password." ->
                                "Incorrect password."
                            else -> task.exception?.message
                        }
                        Toast.makeText(this, "Login failed: $message", Toast.LENGTH_LONG).show()
                    }
                }
        }

        // Forgot Password click
        forgotPassword.setOnClickListener {
            startActivity(Intent(this, ForgotPasswordActivity::class.java))
        }

        // Sign up redirect
        signUpText.setOnClickListener {
            startActivity(Intent(this, SignupActivity::class.java))
        }
    }

    // Auto-login if already signed in
    override fun onStart() {
        super.onStart()
        if (auth.currentUser != null) {
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
    }
}
