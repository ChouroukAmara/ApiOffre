package com.example.revisiontpdialog

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val button2=findViewById<Button>(R.id.button2)
        val message=intent.getStringExtra("EXTRA_MESSAGE")
        val testv = findViewById<TextView>(R.id.textview).apply {
            text =message
        }
        //testv.setText(message)

        button2.setOnClickListener(){
            intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

    }
}