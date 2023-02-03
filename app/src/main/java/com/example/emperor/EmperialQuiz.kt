package com.example.emperor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class EmperialQuiz : AppCompatActivity() {

    var bals: Int = 0
    var questionNo = 0
    var questionList = listOf(
        "1.Усами младенца глаголится ...\n\nA. Ересь \n\nB. Истина \n\nC. Кринж",
        "2.Вопрос означает ...\n\nA. Сомнение \n\nB. Ересь \n\nC. Вопрос",
        "3.Страх рождает ...\n\nA.Сомнение \n\nB.Верность \n\nC.Ересь",
        "4.Арбуз будешь?\n\nA.Да \n\nB.Нет \n\nC.Ересь")
    var rightAnswer = listOf(2,1,2,3)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_emperial_quiz)

        val questText = findViewById<TextView>(R.id.textView2)
        questText.setText(questionList[questionNo])

        val intent = Intent(this,MainActivity::class.java)

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
        if (questionNo > 3) finish()
        else{questText.setText(questionList[questionNo])}

    }
}