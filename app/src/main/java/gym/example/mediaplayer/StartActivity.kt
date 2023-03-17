package gym.example.mediaplayer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mediaplayer.R
import kotlinx.android.synthetic.main.activity_start.*

class StartActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)

        Exercise.setOnClickListener {
            startActivity(Intent(this, Execise_home::class.java))
        }

        Yoga.setOnClickListener {
            startActivity(Intent(this, Modi_Image_Activity::class.java))
        }

        diet.setOnClickListener {
            startActivity(Intent(this, Diet_WebView::class.java))
        }
    }
}