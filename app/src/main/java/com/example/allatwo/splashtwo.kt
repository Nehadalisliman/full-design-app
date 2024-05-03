package com.example.allatwo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_splashtwo.buttonnextone

class splashtwo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashtwo)
        buttonnextone.setOnClickListener {
            val intent = Intent(this, splashthreee::class.java)
            startActivity(intent)

        }
    }
}