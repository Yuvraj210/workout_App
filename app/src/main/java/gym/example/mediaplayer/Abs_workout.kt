package gym.example.mediaplayer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mediaplayer.R
import gym.example.mediaplayer.RecyclerViewAll.FemaleRecyclerView
import kotlinx.android.synthetic.main.activity_abs_workout.*

class Abs_workout : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_abs_workout)

        var Arr=ArrayList<female_modal>().apply {
             add(female_modal("N5N-t58LhCQ"))
             add(female_modal("sefs_GhBWfI"))
             add(female_modal("nKUcYBdMLjI"))
             add(female_modal("5Gv_N6v_bcc"))
             add(female_modal("nyC3ln6zr80"))
             add(female_modal("yHafCHEtDBo"))
             add(female_modal("RG8hl4o-QjU"))
             add(female_modal("wkr-jgvnmXo"))
             add(female_modal("py3-0cWYemg"))
             add(female_modal("gblLinJDvHE"))
             add(female_modal("jZhKPgjb0yg"))
             add(female_modal("R-C800jlH1E"))
             add(female_modal("fuQdKCihiTk"))
             add(female_modal("9oSv-9abEQM"))
        }
        Abs_RecyclerView.layoutManager=LinearLayoutManager(this)
        Abs_RecyclerView.adapter= FemaleRecyclerView(this,Arr)
    }
}