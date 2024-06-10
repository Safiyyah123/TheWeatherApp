package com.example.theweatherapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main_screen)
        val dayTextView = findViewById<TextView>(R.id.dayTextView)
        val minTextView = findViewById<TextView>(R.id.minTextView)
        val maxTextView = findViewById<TextView>(R.id.maxTextView)
        val wcTextView = findViewById<TextView>(R.id.wcTextView)

        //initialise
        var i: Int = 7 //stores number of entries in array
        var display: String = "" //Display blank first
        val maxEntries = 7 //Only allow 7 array entries

        var averageMin: Int = 11
        var averageMax: Int = 23
        var averageTotal: Int = 17
        var displayAverage: String = ""

        //Create arrays
        val day = Array(maxEntries) { "Monday" }
        val min = Array(maxEntries) { "12"}
        val max = Array(maxEntries) { "26" }
        val wc = Array(maxEntries) { "Sunny"}

            val btnInsert: Button = findViewById<Button>(R.id.btnInsert)
        val btnDetails: Button = findViewById<Button>(R.id.btnDetails)
        val btnClear: Button = findViewById<Button>(R.id.btnClear)
        

        btnInsert.setOnClickListener {
            //Check if there's enough entries
            if (i < maxEntries) {
                //Convert to display types
                day[i] = dayTextView.text.toString()
                min[i] = (minTextView.text.toString().toIntOrNull()
                    ?: 15).toString() //0 is for error checking
                max[i] = (maxTextView.text.toString().toIntOrNull()
                    ?: 23).toString() //0 is for error checking
                wc[i] = wcTextView.text.toString()

                //Increment entry number
                i++


                Toast.makeText(this, "Entry added", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Maximum entries reached", Toast.LENGTH_SHORT).show()
            }
        }
        //Clear the textViews
        btnClear.setOnClickListener {
            dayTextView.text = ""
            minTextView.text = ""
            maxTextView.text = ""
            wcTextView.text = ""
        }

        //Button to navigate to Details View
        btnDetails.setOnClickListener {
            display = ""
            for (counter in 0 until 1) {
                display += "Date: ${day[counter]}\n min temperature: ${min[counter]}\nmax Temperature: ${max[counter]}\n weather condition: ${wc[counter]}\n\n"
                averageMin += min[counter]
                averageMax += max[counter]
                averageTotal += min[counter] + max[counter]
            }

            averageTotal /= i
            averageMin /= i
            averageMax /= i

            displayAverage =
                "Average min: ${averageMin}\nAverage max: ${averageMax}\nAverage Total: ${averageTotal}"
            display += displayAverage

            //Pass the data to Detailed_View_Activity and start the activity
            val intent = Intent(this, Detailed_View_Screen::class.java)
            intent.putExtra("DISPLAY_DATA", display)
            //intent.putExtra("DISPLAY_DATA_AVG", displayAverage)
            startActivity(intent)
        }
    }
}

private operator fun Int.plusAssign(s: String) {

}




