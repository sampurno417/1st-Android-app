package com.example.my1stexampleapplication

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View.INVISIBLE
import android.view.View.VISIBLE
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val headder = findViewById<TextView>(R.id.headline)
        val student =findViewById<EditText>(R.id.inputname)
        val submitbutton=findViewById<Button>(R.id.btnsubmit)
        val offersbutton = findViewById<Button>(R.id.btnOffers)
        var enterdname = ""
        submitbutton.setOnClickListener{
             enterdname = student.text.toString()
            if (enterdname == ""){
                headder.text = "Hello Student"
                offersbutton.visibility = INVISIBLE
                Toast.makeText(this@MainActivity,
                    "please,enter your name!",
                    Toast.LENGTH_SHORT
                ).show()
            }
            else {
                val showcase = "welcome $enterdname"
                headder.text = showcase
                student.text.clear()
                offersbutton.visibility = VISIBLE

            }
            offersbutton.setOnClickListener{
                val intent = Intent(this, secondActivity::class.java)
                intent.putExtra("USER", enterdname)
                startActivity(intent)
            }
        }
    }
}