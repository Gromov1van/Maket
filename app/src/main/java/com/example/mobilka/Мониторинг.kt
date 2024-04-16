package com.example.mobilka

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class Мониторинг : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.monitoring)
        val LinkToNextScreen: TextView = findViewById(R.id.Skip)

        LinkToNextScreen.setOnClickListener {
            val intent = Intent(this, Регистрация::class.java)
            startActivity(intent)
        }
    }
}