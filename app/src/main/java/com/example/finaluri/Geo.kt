package com.example.finaluri

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Geo : AppCompatActivity() {

    lateinit var firstA : TextView
    lateinit var secondA : TextView
    lateinit var thirdA : TextView
    lateinit var fourthA : TextView
    lateinit var fifthA : TextView
    lateinit var finish : Button
    lateinit var mark : TextView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.geo)

        ID()



        finish.setOnClickListener {
            check()
            val intentG = Intent(this, Geoscore::class.java)
            val x = mark.text.toString()
            intentG.putExtra("mark", x)
            finish()
            startActivity(intentG)

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
        if (firstA.text.toString() == "shota rustavelma") {
            mark.text = (mark.text.toString().toInt() +1).toString()
        }
        if (firstA.text.toString() == "shota rustaveli") {
            mark.text = (mark.text.toString().toInt() +1).toString()
        }



        if (secondA.text.toString() == "iakob gogebashvilma") {
            mark.text = (mark.text.toString().toInt() +1).toString()
        }
        if (secondA.text.toString() == "iakob gogebashvili") {
            mark.text = (mark.text.toString().toInt() +1).toString()
        }



        if (thirdA.text.toString() == "ilia chavchavadzem") {
            mark.text = (mark.text.toString().toInt() +1).toString()
        }
        if (thirdA.text.toString() == "ilia chavchavadze") {
            mark.text = (mark.text.toString().toInt() +1).toString()
        }



        if (fourthA.text.toString() == "33") {
            mark.text = (mark.text.toString().toInt() +1).toString()
        }



        if (fifthA.text.toString() == "5") {
            mark.text = (mark.text.toString().toInt() +1).toString()
        }
        if (fifthA.text.toString() == "me-5") {
            mark.text = (mark.text.toString().toInt() +1).toString()
        }
        if (fifthA.text.toString() == "V") {
            mark.text = (mark.text.toString().toInt() +1).toString()
        }
    }
}