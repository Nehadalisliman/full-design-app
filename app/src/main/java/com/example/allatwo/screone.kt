package com.example.allatwo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_tawaf.imageView3

class screone : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screone)
        imageView3.setOnClickListener {
            val intent = Intent(this, welcome::class.java)
            startActivity(intent)
        }
    }
}