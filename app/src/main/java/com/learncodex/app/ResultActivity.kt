package com.learncodex.app

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val score = intent.getIntExtra("score", 0)
        val total = intent.getIntExtra("total", 0)

        val resultText = findViewById<TextView>(R.id.resultText)
        val finishButton = findViewById<Button>(R.id.finishButton)

        resultText.text = "Your Score: $score / $total"

        finishButton.setOnClickListener {
            finish()
        }
    }
}
