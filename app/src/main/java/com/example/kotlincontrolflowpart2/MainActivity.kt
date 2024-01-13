package com.example.kotlincontrolflowpart2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var result = ""
        val numbers = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        val cities = arrayOf("Dhaka, Tokyo")
        val countries = listOf<String>("Bangladesh, Japan, , Chyna, Korea")

//        for (country in countries) {
//            result += country + "\n"
//        }
        var index = 10
        while (index > 0) {
            result += index.toString() + "\n"

            index--
        }

        val tvResult = findViewById<TextView>(R.id.tvResult)
        tvResult.text = result

    }
}
