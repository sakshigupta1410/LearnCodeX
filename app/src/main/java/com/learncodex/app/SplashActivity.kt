package com.learncodex.app

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.animation.*
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {

    private lateinit var logoImage: ImageView
    private lateinit var appName: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        logoImage = findViewById(R.id.logoImage)
        appName = findViewById(R.id.appName)

        // Logo bounce + fade-in
        val bounceLogo = AnimationSet(true).apply {
            val scale = ScaleAnimation(
                0.2f, 1f, // X scale
                0.2f, 1f, // Y scale
                Animation.RELATIVE_TO_SELF, 0.5f,
                Animation.RELATIVE_TO_SELF, 0.5f
            ).apply {
                duration = 1000
                interpolator = OvershootInterpolator(1.5f)
            }
            val fade = AlphaAnimation(0f, 1f).apply { duration = 800 }
            addAnimation(scale)
            addAnimation(fade)
        }

        // Text scale-up + slide-up + fade-in
        val textAnim = AnimationSet(true).apply {
            startOffset = 500 // Delay after logo starts
            val slideUp = TranslateAnimation(0f, 0f, 100f, 0f).apply {
                duration = 800
                interpolator = DecelerateInterpolator()
            }
            val fadeIn = AlphaAnimation(0f, 1f).apply { duration = 800 }
            val scaleUp = ScaleAnimation(
                0.8f, 1f,
                0.8f, 1f,
                Animation.RELATIVE_TO_SELF, 0.5f,
                Animation.RELATIVE_TO_SELF, 0.5f
            ).apply {
                duration = 800
                interpolator = OvershootInterpolator(1.2f)
            }
            addAnimation(slideUp)
            addAnimation(fadeIn)
            addAnimation(scaleUp)
        }

        // Start animations
        logoImage.startAnimation(bounceLogo)
        appName.startAnimation(textAnim)

        // Move to Onboarding after delay
        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this, OnboardingActivity::class.java))
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
            finish()
        }, 3000)
    }
}
