package com.example.allatwo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_splashthreee.buttonnextwo


class splashthreee : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashthreee)
        buttonnextwo.setOnClickListener {
            val intent = Intent(this, welcome::class.java)
            startActivity(intent)
        }
    }
}