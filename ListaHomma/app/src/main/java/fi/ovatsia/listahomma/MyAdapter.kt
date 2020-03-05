package fi.ovatsia.listahomma

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.my_text_view.view.*

class MyAdapter (private val myDataset: ArrayList<Person>) :
    RecyclerView.Adapter<MyAdapter.MyViewHolder>() {
    override fun getItemCount(): Int {
        return myDataset.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.textView.textView.text = myDataset[position]._Name
        holder.textView.textView2.text = myDataset[position]._Age.toString()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        var textView = LayoutInflater.from(parent.context).inflate(R.layout.my_text_view, parent, false)
        return MyViewHolder(textView)
    }

    class MyViewHolder (val textView: View) : RecyclerView.ViewHolder(textView)

}