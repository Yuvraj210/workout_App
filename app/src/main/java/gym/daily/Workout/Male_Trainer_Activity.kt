package gym.daily.Workout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import gym.daily.Workout.RecyclerViewAll.FemaleRecyclerView
import kotlinx.android.synthetic.main.activity_male_trainer.*

class Male_Trainer_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_male_trainer)

        val Arr=ArrayList<female_modal>().apply {
           add(female_modal("kdpHMdFScm8"))
           add(female_modal("RHPWOileKEk"))
           add(female_modal("Ns1idqgfAoM"))
           add(female_modal("KhB0pmXsKGQ"))
           add(female_modal("UVJSiuWBNYM"))
           add(female_modal("k5I6nRfBt1k"))
           add(female_modal("PK7qdVMx6Vg"))
           add(female_modal("DwOxd4uV0J4"))
           add(female_modal("bjU4pXWclP4"))
           add(female_modal("HLSTgYqDBWA"))
           add(female_modal("Y74G4ji175s"))
           add(female_modal("Jx8g4-aSsm4"))
           add(female_modal("A7KsyauBuM0"))
           add(female_modal("I5mnFZNq33w"))
           add(female_modal("kefyl7qax1I"))
           add(female_modal("4VkrbkAm15E"))
           add(female_modal("QzBicAH2s-w"))
           add(female_modal("J7OpXC_1gUA"))
           add(female_modal("tOWfExv_hIw"))
           add(female_modal("9MYeyEV5u6Q"))
           add(female_modal("yLqb14jPNWg"))
           add(female_modal("CevoW5HpM9o"))
           add(female_modal("szPsolBU21M"))
           add(female_modal("-m6ZmtTvY4A"))
           add(female_modal("QWS6hRiIHgM"))
           add(female_modal("PK7qdVMx6Vg"))
           add(female_modal("DwOxd4uV0J4"))
           add(female_modal("bjU4pXWclP4"))
           add(female_modal("HLSTgYqDBWA"))
           add(female_modal("tOWfExv_hIw"))

//
        }
        maleRecyclerView.layoutManager= LinearLayoutManager(this)
        maleRecyclerView.adapter= FemaleRecyclerView(this,Arr)

    }
}