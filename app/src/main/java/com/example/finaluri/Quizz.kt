package com.example.finaluri

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class Quizz : AppCompatActivity() {

    lateinit var math : Button
    lateinit var history : Button
    lateinit var geo : Button
    lateinit var logout : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.quizz)

        math = findViewById(R.id.math)
        history = findViewById(R.id.history)
        geo = findViewById(R.id.geo)
        logout = findViewById(R.id.logout)

        val x = intent.extras?.getString("email","")
        val y = intent.extras?.getString("password","")

        logout.setOnClickListener{
            Toast.makeText(this, "logged out", Toast.LENGTH_SHORT).show()
            val intent1 = Intent(this, MainActivity::class.java)
            intent1.putExtra("email", x)
            intent1.putExtra("password", y)
            finish()
            startActivity(intent1)
        }

        math.setOnClickListener{
            val intent2 = Intent(this, Math::class.java)
            startActivity(intent2)
        }

        history.setOnClickListener{
            val intent3 = Intent(this, History::class.java)
            startActivity(intent3)
        }

        geo.setOnClickListener{
            val intent4 = Intent(this, Geo::class.java)
            startActivity(intent4)
        }
    }
}
