package gym.daily.Workout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import gym.daily.Workout.RecyclerViewAll.FemaleRecyclerView

import kotlinx.android.synthetic.main.activity_day21_challenge.*


class Day21_Challenge : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_day21_challenge)
        val Arr=ArrayList<female_modal>().apply {
           add(female_modal("e2AAeteBWL8"))
           add(female_modal("zVNYxBintQg"))
           add(female_modal("yHafCHEtDBo"))
           add(female_modal("viakBf39XPo"))
           add(female_modal("RG8hl4o-QjU"))
           add(female_modal("xtEFVrwZFGU"))
           add(female_modal("z4SsYu-Wdts"))
           add(female_modal("ig_Clms1MGQ"))
           add(female_modal("NvxdRMSDng8"))
           add(female_modal("XRukpbshB54"))
           add(female_modal("69sVYIMdrrw"))
           add(female_modal("I77IMHFjBPA"))
           add(female_modal("Br_b5rYlJ_8"))
           add(female_modal("tD9zSH0IdjQ"))
           add(female_modal("BCkM1iVoAsE"))
           add(female_modal("l544gRZuTyA"))
           add(female_modal("R6bxU7A-I1I"))
           add(female_modal("Y1LamBOuCm8"))
           add(female_modal("hAHWMXL11LA"))
           add(female_modal("aYY-bWtAq8E"))
           add(female_modal("-5My-oQeq4o"))

        }
        Day21recyclerView.layoutManager=LinearLayoutManager(this)
       Day21recyclerView.adapter= FemaleRecyclerView(this,Arr)
    }
}