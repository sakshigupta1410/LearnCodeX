import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.learncodex.app.R
import com.learncodex.app.QuizQuestion

class QuizAdapter(private val questions: List<QuizQuestion>) :
    RecyclerView.Adapter<QuizAdapter.QuizViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): QuizViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_quiz_question, parent, false)
        return QuizViewHolder(view)
    }

    override fun onBindViewHolder(holder: QuizViewHolder, position: Int) {
        val question = questions[position]
        holder.questionText.text = question.question

        holder.optionsGroup.removeAllViews()
        for (option in question.options) {
            val radioButton = RadioButton(holder.itemView.context)
            radioButton.text = option
            holder.optionsGroup.addView(radioButton)
        }
    }

    override fun getItemCount(): Int = questions.size

    class QuizViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val questionText: TextView = itemView.findViewById(R.id.questionText)
        val optionsGroup: RadioGroup = itemView.findViewById(R.id.optionsGroup)
    }
}