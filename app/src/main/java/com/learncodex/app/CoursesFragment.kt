package com.learncodex.app

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.addCallback
import androidx.fragment.app.Fragment
import com.learncodex.app.databinding.FragmentAboutBinding

class CoursesFragment : Fragment() {
    private var _binding: FragmentAboutBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentAboutBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.textViewAbout.text = """
            Stay Tuned for the upcoming Courses of - 
            📱 Flutter App Development
            🧠 Machine Learning for Beginners
            🎮 Game Dev with Unity
            📊 Data Science with R
        """.trimIndent()
        // Handle back press for this fragment
        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner) {
            // Replace CoursesFragment with HomeFragment
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, HomeFragment())
                .commit()
        }
    }
}
