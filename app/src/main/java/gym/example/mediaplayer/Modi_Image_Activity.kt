package gym.example.mediaplayer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mediaplayer.R
import kotlinx.android.synthetic.main.activity_modi_image.*

class Modi_Image_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_modi_image)

        ModiYoga.setOnClickListener {

            startActivity(Intent(this, Modi_Yoga::class.java))
        }

        shilpa.setOnClickListener {

            val intent= Intent(this, MainActivity::class.java)
            intent.putExtra("url","gt1K16AWdIg")
            intent.putExtra("days","yoga")
            startActivity(intent)
        }
    }
}