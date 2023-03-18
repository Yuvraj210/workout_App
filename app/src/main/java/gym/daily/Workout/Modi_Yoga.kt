package gym.daily.Workout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_modi_yoga.*

class Modi_Yoga : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_modi_yoga)

        val Arr=ArrayList<exercise_Modalclass>().apply {

            add(exercise_Modalclass("Vrikshasana"))
            add(exercise_Modalclass("Trikonasana"))
            add(exercise_Modalclass("Tadasana"))
            add(exercise_Modalclass(" ArdhaChakrasana"))
            add(exercise_Modalclass("Padahastasana"))
            add(exercise_Modalclass("Bhadrasan"))
            add(exercise_Modalclass("Ustrasana"))
            add(exercise_Modalclass("Vakrasana"))
            add(exercise_Modalclass("Vajrasana"))
            add(exercise_Modalclass("Shashankasana"))
            add(exercise_Modalclass("Bhujangasana"))
            add(exercise_Modalclass("Shalabhasana"))
            add(exercise_Modalclass("Pawanmuktasana"))
            add(exercise_Modalclass("Setubandhasana"))
            add(exercise_Modalclass("NadiShodhan"))
            add(exercise_Modalclass("Dhyana"))
            add(exercise_Modalclass("Suryanamaskar"))
            add(exercise_Modalclass("NonStop Yoga "))

        }
        yogaRecyclerView.layoutManager= LinearLayoutManager(this)
       yogaRecyclerView.adapter= YogaRecyclerAdepter(this,Arr)
    }
}