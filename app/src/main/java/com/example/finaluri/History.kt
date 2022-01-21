package com.example.finaluri

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class History : AppCompatActivity() {

    lateinit var firstA : TextView
    lateinit var secondA : TextView
    lateinit var thirdA : TextView
    lateinit var fourthA : TextView
    lateinit var fifthA : TextView
    lateinit var finish : Button
    lateinit var mark : TextView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.history)

        ID()



        finish.setOnClickListener {
            check()
            val intentHi = Intent(this, Hscore::class.java)
            val x = mark.text.toString()
            intentHi.putExtra("mark", x)
            finish()
            startActivity(intentHi)

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
        if (firstA.text.toString() == "XII") {
            mark.text = (mark.text.toString().toInt() +1).toString()
        }
        if (firstA.text.toString() == "me-12") {
            mark.text = (mark.text.toString().toInt() +1).toString()
        }
        if (firstA.text.toString() == "12") {
            mark.text = (mark.text.toString().toInt() +1).toString()
        }



        if (secondA.text.toString() == "1121") {
            mark.text = (mark.text.toString().toInt() +1).toString()
        }
        if (secondA.text.toString() == "1121 wels") {
            mark.text = (mark.text.toString().toInt() +1).toString()
        }
        if (secondA.text.toString() == "1121 tsels") {
            mark.text = (mark.text.toString().toInt() +1).toString()
        }



        if (thirdA.text.toString() == "vaxtang gorgasali") {
            mark.text = (mark.text.toString().toInt() +1).toString()
        }
        if (thirdA.text.toString() == "vakhtang gorgasali") {
            mark.text = (mark.text.toString().toInt() +1).toString()
        }
        if (thirdA.text.toString() == "vakhtang gorgasalma") {
            mark.text = (mark.text.toString().toInt() +1).toString()
        }
        if (thirdA.text.toString() == "vaxtang gorgasalma") {
            mark.text = (mark.text.toString().toInt() +1).toString()
        }



        if (fourthA.text.toString() == "11-13") {
            mark.text = (mark.text.toString().toInt() +1).toString()
        }
        if (fourthA.text.toString() == "XI-XIII") {
            mark.text = (mark.text.toString().toInt() +1).toString()
        }



        if (fifthA.text.toString() == "zviad gamsaxurdia") {
            mark.text = (mark.text.toString().toInt() +1).toString()
        }
        if (fifthA.text.toString() == "zviad gamsakhurdia") {
            mark.text = (mark.text.toString().toInt() +1).toString()
        }
    }
}