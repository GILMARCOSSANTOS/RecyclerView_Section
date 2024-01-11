package com.example.section_recyclerview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.section_recyclerview.R
import com.example.section_recyclerview.model.ModelChild

class AdapterParent(private val context: Context, val list: List<ModelChild>) :
    RecyclerView.Adapter<AdapterParent.MyViewHolder>() {

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val section = itemView.findViewById<TextView>(R.id.section)
        val childRecyclerView = itemView.findViewById<RecyclerView>(R.id.child_recycler_view)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterParent.MyViewHolder {
        val itemLista = LayoutInflater.from(context).inflate(
            R.layout.recycleview_child,
            parent, false
        )

        val holder = MyViewHolder(itemLista)
        return holder
    }

    override fun onBindViewHolder(holder: AdapterParent.MyViewHolder, position: Int) {
        holder.section.text = list[position].section

       // holder.childRecyclerView.adapter = AdapterChild(context, list[position].list)

                holder.childRecyclerView.apply {
            adapter= AdapterChild(context, list[position].list)
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }
}