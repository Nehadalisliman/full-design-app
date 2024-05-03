package com.example.allatwo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_marka.button55
import kotlinx.android.synthetic.main.activity_marka.grrideone
import kotlinx.android.synthetic.main.activity_marka.imageView5

class marka : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_marka)
        button55.setOnClickListener {
            val intent = Intent(this, marka::class.java)
            startActivity(intent)
        }
        imageView5.setOnClickListener {
            val intent = Intent(this, welcome::class.java)
            startActivity(intent)
        }
        grrideone.setOnClickListener {
            val intent = Intent(this, moddel::class.java)
            startActivity(intent)
        }
    }
}