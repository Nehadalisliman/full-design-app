package com.example.allatwo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_marka.imageView5

class shakawy : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shakawy)
        imageView5.setOnClickListener {
            val intent = Intent(this, welcome::class.java)
            startActivity(intent)

        }
    }
}