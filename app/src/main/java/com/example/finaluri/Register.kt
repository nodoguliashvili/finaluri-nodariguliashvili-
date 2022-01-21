package com.example.finaluri

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

import androidx.appcompat.app.AppCompatActivity

class Register: AppCompatActivity() {

    lateinit var name : EditText
    lateinit var lastname : EditText
    lateinit var emailR : EditText
    lateinit var passwordR : EditText
    lateinit var sr : EditText
    lateinit var register : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.register)

        id()


        register.setOnClickListener{
            var x = 0

            if (name.text.isEmpty()) {
                x += 1

            }

            if (lastname.text.isEmpty()) {
                x += 1
            }

            if (emailR.text.isEmpty()) {
                x += 1
            }

            if (passwordR.text.isEmpty()) {
                x += 1
            }

            if (sr.text.isEmpty()) {
                x += 1
            }

            if(x == 0){
                var y = 0
                if (passwordR.text.length < 8) {
                    Toast.makeText(this,
                        "პაროლი უნდა შედგებოდეს მინიმუმ რვა სიმბოლოსგან",
                        Toast.LENGTH_SHORT).show()
                    y += 1
                }

                if (emailR.text.toString() == passwordR.text.toString()){
                    Toast.makeText(this,
                        "იმეილი და პაროლი არუნდა ემთხვეოდეს ერთმანეთს",
                        Toast.LENGTH_SHORT).show()
                    y += 1
                }

                if(y == 0){
                    val emailI = emailR.text.toString()
                    val passwordI = passwordR.text.toString()
                    val intentL = Intent(this, MainActivity::class.java)
                    intentL.putExtra("emailI", emailI)
                    intentL.putExtra("passwordI", passwordI)
                    finish()
                    startActivity(intentL)

                }

            }

            if (x > 0){
                Toast.makeText(this, "შეავსეთ ყველა გრაფა!", Toast.LENGTH_SHORT).show()
            }
        }




    }

fun id() {
    name = findViewById(R.id.name)
    lastname = findViewById(R.id.lastname)
    emailR = findViewById(R.id.emailR)
    passwordR = findViewById(R.id.passwordR)
    sr = findViewById(R.id.SR)
    register = findViewById(R.id.buttonR)

}





}