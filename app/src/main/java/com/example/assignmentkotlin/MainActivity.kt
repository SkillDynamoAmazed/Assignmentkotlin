package com.example.assignmentkotlin

import android.content.Intent
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.GridView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val categories = listOf("Electronics", "Clothing", "Books", "Beauty")
        val categoryGridView: GridView = findViewById(R.id.categoryGridView)

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, categories)
        categoryGridView.adapter = adapter

        categoryGridView.onItemClickListener = AdapterView.OnItemClickListener { _, _, position, _ ->
            val intent = Intent(this, ProductActivity::class.java)
            intent.putExtra("category", categories[position])
            startActivity(intent)
        }
    }
}
