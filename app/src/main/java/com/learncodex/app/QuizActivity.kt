package com.learncodex.app

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.learncodex.app.databinding.ActivityQuizBinding
import org.json.JSONArray
import java.io.BufferedReader
import java.io.InputStreamReader

class QuizActivity : AppCompatActivity() {

    private lateinit var binding: ActivityQuizBinding

    private lateinit var quizQuestions: List<QuizQuestion>
    private var currentQuestionIndex = 0
    private var score = 0

    private lateinit var optionButtons: List<RadioButton>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuizBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Get language from Intent
        val language = intent.getStringExtra("language")?.lowercase() ?: ""
        if (language.isEmpty()) {
            Toast.makeText(this, "Language not specified", Toast.LENGTH_SHORT).show()
            finish()
            return
        }

        // Prepare list of option RadioButtons
        optionButtons = listOf(
            findViewById(R.id.option1),
            findViewById(R.id.option2),
            findViewById(R.id.option3),
            findViewById(R.id.option4)
        )

        // Load quiz JSON from assets
        val json = loadQuizJson(language)
        quizQuestions = json?.let { parseQuizJson(it) } ?: emptyList()

        if (quizQuestions.isNotEmpty()) {
            showQuestion()
        } else {
            Toast.makeText(this, "Quizzes will come soon for $language", Toast.LENGTH_SHORT).show()
            finish()
        }

        // Next button click listener
        binding.nextButton.setOnClickListener {
            val selectedId = binding.optionsGroup.checkedRadioButtonId

            if (selectedId == -1) {
                Toast.makeText(this, "Please select an answer", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val selectedIndex = optionButtons.indexOfFirst { it.id == selectedId }
            val correctAnswer = quizQuestions[currentQuestionIndex].correctAnswerIndex
            if (selectedIndex == correctAnswer) {
                score++
                CorrectAnswerDialog {
                    currentQuestionIndex++
                    if (currentQuestionIndex < quizQuestions.size) {
                        showQuestion()
                    } else {
                        showResultDialog()
                    }
                }.show(supportFragmentManager, "correctAnswer")
            } else {
                WrongAnswerDialog {
                    currentQuestionIndex++
                    if (currentQuestionIndex < quizQuestions.size) {
                        showQuestion()
                    } else {
                        showResultDialog()
                    }
                }.show(supportFragmentManager, "wrongAnswer")
            }
        }

    }

    private fun showQuestion() {
        val question = quizQuestions[currentQuestionIndex]
        binding.questionText.text = question.question
        binding.optionsGroup.clearCheck()

        for (i in 0..3) {
            optionButtons[i].text = question.options[i]
        }
    }

    private fun loadQuizJson(language: String): String? {
        return try {
            val inputStream = assets.open("md/$language/quiz.json")
            BufferedReader(InputStreamReader(inputStream)).use { it.readText() }
        } catch (e: Exception) {
            e.printStackTrace()
            null
        }
    }

    private fun parseQuizJson(json: String): List<QuizQuestion> {
        val questions = mutableListOf<QuizQuestion>()
        try {
            val jsonArray = JSONArray(json)
            for (i in 0 until jsonArray.length()) {
                val obj = jsonArray.getJSONObject(i)

                // Use your JSON keys here!
                val question = obj.getString("text")
                val optionsJson = obj.getJSONArray("options")
                val options = List(optionsJson.length()) { index -> optionsJson.getString(index) }

                val answerRaw = obj.get("correctAnswerIndex")
                val answer = when (answerRaw) {
                    is Int -> answerRaw
                    is String -> answerRaw.toIntOrNull() ?: -1
                    else -> -1
                }

                questions.add(QuizQuestion(question, options, answer))
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return questions
    }

    private fun showResultDialog() {
        AlertDialog.Builder(this)
            .setTitle("Quiz Completed")
            .setMessage("Your score is $score out of ${quizQuestions.size}")
            .setPositiveButton("OK") { _, _ -> finish() }
            .setCancelable(false)
            .show()
    }
}
