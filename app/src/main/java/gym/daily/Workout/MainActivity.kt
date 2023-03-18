package gym.daily.Workout

import android.content.Context
import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.ads.AdListener
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.LoadAdError
import com.google.android.gms.ads.MobileAds
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

        MobileAds.initialize(this) {

            val adRequest= AdRequest.Builder().build()
            adView.loadAd(adRequest)
            adView.adListener = object: AdListener() {
                override fun onAdClicked() {
                    // Code to be executed when the user clicks on an ad.
                }

                override fun onAdClosed() {
                    // Code to be executed when the user is about to return
                    // to the app after tapping on an ad.
                }

                override fun onAdFailedToLoad(adError : LoadAdError) {
                    // Code to be executed when an ad request fails.
                }

                override fun onAdImpression() {
                    // Code to be executed when an impression is recorded
                    // for an ad.
                }

                override fun onAdLoaded() {
                    // Code to be executed when an ad finishes loading.
                }

                override fun onAdOpened() {
                    // Code to be executed when an ad opens an overlay that
                    // covers the screen.
                }
            }

        }

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

        share.setOnClickListener {
        shareApp(this)

        }

    }
    fun shareApp(context: Context) {
        val appPackageName = BuildConfig.APPLICATION_ID
        val appName = context.getString(R.string.app_name)
        val shareBodyText = "https://play.google.com/store/apps/details?id=$appPackageName"

        val sendIntent = Intent(Intent.ACTION_SEND).apply {
            type = "text/plain"
            putExtra(Intent.EXTRA_TITLE, appName)
            putExtra(Intent.EXTRA_TEXT, shareBodyText)
        }
        context.startActivity(Intent.createChooser(sendIntent, null))
    }

}


