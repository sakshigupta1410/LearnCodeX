package com.learncodex.app

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class LessonAdapter(
    private val context: Context,
    private val lessonList: List<Lesson>,
    private val languageKey: String,
    private val onItemClick: (Lesson) -> Unit
) : RecyclerView.Adapter<LessonAdapter.LessonViewHolder>() {

    private val bookmarkManager = BookmarkManager(context)

    inner class LessonViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val lessonTitle: TextView = itemView.findViewById(R.id.lessonTitle)
        val bookmarkIcon: ImageView = itemView.findViewById(R.id.bookmarkIcon)

        init {
            // Click on entire lesson item
            itemView.setOnClickListener {
                val position = adapterPosition
                if (position != RecyclerView.NO_POSITION) {
                    onItemClick(lessonList[position])
                }
            }

            // Click on bookmark icon
            bookmarkIcon.setOnClickListener {
                val position = adapterPosition
                if (position != RecyclerView.NO_POSITION) {
                    val lesson = lessonList[position]
                    val key = lesson.fileName

                    if (bookmarkManager.isBookmarked(languageKey, key)) {
                        bookmarkManager.removeBookmark(languageKey, key)
                        bookmarkIcon.setImageResource(R.drawable.ic_bookmark_outline)
                    } else {
                        bookmarkManager.addBookmark(languageKey, key)
                        bookmarkIcon.setImageResource(R.drawable.ic_bookmark_filled)
                    }
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LessonViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_lesson, parent, false)
        return LessonViewHolder(view)
    }

    override fun onBindViewHolder(holder: LessonViewHolder, position: Int) {
        val lesson = lessonList[position]
        holder.lessonTitle.text = lesson.title

        // Bookmark state based on fileName
        val isBookmarked = bookmarkManager.isBookmarked(languageKey, lesson.fileName)
        holder.bookmarkIcon.setImageResource(
            if (isBookmarked) R.drawable.ic_bookmark_filled
            else R.drawable.ic_bookmark_outline
        )
    }

    override fun getItemCount(): Int = lessonList.size
}
