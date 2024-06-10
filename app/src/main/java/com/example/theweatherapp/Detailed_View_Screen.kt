package com.example.theweatherapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Detailed_View_Screen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detailed_view_screen)

        val btnMainMenu: Button = findViewById<Button>(R.id.btnMainMenu)
        val detailsTV = findViewById<TextView>(R.id.detailsTV)
        val displayData = intent.getStringExtra("DISPLAY_DATA")
        detailsTV.text = displayData


        //val tvAvg = findViewById<TextView>(R.id.tvAvg)
        //val displayAverage = Intent.getStringExtra("DISPLAY_DATA_AVG")
        //tvAvg.text = displayAverage

        btnMainMenu.setOnClickListener {
            //start activity_main
            val intent = Intent(this, MainScreen::class.java)
            startActivity(intent)
        }
    }
}