package com.example.assignmentkotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import android.widget.ImageView

class ProductDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_detail)

        val productName = intent.getStringExtra("productName")
        val productTitle: TextView = findViewById(R.id.productTitle)
        productTitle.text = productName

        val productImage: ImageView = findViewById(R.id.productImage)
        productImage.setImageResource(R.drawable.shopping)
    }
}
