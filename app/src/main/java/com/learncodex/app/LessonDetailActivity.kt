package com.learncodex.app

import android.content.Intent
import android.content.res.Resources
import android.graphics.*
import android.os.Bundle
import android.text.style.*
import android.util.TypedValue
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.learncodex.app.databinding.ActivityLessonDetailBinding
import io.noties.markwon.*
import io.noties.markwon.html.HtmlPlugin
import io.noties.markwon.ext.tables.TablePlugin
import org.commonmark.node.*

class CodeBlockBackgroundSpan(
    private val backgroundColor: Int,
    private val padding: Int = 20
) : LineBackgroundSpan {
    override fun drawBackground(
        canvas: Canvas,
        paint: Paint,
        left: Int,
        right: Int,
        top: Int,
        baseline: Int,
        bottom: Int,
        text: CharSequence,
        start: Int,
        end: Int,
        lineNumber: Int
    ) {
        val originalColor = paint.color
        paint.color = backgroundColor

        val rect = Rect(left - padding, top - padding / 2, right + padding, bottom + padding / 2)
        canvas.drawRect(rect, paint)

        paint.color = originalColor
    }
}

class CustomLineHeightSpan(private val extraTop: Int, private val extraBottom: Int) : LineHeightSpan {
    override fun chooseHeight(
        text: CharSequence,
        start: Int,
        end: Int,
        spanstartv: Int,
        lineHeight: Int,
        fm: Paint.FontMetricsInt
    ) {
        fm.ascent -= extraTop
        fm.top -= extraTop
        fm.descent += extraBottom
        fm.bottom += extraBottom
    }
}

class LessonDetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLessonDetailBinding

    private lateinit var lessonList: List<Lesson>
    private var currentLessonIndex = 0
    private var languageFolder = ""

    private lateinit var markwon: Markwon

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLessonDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Initialize Markwon
        markwon = Markwon.builder(this)
            .usePlugin(HtmlPlugin.create())
            .usePlugin(TablePlugin.create(this)) // 👈 Add this line for table support
            .usePlugin(object : AbstractMarkwonPlugin() {
                override fun configureVisitor(builder: MarkwonVisitor.Builder) {

                    // Headings
                    builder.on(Heading::class.java) { visitor, heading ->
                        val level = heading.level
                        val color = when (level) {
                            1 -> Color.parseColor("#37ae85")
                            2 -> Color.parseColor("#8f5f2d")
                            3 -> Color.parseColor("#842aa4")
                            4 -> Color.parseColor("#669bbd")
                            5 -> Color.parseColor("#87c9f4")
                            6 -> Color.parseColor("#93d5ff")
                            else -> Color.BLACK
                        }
                        val fontSizePx = spToPx(
                            when (level) {
                                1 -> 24f
                                2 -> 22f
                                3 -> 20f
                                4 -> 18f
                                5 -> 16f
                                6 -> 14f
                                else -> 18f
                            }
                        )
                        val topPadding = spToPx(8f)
                        val bottomPadding = spToPx(4f)

                        val start = visitor.length()
                        visitor.visitChildren(heading)
                        visitor.setSpans(start, ForegroundColorSpan(color))
                        visitor.setSpans(start, AbsoluteSizeSpan(fontSizePx))
                        visitor.setSpans(start, CustomLineHeightSpan(topPadding, bottomPadding))
                    }

                    // Code block
                    builder.on(FencedCodeBlock::class.java) { visitor, node ->
                        val code = node.literal.trimEnd()
                        val start = visitor.length()
                        visitor.builder().append(code).append("\n")
                        visitor.setSpans(start, CodeBlockBackgroundSpan(Color.parseColor("#e1f4dc")))
                        visitor.setSpans(start, TypefaceSpan("monospace"))
                        visitor.setSpans(start, StyleSpan(Typeface.NORMAL))
                    }

                    // Inline code
                    builder.on(Code::class.java) { visitor, node ->
                        val code = node.literal
                        val start = visitor.length()
                        visitor.builder().append(code)
                        visitor.setSpans(start, BackgroundColorSpan(Color.parseColor("#d8bfd8")))
                        visitor.setSpans(start, TypefaceSpan("monospace"))
                        visitor.setSpans(start, StyleSpan(Typeface.BOLD))
                    }
                }
            })
            .build()


        // Get data from Intent
        languageFolder = intent.getStringExtra("languageFolder") ?: ""
        currentLessonIndex = intent.getIntExtra("lessonIndex", 0)
        lessonList = intent.getSerializableExtra("lessonList") as? List<Lesson> ?: emptyList()

        if (lessonList.isEmpty()) {
            Toast.makeText(this, "No lessons available.", Toast.LENGTH_SHORT).show()
            finish()
            return
        }

        // Load current lesson
        loadLesson(currentLessonIndex)

        // Button: Previous
        binding.btnPrevious.setOnClickListener {
            if (currentLessonIndex > 0) {
                currentLessonIndex--
                loadLesson(currentLessonIndex)
            } else {
                finish() // Go back to lesson list
            }
        }

        // Button: Next
        binding.btnNext.setOnClickListener {
            if (currentLessonIndex < lessonList.size - 1) {
                currentLessonIndex++
                loadLesson(currentLessonIndex)
            } else {
                // Last lesson — go to next language
                val currentLangIndex = LanguageManager.languages.indexOf(languageFolder)
                if (currentLangIndex != -1 && currentLangIndex < LanguageManager.languages.size - 1) {
                    val nextLanguage = LanguageManager.languages[currentLangIndex + 1]
                    val nextLessons = LessonRepository.getLessonsForLanguage(nextLanguage)

                    if (nextLessons.isNotEmpty()) {
                        currentLessonIndex = 0 // ✅ RESET the index
                        val intent = Intent(this, LessonDetailActivity::class.java)
                        intent.putExtra("languageFolder", nextLanguage)
                        intent.putExtra("lessonList", ArrayList(nextLessons))
                        intent.putExtra("lessonIndex", 0) // ✅ Start from beginning
                        startActivity(intent)
                        finish()

                } else {
                        Toast.makeText(this, "No lessons found for next language.", Toast.LENGTH_SHORT).show()
                    }
                } else {
                    Toast.makeText(this, "You've reached the end of all lessons!", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }

    private fun loadLesson(index: Int) {
        val lesson = lessonList[index]

        binding.lessonTitle.text = lesson.title

        val assetPath = "md/$languageFolder/${lesson.fileName}"

        try {
            val inputStream = assets.open(assetPath)
            val content = inputStream.bufferedReader().use { it.readText() }

            markwon.setMarkdown(binding.lessonContent, content)

        } catch (e: Exception) {
            binding.lessonContent.text = "Coming soon...!!!"
            Toast.makeText(this, "Content for this is coming soon.", Toast.LENGTH_SHORT).show()
            e.printStackTrace()
        }

        // Update button states & labels
        binding.btnPrevious.isEnabled = true
        binding.btnPrevious.text = if (index == 0) "Back to Lessons" else "Previous"
        binding.btnNext.text = if (index == lessonList.size - 1) "Next Language" else "Next"
    }

    private fun loadLessonsForLanguage(language: String): List<Lesson> {
        val lessons = mutableListOf<Lesson>()
        try {
            val lessonFiles = assets.list("md/$language") ?: return emptyList()
            for (file in lessonFiles) {
                val title = file.substringBeforeLast(".")
                lessons.add(Lesson(title, file))
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return lessons.sortedBy { it.title }
    }

    private fun spToPx(sp: Float): Int {
        return TypedValue.applyDimension(
            TypedValue.COMPLEX_UNIT_SP,
            sp,
            Resources.getSystem().displayMetrics
        ).toInt()
    }
}
