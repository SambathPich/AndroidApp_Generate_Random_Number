package com.example.a1_randomnumber

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.SeekBar
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val seekBar = findViewById<SeekBar>(R.id.seekBar)
        val resultTextView = findViewById<TextView>(R.id.resultTextView)
        val startButton = findViewById<Button>(R.id.startButton)


        startButton.setOnClickListener {

            if (seekBar.progress > 0) {
                val randomNumber = Random.nextInt(seekBar.progress) + 1
                resultTextView.text = randomNumber.toString()
            } else {
                resultTextView.text = "0"
            }

        }




    }
}
