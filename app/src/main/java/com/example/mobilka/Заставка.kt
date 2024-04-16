package com.example.mobilka

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class Заставка : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.zastavka)
        val LinkToNextScreen: TextView = findViewById(R.id.SmartLab)

        LinkToNextScreen.setOnClickListener{
            val intent = Intent(this, Анализы::class.java)
            startActivity(intent)
        }
        }
    }
