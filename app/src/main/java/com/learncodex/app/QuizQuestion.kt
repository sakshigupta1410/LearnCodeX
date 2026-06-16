package com.learncodex.app

data class QuizQuestion(val question: String,
                        val options: List<String>,
                        val correctAnswerIndex: Int )
