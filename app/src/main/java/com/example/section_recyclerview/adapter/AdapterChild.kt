package com.example.section_recyclerview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.section_recyclerview.R

class AdapterChild(private val context: Context, private val list: List<String>) :
    RecyclerView.Adapter<AdapterChild.MyViewHolder>() {

    inner class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val childText = itemView.findViewById<TextView>(R.id.child_text)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterChild.MyViewHolder {

        val itemLista = LayoutInflater.from(context).inflate(
            R.layout.item_recyclerview_child,
            parent, false
        )

        val holder = MyViewHolder(itemLista)
        return holder
    }

    override fun onBindViewHolder(holder: AdapterChild.MyViewHolder, position: Int) {

        holder.childText.text = list[position]
    }

    override fun getItemCount(): Int {
        return list.size
    }
}