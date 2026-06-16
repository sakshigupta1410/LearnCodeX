package com.learncodex.app

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.learncodex.app.databinding.ActivityLessonListBinding

class LessonListActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLessonListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLessonListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Get selected language from intent extras (e.g., "Java", "Python", etc.)
        val language = intent.getStringExtra("LANGUAGE") ?: ""

        // Set the language title on UI
        binding.languageTitle.text = language

        // Retrieve the list of lessons for this language
        val lessonList = LessonRepository.getLessonsForLanguage(language)

        // Initialize the RecyclerView adapter with click handling
        val adapter = LessonAdapter(this, lessonList, language.lowercase()) { lesson ->
            // On lesson item click: open LessonDetailActivity
            val index = lessonList.indexOf(lesson)
            if (index != -1 && lesson.fileName.isNotEmpty()) {
                val intent = Intent(this, LessonDetailActivity::class.java).apply {
                    putExtra("languageFolder", language.lowercase())
                    putExtra("lessonIndex", index)
                    putExtra("lessonList", ArrayList(lessonList)) // pass lessons (ensure Lesson is Parcelable or Serializable)
                }
                startActivity(intent)
            } else {
                Toast.makeText(this, "No content available for this topic", Toast.LENGTH_SHORT).show()
            }
        }

        // Setup RecyclerView with a linear layout manager and adapter
        binding.lessonRecyclerView.layoutManager = LinearLayoutManager(this)
        binding.lessonRecyclerView.adapter = adapter

        // Setup the Start Quiz button
        binding.startQuizButton.apply {
            isEnabled = lessonList.isNotEmpty()
            setOnClickListener {
                if (lessonList.isEmpty()) {
                    Toast.makeText(this@LessonListActivity, "No lessons found to start quiz.", Toast.LENGTH_SHORT).show()
                    return@setOnClickListener
                }

                val quizIntent = Intent(this@LessonListActivity, QuizActivity::class.java).apply {
                    putExtra("language", language.lowercase())
                }
                startActivity(quizIntent)
            }
        }
    }
}
