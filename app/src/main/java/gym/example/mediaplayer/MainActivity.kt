package gym.example.mediaplayer

import android.content.pm.ActivityInfo
import android.content.res.Configuration
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.RelativeLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.mediaplayer.R
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.YouTubePlayerFullScreenListener
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
     var youTubePlayerView: YouTubePlayerView? =null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT

//      setPlayerLayoutParams()

        var id=intent.getStringExtra("url")
        val day=intent.getStringExtra("days")

        DayNumber.text=day
        youTubePlayerView = findViewById<YouTubePlayerView>(R.id.activity_main_youtubePlayerView)
//        lifecycle.addObserver(youTubePlayerView)
        youTubePlayerView?.addYouTubePlayerListener(object : AbstractYouTubePlayerListener() {
            override fun onReady(youTubePlayer: YouTubePlayer) {
                val videoId =id!!
                youTubePlayer.loadVideo(videoId, 0f)

            }


        })

        youTubePlayerView?.addFullScreenListener(object : YouTubePlayerFullScreenListener {
            override fun onYouTubePlayerEnterFullScreen() {
                requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE
            }

            override fun onYouTubePlayerExitFullScreen() {
                requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_SENSOR
            }
        })

    }


}


