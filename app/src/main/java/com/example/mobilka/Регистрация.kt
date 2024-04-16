package com.example.mobilka

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Регистрация : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.registr)
        val LinkToNextScreen: Button = findViewById(R.id.button)

        LinkToNextScreen.setOnClickListener{
            val intent = Intent(this, kodik::class.java)
            startActivity(intent)
        }
        }
    }
