package gym.example.mediaplayer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mediaplayer.R
import kotlinx.android.synthetic.main.activity_male30day.*

class Male_30day : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_male30day)


        male30Day.setOnClickListener {
            startActivity(Intent(this, Male_Trainer_Activity::class.java))
        }

        male21Day.setOnClickListener {
            startActivity(Intent(this, Day21_Challenge::class.java))
        }
        male14Day.setOnClickListener {
            startActivity(Intent(this, Abs_workout::class.java))
        }
    }
}