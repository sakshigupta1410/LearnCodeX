package com.learncodex.app

import android.content.Context
import android.content.SharedPreferences

class BookmarkManager(context: Context) {

    private val prefs: SharedPreferences =
        context.getSharedPreferences("bookmarks_prefs", Context.MODE_PRIVATE)

    // Helper: Language-specific key
    private fun getKey(languageKey: String): String {
        return "bookmarks_$languageKey"
    }

    // Save a bookmark
    fun addBookmark(languageKey: String, topic: String) {
        val bookmarks = getBookmarks(languageKey).toMutableSet()
        bookmarks.add(topic)
        prefs.edit().putStringSet(getKey(languageKey), bookmarks).apply()
    }

    // Remove a bookmark
    fun removeBookmark(languageKey: String, topic: String) {
        val bookmarks = getBookmarks(languageKey).toMutableSet()
        bookmarks.remove(topic)
        prefs.edit().putStringSet(getKey(languageKey), bookmarks).apply()
    }

    // Get all bookmarks for a language
    fun getBookmarks(languageKey: String): Set<String> {
        return prefs.getStringSet(getKey(languageKey), emptySet()) ?: emptySet()
    }

    // Check if a topic is bookmarked in a language
    fun isBookmarked(languageKey: String, topic: String): Boolean {
        return getBookmarks(languageKey).contains(topic)
    }
}
