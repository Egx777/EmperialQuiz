package com.example.emperor

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ResultScreenEmperor : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result_screen_emperor)
        val intent: Intent = intent
        val questionList = DataSource().questions()
        val bals = intent.getIntExtra("bals", 0)
        val img = findViewById<ImageView>(R.id.imageView)
        val text = findViewById<TextView>(R.id.textView4)

        if (bals>=questionList.size*0.75){
            img.setImageResource(R.drawable.tyk)
            text.text ="ВЫ ВЕРНЫ ИМПЕРАТОРУ!"
        }
        else{
            img.setImageResource(R.drawable.free_png_ru_43)
            text.text ="ГОРИ ЕРЕТИК!"
        }

    }
}