package com.example.finaluri

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Geoscore: AppCompatActivity() {
    lateinit var home: Button




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.geoscore)



        findViewById<TextView>(R.id.score).text = intent?.extras?.getString("mark",
            "")
        home = findViewById(R.id.home)

        if(intent?.extras?.getString("mark", "") == "5"){
            findViewById<TextView>(R.id.xuti).text = "ყოჩაღ!"
        }


        home.setOnClickListener{
            val intentH = Intent(this, Quizz::class.java)
            finish()
            startActivity(intentH)
        }
    }
}
