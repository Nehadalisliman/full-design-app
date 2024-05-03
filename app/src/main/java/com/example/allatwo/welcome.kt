package com.example.allatwo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_welcome.imageView2
import kotlinx.android.synthetic.main.activity_welcome.imageView6
import kotlinx.android.synthetic.main.activity_welcome.layark
import kotlinx.android.synthetic.main.activity_welcome.laythree
import kotlinx.android.synthetic.main.activity_welcome.twff

class welcome : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
        imageView2.setOnClickListener {
            val intent = Intent(this, sdbar::class.java)
            startActivity(intent)
        }
        laythree.setOnClickListener {
            val intent = Intent(this, tawaf::class.java)
            startActivity(intent)
        }
        twff.setOnClickListener {
            val intent = Intent(this, sugtwafk::class.java)
            startActivity(intent)
        }
        imageView6.setOnClickListener {
            val intent = Intent(this, sugtwafk::class.java)
            startActivity(intent)
        }
        layark.setOnClickListener {
            val intent = Intent(this, numbersthmk::class.java)
            startActivity(intent)
        }
    }
}