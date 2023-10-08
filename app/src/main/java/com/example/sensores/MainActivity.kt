package com.example.sensores

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var  btn1 : Button
    private lateinit var  btn2 : Button
    private lateinit var  btn3 : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn1 = findViewById(R.id.button)
        btn2 = findViewById(R.id.btnluz)
        btn3 = findViewById(R.id.btnrpoximity)

        //accelerometro
        btn1.setOnClickListener {
            val intent = Intent(this, accelerometro::class.java)
            startActivity(intent)
        }

        //ligth
        btn2.setOnClickListener {
            val intent = Intent(this, light::class.java)
            startActivity(intent)
        }
        btn3.setOnClickListener {
            val intent = Intent(this, Proximity::class.java)
            startActivity(intent)
        }
    }

}