package com.example.allatwo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_marka.imageView5
import kotlinx.android.synthetic.main.activity_splashone.buttonnextonecv

class splashone : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashone)
        buttonnextonecv.setOnClickListener {
            val intent = Intent(this, splatwo::class.java)
            startActivity(intent)

        }
    }
}