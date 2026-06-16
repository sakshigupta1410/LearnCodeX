package com.learncodex.app

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.GridLayout
import android.widget.TextView
import android.widget.Toast
import androidx.activity.addCallback
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment
import com.learncodex.app.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding
    private lateinit var gridLayout: GridLayout
    private val cardMap = mutableMapOf<CardView, String>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root = binding.root

        gridLayout = root.findViewById(R.id.gridLayout)

        // Add all card references and their languages here
        addCard(R.id.cardPython, R.id.cardTitlePython, "Python")
        addCard(R.id.cardJava, R.id.cardTitleJava, "Java")
        addCard(R.id.cardC, R.id.cardTitleC, "C")
        addCard(R.id.cardCplusplus, R.id.cardTitleCPP, "CPP")
        addCard(R.id.cardKotlin, R.id.cardTitleKotlin, "Kotlin")
        addCard(R.id.cardHtml, R.id.cardTitleHtml, "HTML")
        addCard(R.id.cardPHP, R.id.cardTitlePhp, "PHP")
        addCard(R.id.cardDart, R.id.cardTitleDart, "Dart")

        // Newly added languages (➡️ these will show "Coming Soon!")
        addCard(R.id.cardJavaScript, R.id.cardTitleJavaScript, "JavaScript")
        addCard(R.id.cardCss, R.id.cardTitleCss, "CSS")
        addCard(R.id.cardReact, R.id.cardTitleReact, "React")
        addCard(R.id.cardNode, R.id.cardTitleNode, "Node.js")
        addCard(R.id.cardSwift, R.id.cardTitleSwift, "Swift")
        addCard(R.id.cardRuby, R.id.cardTitleRuby, "Ruby")
        addCard(R.id.cardGo, R.id.cardTitleGo, "Go")
        addCard(R.id.cardSql, R.id.cardTitleSql, "SQL")
        addCard(R.id.cardTypeScript, R.id.cardTitleTypeScript, "TypeScript")
        addCard(R.id.cardR, R.id.cardTitleR, "R")
        addCard(R.id.cardScala, R.id.cardTitleScala, "Scala")
        addCard(R.id.cardRust, R.id.cardTitleRust, "Rust")
        addCard(R.id.cardMatlab, R.id.cardTitleMatlab, "MATLAB")
        addCard(R.id.cardPerl, R.id.cardTitlePerl, "Perl")
        addCard(R.id.cardShell, R.id.cardTitleShell, "Shell")
        addCard(R.id.cardFlutter, R.id.cardTitleFlutter, "Flutter")
        addCard(R.id.cardCSharp, R.id.cardTitleCSharp, "C#")
        addCard(R.id.cardMySQL, R.id.cardTitleMySQL, "MySQL")

        // Filter logic
        binding.searchEditText.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {}
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(query: CharSequence?, start: Int, before: Int, count: Int) {
                val searchText = query.toString().trim().lowercase()
                filterCards(searchText)
            }
        })

        return root
    }

    private fun addCard(cardId: Int, titleId: Int, language: String) {
        val card = binding.root.findViewById<CardView>(cardId)
        val title = binding.root.findViewById<TextView>(titleId)

        cardMap[card] = language

        card.setOnClickListener {
            when (language) {
                "Python", "Java", "C", "CPP", "Kotlin", "HTML", "PHP", "Dart" -> {
                    // ✅ Open lessons normally
                    val intent = Intent(requireContext(), LessonListActivity::class.java)
                    intent.putExtra("LANGUAGE", language) // Pass the language to LessonListActivity
                    startActivity(intent)
                }
                else -> {
                    // 🚧 After Dart → Show Coming Soon
                    Toast.makeText(requireContext(), "$language lessons are coming soon!", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }

    private fun filterCards(searchText: String) {
        var found = false

        for ((card, lang) in cardMap) {
            if (lang.lowercase().contains(searchText)) {
                card.visibility = View.VISIBLE
                found = true
            } else {
                card.visibility = View.GONE
            }
        }

        // Show/hide "No Results Found!" text
        binding.noResultsText.visibility = if (found) View.GONE else View.VISIBLE
        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner) {
            // Replace CoursesFragment with HomeFragment
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, HomeFragment())
                .commit()
        }
    }
}