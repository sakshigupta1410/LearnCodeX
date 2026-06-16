package com.learncodex.app

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.addCallback
import androidx.fragment.app.Fragment
import com.learncodex.app.databinding.FragmentAboutBinding

class AboutFragment : Fragment() {

    private var _binding: FragmentAboutBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentAboutBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.textViewAbout.text = """
                LearnCodeX is your pocket programming guide!
            
            🚀 Explore 25+ languages including Python, Java, C, Kotlin, HTML, CSS, PHP, JavaScript, SQL, and more.

            🧠 Read lessons, Take quizzes, and earn certificates.
            
            ❤️ Built for Learners, by Learners 🧑‍💻
                    LearnCodeX is created with love by Miss Sakshi Gupta to make coding education accessible, enjoyable, and rewarding for everyone.
                    
            LearnCodeX isn’t just another learning app — it’s your coding partner for life. 
            
            Start your journey today and become a confident coder with LearnCodeX!
        """.trimIndent()

        // Handle back press in fragment
        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner) {
            // Simply go back in fragment stack
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, HomeFragment())
                .commit()

        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}