package gym.example.mediaplayer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mediaplayer.R
import kotlinx.android.synthetic.main.activity_execise_home.*

class Execise_home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_execise_home)

       TrainerMale.setOnClickListener {
           startActivity(Intent(this, Male_30day::class.java))
       }

        TrainerFemale.setOnClickListener {
            startActivity(Intent(this, Female_trainer::class.java))
        }
    }
}