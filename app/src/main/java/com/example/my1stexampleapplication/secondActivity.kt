package com.example.my1stexampleapplication

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView

class secondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val userName = intent.getStringExtra("USER")
        val textView = findViewById<TextView>(R.id.tvOffer)
        val massage = "$userName , you will get free access to all content for 1 month"
        textView.text = massage
    }
}