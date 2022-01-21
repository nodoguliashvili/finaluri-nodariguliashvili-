package com.example.finaluri

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class Math : AppCompatActivity() {

    lateinit var firstA : TextView
    lateinit var secondA : TextView
    lateinit var thirdA : TextView
    lateinit var fourthA : TextView
    lateinit var fifthA : TextView
    lateinit var finish : Button
    lateinit var mark : TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.mathemathics)

        ID()



        finish.setOnClickListener {
            check()
            val intentM = Intent(this, Mathscore::class.java)
            val x = mark.text.toString()
            intentM.putExtra("mark", x)
            finish()
            startActivity(intentM)
        }
    }


    fun ID(){
        firstA = findViewById(R.id.firstA)
        secondA = findViewById(R.id.secondA)
        thirdA = findViewById(R.id.thirdA)
        fourthA = findViewById(R.id.fourthA)
        fifthA = findViewById(R.id.fifthA)
        finish = findViewById(R.id.finish)
        mark = findViewById(R.id.mark)
    }


    fun check(){
        if (firstA.text.toString() == "15") {
            mark.text = (mark.text.toString().toInt() +1).toString()
        }

        if (secondA.text.toString() == "32") {
            mark.text = (mark.text.toString().toInt() +1).toString()
        }

        if (thirdA.text.toString() == "2") {
            mark.text = (mark.text.toString().toInt() +1).toString()
        }

        if (fourthA.text.toString() == "1") {
            mark.text = (mark.text.toString().toInt() +1).toString()
        }

        if (fifthA.text.toString() == "3") {
            mark.text = (mark.text.toString().toInt() +1).toString()
        }
    }
}





