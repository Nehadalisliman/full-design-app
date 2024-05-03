package com.example.allatwo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_crenewacc.button0011
import kotlinx.android.synthetic.main.activity_loginn.laytwo
import kotlinx.android.synthetic.main.login.layone

class crenewacc : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_crenewacc)
        button0011.setOnClickListener {
            val intent = Intent(this, loginn::class.java)
            startActivity(intent)

        }
        laytwo.setOnClickListener {
            val intent = Intent(this, crenewacc::class.java)
            startActivity(intent)

        }
    }
}