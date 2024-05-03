package com.example.allatwo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_moddel.imageView14

class moddel : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_moddel)
        imageView14.setOnClickListener {
            val intent = Intent(this, welcome::class.java)
            startActivity(intent)
        }
    }
}