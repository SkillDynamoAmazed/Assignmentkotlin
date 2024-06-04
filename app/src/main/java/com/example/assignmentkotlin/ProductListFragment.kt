package com.example.assignmentkotlin

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ProductListFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_product_list, container, false)
        val recyclerView: RecyclerView = view.findViewById(R.id.recyclerView)

        recyclerView.layoutManager = LinearLayoutManager(activity)
        val products = listOf("Product 1", "Product 2", "Product 3")
        val adapter = ProductAdapter(products) {
            val intent = Intent(activity, ProductDetailActivity::class.java)
            intent.putExtra("productName", it)
            startActivity(intent)
        }
        recyclerView.adapter = adapter

        return view
    }
}
