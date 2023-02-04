package com.example.emperor

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import javax.sql.DataSource

class EmperialQuiz : AppCompatActivity() {
    var questionNo = 0
    val questionList = DataSource().questions()
    lateinit var antent: Intent
    var rightAnswer = listOf(2,1,2,3)
    var bals: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_emperial_quiz)

        val questText = findViewById<TextView>(R.id.textView2)
        questText.setText(questionList[questionNo])

        antent= Intent(this, ResultScreenEmperor::class.java)

        val buttonA = findViewById<Button>(R.id.button2)
        val buttonB = findViewById<Button>(R.id.button5)
        val buttonC = findViewById<Button>(R.id.button6)


        buttonA.setOnClickListener {
            showToast(1, questText)
        }
        buttonB.setOnClickListener {
            showToast(2, questText)
        }
        buttonC.setOnClickListener {
            showToast(3, questText)
        }

    }
    fun showToast(answer: Int, questText: TextView) {
        if (answer == rightAnswer[questionNo]) {
            Toast.makeText(applicationContext, "ПРАВИЛЬНО!", Toast.LENGTH_SHORT).show()
           bals++
            updateQ(questText)
        } else {
            Toast.makeText(applicationContext, "ОТВЕТ НЕ ВЕРНЫЙ", Toast.LENGTH_SHORT).show()
            updateQ(questText)
        }
    }

    fun updateQ(questText:TextView) {
        questionNo++
        if (questionNo > 3) {
            antent.putExtra("bals", bals)
            startActivity(antent)
            finish()
        }
        else{questText.setText(questionList[questionNo])}

    }
}