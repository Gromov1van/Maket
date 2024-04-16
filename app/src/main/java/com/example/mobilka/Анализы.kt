package com.example.mobilka

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class Анализы : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.analyze)
        val LinkToNextScreen: TextView = findViewById(R.id.Skip)

        LinkToNextScreen.setOnClickListener {
            val intent = Intent(this, Уведомления::class.java)
            startActivity(intent)
        }
        val LinkToNextScreen1: TextView = findViewById(R.id.Skip)

        LinkToNextScreen1.setOnClickListener {
            val intent = Intent(this, Уведомления::class.java)
            startActivity(intent)
        }
    }
}