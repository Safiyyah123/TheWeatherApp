package com.example.theweatherapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val btnMainMenu: Button = findViewById<Button>(R.id.btnMainMenu)
        btnMainMenu.setOnClickListener {
            val intent = Intent(this, MainScreen::class.java)
            startActivity(intent)
        }
        val btnExit: Button = findViewById<Button>(R.id.btnExit)
        btnExit.setOnClickListener {
            val intent = Intent(this, MainScreen::class.java)
            System.exit(0)
        }
    }
}

