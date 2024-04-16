package com.example.mobilka

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class Уведомления : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.message)
        val linkToNextSmart: TextView = findViewById(R.id.Skip)

        linkToNextSmart.setOnClickListener {
            val intent = Intent(this, Мониторинг::class.java)
            startActivity(intent)
        }
    }
}