package com.example.allatwo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sdbar.button9
import kotlinx.android.synthetic.main.activity_sdbar.imageButton5
import kotlinx.android.synthetic.main.activity_sdbar.laycont
import kotlinx.android.synthetic.main.activity_sdbar.layknmore
import kotlinx.android.synthetic.main.activity_sdbar.shkawy

class sdbar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sdbar)
        imageButton5.setOnClickListener {
            val intent = Intent(this, welcome::class.java)
            startActivity(intent)

        }
        button9.setOnClickListener {
            val intent = Intent(this, loginn::class.java)
            startActivity(intent)

        }
        laycont.setOnClickListener {
            val intent = Intent(this, contus::class.java)
            startActivity(intent)

        }
        layknmore.setOnClickListener {
            val intent = Intent(this, knowmore::class.java)
            startActivity(intent)

        }
        shkawy.setOnClickListener {
            val intent = Intent(this, shakawy::class.java)
            startActivity(intent)

        }
    }
}