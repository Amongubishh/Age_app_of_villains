package com.example.ageapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val entageline = findViewById<EditText>(R.id.entageline) //declaration of EditText
        val enterbutton = findViewById<Button>(R.id.enterbutton) //declaration of Button - enter
        val clearbutton = findViewById<Button>(R.id.clearbutton) //declaration of Button - clear
        val celebtext = findViewById<TextView>(R.id.celebtext) //declaration of TextView



        enterbutton.setOnClickListener {//start of button
            clearbutton.setOnClickListener { entageline.text.clear() }//starts the clear button
            val age = entageline.text.toString()
            val ageText = entageline.text.toString()
            if (!ageText.isNullOrEmpty()) {
                val age = ageText.toInt()
                val name = if (age in 56..56) {//if or else statements also repeated
                    "You are 56 the same age as Adolf Hitler ,German politician ,leader of the Nazi party who died at 56. Kill ze jews - Adolf Hitler"//strings
            } else if (age in 54..54) {
                "You are 54 the same age as Osama bin Mohammed Laden, master mind behind 9 11. Allahu Akbarrr! - Osama Bin Ladin"
            } else if (age in 46..46) {
                "You are 46 the same age as George Perry Floyd Jr, black man killed by cops. i..i cant breathhh :( -George Floyd "
                } else if (age in 37..37) {
                    "You are 37 the same age as Vincent Van Gogh, famous ginger. he also painted or something "
                } else if (age in 34..34) {
                    "You are 34, the same age as Jeffrey Lionel Dahmer, famous cannibal and sex offender. MMMHH you taste soo good, i like men- Jeffrey Dahmer"
                }else if (age in 66..66) {
                        "You are 66 the same age as Jeffrey Epstein, sex offender of little girls. come to my island girls,i have candy :) - Jeffrey Epstein"
                } else if (age in 76..76) {
                    "You are 76 the same age as Stephen Hawking, theoretical physicist. Beep boop beep - Stephen Hawking"
                } else if (age in 96..96) {
                    "You are 96 the same age as queen Elizabeth II.She was the ultimate colonizer "
                } else if (age in 95..95) {
                    "You are 95 the same age as Nelson Mandela South African president and former slave"
                } else if (age in 50..50) {
                    "You are 50 years old, the same age as Michael Jackson singer and king of pop. Former black man that evolved into a white man and child molester "


                } else if (age in 0..20) {
                    "error this age falls out of range"
                } else if (age in 100..200) {
                    "error this age falls out of range"







                } else {
            "invalid age"
        }
        celebtext.text = name
    } else {
        celebtext.text = "please enter an age "
            }

        }

    }
}