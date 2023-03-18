package gym.daily.Workout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import gym.daily.Workout.RecyclerViewAll.FemaleRecyclerView
import kotlinx.android.synthetic.main.activity_female_trainer.*

class Female_trainer : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_female_trainer)

        val Arr=ArrayList<female_modal>().apply {
          add(female_modal("KrY2Kv_BYKo"))
          add(female_modal("p1CjITh1HwY"))
          add(female_modal("rlXo5NrzrqY"))
          add(female_modal("OvjNwCOY9iY"))
          add(female_modal("bc-LyJHcDzQ"))
          add(female_modal("mu5fdPjakr4"))
          add(female_modal("ZzyGMpmy9i4"))
          add(female_modal("SLiyANohjjM"))
          add(female_modal("6zoo432l-uw"))
          add(female_modal("32-NGiZls-s"))
          add(female_modal("nyLKdD5ViEA"))
          add(female_modal("aG_hbMNDygQ"))
          add(female_modal("HyLhodyKTAc"))
          add(female_modal("xXldsFkYIqs"))
          add(female_modal("vFmr2mgTWhI"))
          add(female_modal("05DW0Q5bCKE"))
          add(female_modal("nFTNTpmvT5s"))
          add(female_modal("2a3dll_Zo2o"))
          add(female_modal("FduCQG5Gevs"))
          add(female_modal("FP_RSwqM-6Q"))
          add(female_modal("qXyT8sE49Aw"))
          add(female_modal("3ARa0s4SiRk"))
          add(female_modal("xvvUFNtDYcI"))
          add(female_modal("pkDsZ813yNU"))
          add(female_modal("M7dRriDOmRA"))
          add(female_modal("JBpRA0TFx-Y"))
          add(female_modal("BZcVeDTu_8Q"))
          add(female_modal("mDJtvDrik2Y"))
          add(female_modal("-uh2cJ4EfGQ"))
          add(female_modal("Wdnn-Vwsraw"))

        }

        femaleRecyclerView.layoutManager= LinearLayoutManager(this)
        femaleRecyclerView.adapter= FemaleRecyclerView(this,Arr)
    }
}