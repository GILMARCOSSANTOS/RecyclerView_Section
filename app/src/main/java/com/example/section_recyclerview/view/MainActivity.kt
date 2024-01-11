package com.example.section_recyclerview.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.section_recyclerview.R
import com.example.section_recyclerview.adapter.AdapterParent
import com.example.section_recyclerview.model.ModelChild

class MainActivity : AppCompatActivity() {

    val listModelParent = mutableListOf<ModelChild>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initList()

        val mainRcclrVw = findViewById<RecyclerView>(R.id.main_recyclerView)

        mainRcclrVw.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = AdapterParent(this@MainActivity, listModelParent)
        }
    }
    

    private fun initList() {
        listModelParent.add(ModelChild("Section 1", mutableListOf("1 - one", "1 - two", "1 - three", "1 - four", "1 - five")))
        listModelParent.add(ModelChild("Section 2", mutableListOf("2 - one", "2 - four", "2 - three", "2 - four", "2 - five")))
        listModelParent.add(ModelChild("Section 3", mutableListOf("3 - one", "3 - two", "3 - ten", "3 - four", "3 - five")))
        listModelParent.add(ModelChild("Section 4", mutableListOf("4 - one", "4 - two", "4 - three", "4 - four", "4 - five")))
        listModelParent.add(ModelChild("Section 5", mutableListOf("5 - one", "5 - nine", "5 - three", "5 - four", "5 - five")))
        listModelParent.add(ModelChild("Section 6", mutableListOf("6 - twelve", "6 - two", "6 - three", "6 - four", "6 - five")))
        listModelParent.add(ModelChild("Section 7", mutableListOf("7 - one", "7 - two", "7 - three", "7 - four", "7 - five")))
        listModelParent.add(ModelChild("Section 8", mutableListOf("8 - one", "8 - two", "8 - three", "8 - four", "8 - five")))
        listModelParent.add(ModelChild("Section 9", mutableListOf("9 - one", "9 - two", "9 - three", "9 - four", "9 - five")))
        listModelParent.add(ModelChild("Section 10", mutableListOf("10 - one", "10 - two", "10 - three", "10 - four", "10 - five")))
        listModelParent.add(ModelChild("Section 11", mutableListOf("11 - one", "11 - two", "11 - three", "11 - four", "11 - five")))
    }
}