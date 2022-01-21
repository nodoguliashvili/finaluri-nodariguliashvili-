package com.example.finaluri

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import android.widget.EditText


class MainActivity : AppCompatActivity() {

    lateinit var email : EditText
    lateinit var password : EditText
    lateinit var login : Button
    lateinit var register : View


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        email = findViewById(R.id.emailET)
        password = findViewById(R.id.passwordET)
        login = findViewById(R.id.loginB)
        register = findViewById(R.id.registerTV)

        val x = intent.extras?.getString("emailI","")
        val y = intent.extras?.getString("passwordI","")
        val z = intent.extras?.getString("email","")
        val n = intent.extras?.getString("password","")

        login.setOnClickListener{
            if (email.text.toString() == "nodo" && password.text.toString() == "btu123") {
                Toast.makeText(this, "logged in", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, Quizz::class.java)
                finish()
                startActivity(intent)
            }


            if (email.text.toString() == x &&
                password.text.toString() == y ) {
                    Toast.makeText(this, "logged in", Toast.LENGTH_SHORT).show()
                    val intent1 = Intent(this, Quizz::class.java)
                    intent1.putExtra("email", x)
                    intent1.putExtra("password", y)
                    finish()
                    startActivity(intent1)
                }

            if (email.text.toString() == z &&
                password.text.toString() == n ) {
                Toast.makeText(this, "logged in", Toast.LENGTH_SHORT).show()
                val intent2 = Intent(this, Quizz::class.java)
                finish()
                startActivity(intent2)
            }

            else {
                Toast.makeText(this, "email or password is incorrect", Toast.LENGTH_SHORT).show()
            }
        }

        register.setOnClickListener{
            val intentR = Intent(this, Register::class.java)
            finish()
            startActivity(intentR)
        }
    }
}
