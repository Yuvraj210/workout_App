package gym.example.mediaplayer.RecyclerViewAll

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import gym.example.mediaplayer.MainActivity
import com.example.mediaplayer.R
import gym.example.mediaplayer.female_modal
import kotlinx.android.synthetic.main.female_row.view.*

class FemaleRecyclerView(val context: Context, val Arr: ArrayList<female_modal>):
    RecyclerView.Adapter<FemaleRecyclerView.View_holder>() {
    class View_holder( item: View): RecyclerView.ViewHolder(item) {

        var nameE=item.fexename
        val fcardId=item.fecardId


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): View_holder {
        return View_holder(LayoutInflater.from(context).inflate(R.layout.female_row,parent,false))
    }

    override fun getItemCount(): Int {
        return Arr.size
    }

    override fun onBindViewHolder(holder: View_holder, position: Int) {
        holder.nameE.text="Day ${position+1}"

        holder.fcardId.setOnClickListener {

            put_detail(Arr[position].url,"Day ${position+1}")


        }
    }
    fun put_detail(url:String,days:String) {
        val intent= Intent(context, MainActivity::class.java)
        intent.putExtra("url",url)
        intent.putExtra("days",days)
        context.startActivity(intent)
    }
}