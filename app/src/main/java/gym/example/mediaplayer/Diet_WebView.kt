package gym.example.mediaplayer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mediaplayer.R
import kotlinx.android.synthetic.main.activity_diet_web_view.*

class Diet_WebView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_diet_web_view)

        WebView.loadUrl("https://www.healthifyme.com/blog/7-day-gym-diet-plan-in-hindi/")
    }
}