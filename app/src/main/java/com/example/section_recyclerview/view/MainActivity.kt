package com.example.section_recyclerview.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.section_recyclerview.R
import com.example.section_recyclerview.adapter.AdapterSessao
import com.example.section_recyclerview.model.ModelSessao

class MainActivity : AppCompatActivity() {

    val listModelSessao = mutableListOf<ModelSessao>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initList()

        val recyclerViewGeral = findViewById<RecyclerView>(R.id.recyclerView_geral_id)

        recyclerViewGeral.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = AdapterSessao(this@MainActivity, listModelSessao)
        }
    }

    private fun initList() {
        listModelSessao.add(ModelSessao("Data 15/06/2025", mutableListOf("1 - one", "1 - two", "1 - three", "1 - four", "1 - five")))
        listModelSessao.add(ModelSessao("Data 05/07/2025", mutableListOf("2 - one", "2 - four", "2 - three", "2 - four", "2 - five")))
        listModelSessao.add(ModelSessao("Data 07/08/2025", mutableListOf("3 - one", "3 - two", "3 - ten", "3 - four", "3 - five")))
        listModelSessao.add(ModelSessao("Data 09/09/2025", mutableListOf("4 - one", "4 - two", "4 - three", "4 - four", "4 - five")))
        listModelSessao.add(ModelSessao("Data 17/10/2025", mutableListOf("5 - one", "5 - nine", "5 - three", "5 - four", "5 - five")))
        listModelSessao.add(ModelSessao("Data 13/11/2025", mutableListOf("6 - twelve", "6 - two", "6 - three", "6 - four", "6 - five")))
        listModelSessao.add(ModelSessao("Data 25/12/2025", mutableListOf("7 - one", "7 - two", "7 - three", "7 - four", "7 - five")))
        listModelSessao.add(ModelSessao("Data 01/01/2026", mutableListOf("8 - one", "8 - two", "8 - three", "8 - four", "8 - five")))
        listModelSessao.add(ModelSessao("Data 21/03/2026", mutableListOf("9 - one", "9 - two", "9 - three", "9 - four", "9 - five")))
        listModelSessao.add(ModelSessao("Data 05/05/2026", mutableListOf("10 - one", "10 - two", "10 - three", "10 - four", "10 - five")))
        listModelSessao.add(ModelSessao("Data 17/06/2026", mutableListOf("11 - one", "11 - two", "11 - three", "11 - four", "11 - five")))
    }
}