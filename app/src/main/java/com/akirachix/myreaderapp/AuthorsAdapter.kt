package com.akirachix.myreaderapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.navigation.NavigationBarItemView

class AuthorsAdapter (var list:List<Author>):RecyclerView.Adapter<AuthorViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AuthorViewHolder {
        var itemView = LayoutInflater.from(parent.context).inflate(R.layout.reader_app,parent,false)
        return  AuthorViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: AuthorViewHolder, position: Int) {
        val author = list[position]
        holder.rvName.text = author.name
        holder.title.text = author.title
        holder.date.text = author.date
        holder.summary.text = author.sum

    }

    override fun getItemCount(): Int {
        return list.size
    }
}
class AuthorViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
    var rvName = itemView.findViewById<TextView>(R.id.rvname)
    var title = itemView.findViewById<TextView>(R.id.rvtitle)
    var date = itemView.findViewById<TextView>(R.id.rvdate)
    var summary = itemView.findViewById<TextView>(R.id.rvsummary)


}