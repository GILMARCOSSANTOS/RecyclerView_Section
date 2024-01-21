package com.example.section_recyclerview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.section_recyclerview.R
import com.example.section_recyclerview.model.ModelSessao

class AdapterSessao(private val context: Context, val listSessao: List<ModelSessao>) :
    RecyclerView.Adapter<AdapterSessao.MyViewHolder>() {

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val textViewSessao = itemView.findViewById<TextView>(R.id.txtVw_sessao_id)
        val recyclerViewSessao = itemView.findViewById<RecyclerView>(R.id.recyclerView_sessao_id)
    }

   override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterSessao.MyViewHolder {

        val itemLista = LayoutInflater.from(context).inflate(
            R.layout.recycleview_sessao,
            parent, false
        )

        val holder = MyViewHolder(itemLista)
        return holder
    }

    override fun onBindViewHolder(holder: AdapterSessao.MyViewHolder, position: Int) {

        holder.textViewSessao.text = listSessao[position].section

        holder.recyclerViewSessao.apply {
            adapter = AdapterItensGerais(context, listSessao[position].list)
        }
        // holder.childRecyclerView.adapter = AdapterChild(context, list[position].list)
    }

    override fun getItemCount(): Int {
        return listSessao.size
    }
}