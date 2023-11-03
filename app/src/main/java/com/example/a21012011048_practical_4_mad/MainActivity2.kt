package com.example.a21012011048_practical_4_mad

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val button_login=findViewById<Button>(R.id.button_login)
        button_login.setOnClickListener{
            val intent6= Intent(this,MainActivity::class.java)
            startActivity(intent6)
        }
    }
}