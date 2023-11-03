package com.example.a21012011048_practical_4_mad

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity3 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        val regbtn=findViewById<Button>(R.id.regbtn)
        regbtn.setOnClickListener {
            val intent7 = Intent(this, MainActivity::class.java)
            startActivity(intent7)
        }
    }
}