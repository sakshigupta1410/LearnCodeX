package com.learncodex.app

import android.app.Dialog
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment

class WrongAnswerDialog(private val onNext: () -> Unit) : DialogFragment() {

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return AlertDialog.Builder(requireContext())
            .setTitle("❌ Wrong Answer")
            .setMessage("Oops! That wasn't correct.\nDon't worry, try the next one.")
            .setCancelable(false)
            .setPositiveButton("Next") { _, _ ->
                onNext()
            }
            .create()
    }
}
