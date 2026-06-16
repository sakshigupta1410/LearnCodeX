package com.learncodex.app

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import android.text.style.UnderlineSpan
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import kotlin.random.Random

class OnboardingActivity : AppCompatActivity() {

    private lateinit var quoteTextView: TextView
    private lateinit var emailSignupButton: Button
    private lateinit var loginText: TextView
    private lateinit var appNameTextView: TextView
    private lateinit var auth: FirebaseAuth

    // Quotes list (defined once)
    private val quotes = listOf(
        "Code your future, one lesson at a time.",
        "Turning curiosity into code — welcome to LearnCodeX!",
        "Enter to learn, exit to lead — LearnCodeX starts here.",
        "Code Your Future with LearnCodeX.",
        "From Zero to Coder—LearnCodeX Makes It Easy.",
        "Code Smart. Code Fast. CodeX.",
        "Crack the Code of the Future with LearnCodeX.",
        "Don’t Just Surf the Web — Build It with LearnCodeX.",
        "Swipe Right on Coding – It’s a Match with LearnCodeX!",
        "Turn Coffee into Code with LearnCodeX.",
        "Code the Future. Start with LearnCodeX.",
        "Your Future Runs on Code — Powered by LearnCodeX.",
        "Write the Future – Start with LearnCodeX.",
        "Go From Noob to Ninja with LearnCodeX.",
        "From Basics to Brilliance – LearnCodeX."
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Initialize FirebaseAuth
        auth = FirebaseAuth.getInstance()

        // ✅ If user is logged in → go directly to MainActivity
        if (auth.currentUser != null) {
            startActivity(Intent(this, MainActivity::class.java))
            finish()
            return
        }

        // If no user is logged in → show onboarding layout
        setContentView(R.layout.activity_onboarding)

        // Bind views
        quoteTextView = findViewById(R.id.onboard_quote)
        emailSignupButton = findViewById(R.id.email_signup)
        loginText = findViewById(R.id.tvLogin)
        appNameTextView = findViewById(R.id.app_name)

        // App name
        appNameTextView.text = "LearnCodeX"

        // Stylize "Log In"
        val fullText = "Already have an account? Log In"
        val spannable = SpannableString(fullText)
        val loginStart = fullText.indexOf("Log In")
        val loginEnd = loginStart + "Log In".length

        spannable.setSpan(
            ForegroundColorSpan(Color.parseColor("#1B5EAB")),
            loginStart, loginEnd,
            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
        )
        spannable.setSpan(
            UnderlineSpan(),
            loginStart, loginEnd,
            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
        )
        loginText.text = spannable

        // Sign Up Button → don’t finish onboarding, so back works
        emailSignupButton.setOnClickListener {
            startActivity(Intent(this, SignupActivity::class.java))
        }

        // Log In Text → don’t finish onboarding, so back works
        loginText.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }
    }

    override fun onResume() {
        super.onResume()
        // ✅ Show new random quote every time screen is visible
        quoteTextView.text = quotes[Random.nextInt(quotes.size)]
    }

    override fun onBackPressed() {
        super.onBackPressed()
        finishAffinity() // closes the app completely
    }
}
