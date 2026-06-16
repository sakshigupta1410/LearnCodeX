package com.learncodex.app

import java.io.Serializable

data class Lesson(
    val title: String,
    val fileName: String
) : Serializable
