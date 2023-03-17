package gym.example.mediaplayer

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mediaplayer.R
import kotlinx.android.synthetic.main.exercise.view.*

class YogaRecyclerAdepter(val context: Context, val Arr: ArrayList<exercise_Modalclass>):
    RecyclerView.Adapter<YogaRecyclerAdepter.View_holder>() {
    class View_holder(val item: View): RecyclerView.ViewHolder(item) {

        var nameE=item.exename
        val cardId=item.cardId


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): View_holder {
        return View_holder(LayoutInflater.from(context).inflate(R.layout.exercise,parent,false))
    }

    override fun getItemCount(): Int {
        return Arr.size
    }

    override fun onBindViewHolder(holder: View_holder, position: Int) {
        holder.nameE.text=Arr[position].exename


        holder.cardId.setOnClickListener {

            when(position){

                0->{
                    put_detail("fIF016JROiA","Vrikshasana")
                }

                1->{
                    put_detail("misHjEvOskI","Trikonasana")
                }

                2->{
                    put_detail("QM9x8ZpaYPc","Tadasana")
                }

                3->{
                    put_detail("i_ix1f99Vn4"," Ardha\n Chakrasana")
                }

                4->{
                    put_detail("_oM_OGcaSRQ","Padahastasana")
                }

                5->{
                    put_detail("X-oPQ9eO360","Bhadrasan")
                }

                6->{
                    put_detail("JDzDfraiR7U","Ustrasana")
                }

                7->{
                    put_detail("HYq5Ao1LOAk","Vakrasana")
                }

                8->{
                    put_detail("GDwDN0DUNm8","Vajrasana")
                }

                9->{
                    put_detail("i7460Bqvz3Q","Shashankasana")
                }

                10->{
                    put_detail("-HgeZztTSec","Bhujangasana")
                }

                11->{
                    put_detail("dkCiQuLwI1U","Shalabhasana")
                }

                12->{
                    put_detail("6w4chpJaQl4","Pawan\nmuktasana")
                }

                13->{
                    put_detail("xIMRYcA7TkA","Setu\nbandhasana")
                }

                14->{
                    put_detail("TSvxys_Ywq0","Nadi\nShodhan")
                }

                15->{
                    put_detail("-73jLhEosSQ","Dhyana")
                }

                16->{
                    put_detail("riURtZa6MhU","Surya\nnamaskar")
                }

                17->{
                    put_detail("7zY9A28YmFE","Yoga with Modi")
                }


            }

        }

    }
    fun put_detail(url:String,days:String) {
        val intent= Intent(context, MainActivity::class.java)
        intent.putExtra("url",url)
        intent.putExtra("days",days)
        context.startActivity(intent)
    }
}