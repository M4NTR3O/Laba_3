package com.example.lab_3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonToResult = findViewById<Button>(R.id.buttonToResult)
        val inputString = findViewById<EditText>(R.id.inputString)
        val charOff = findViewById<EditText>(R.id.inputCharOff)
        val charOn = findViewById<EditText>(R.id.inputCharOn)
        val result = findViewById<EditText>(R.id.resultText)
        buttonToResult.setOnClickListener {
            val middleResult: String = inputString.text.toString().replace(charOff.text.toString()[0], charOn.text.toString()[0])
            result.setText(middleResult)
        }
    }
}