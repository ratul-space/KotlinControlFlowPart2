package com.example.kotlincontrolflowpart2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var result = ""
        for (index in 18 downTo 0) {
            result += index.toString() + "\n"
        }
        var tvResult = findViewById<TextView>(R.id.tvResult)
        tvResult.text = result

    }
}
