package com.example.section_recyclerview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.section_recyclerview.R

class AdapterItensGerais(private val context: Context, private val listItensGerais: List<String>) :
    RecyclerView.Adapter<AdapterItensGerais.MyViewHolder>() {

    inner class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val textViewItensGerais = itemView.findViewById<TextView>(R.id.itens_gerais_id)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterItensGerais.MyViewHolder {

        val itemLista = LayoutInflater.from(context).inflate(
            R.layout.itens_gerais,
            parent, false
        )

        val holder = MyViewHolder(itemLista)
        return holder
    }

    override fun onBindViewHolder(holder: AdapterItensGerais.MyViewHolder, position: Int) {

        holder.textViewItensGerais.text = listItensGerais[position]
    }

    override fun getItemCount(): Int {
        return listItensGerais.size
    }
}