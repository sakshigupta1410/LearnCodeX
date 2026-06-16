package com.learncodex.app

import android.app.Dialog
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment

class CorrectAnswerDialog(private val onNext: () -> Unit) : DialogFragment() {

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return AlertDialog.Builder(requireContext())
            .setTitle("🎉 Correct Answer!")
            .setMessage("Great job! You got it right.")
            .setCancelable(false) // Prevent dismiss by back button or outside touch
            .setPositiveButton("Next") { _, _ ->
                onNext()
            }
            .create()
    }
}
