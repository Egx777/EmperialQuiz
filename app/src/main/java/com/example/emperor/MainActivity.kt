package com.example.emperor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val exitBtn = findViewById<Button>(R.id.button2)
        val startBtn = findViewById<Button>(R.id.button)
        val intent: Intent = Intent(this,EmperialQuiz::class.java)

        startBtn.setOnClickListener {
            startActivity(intent)
        }

        exitBtn.setOnClickListener { exitApp() }

    }

    private fun exitApp() {
       finish()
    }


}