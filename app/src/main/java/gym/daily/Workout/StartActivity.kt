package gym.daily.Workout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
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

    override fun onBackPressed() {
        val builder = AlertDialog.Builder(this)
        builder.setMessage("Do you want to exit ?")
        builder.setTitle("Alert !")
        builder.setIcon(R.drawable.exit_to_app_24)
        builder.setCancelable(false)
        builder.setInverseBackgroundForced(true)
        builder.setPositiveButton("Yes") {
                dialog, which -> finish()
        }

        builder.setNegativeButton("No") {
                dialog, which -> dialog.cancel()
        }
        val alertDialog = builder.create()
        alertDialog.show()
    }
}