package com.example.a1_randomnumber

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val seekBar = findViewById<SeekBar>(R.id.seekBar)
        val resultTextView = findViewById<TextView>(R.id.resultTextView)
        val startButton = findViewById<Button>(R.id.startButton)
        val currentSeekBarMaxValue = findViewById<TextView>(R.id.currentMaxValueTextView)


        //Show Current Seekbar Value
        currentSeekBarMaxValue.text = "Current Max Value: " + seekBar.progress


        startButton.setOnClickListener {

            if (seekBar.progress > 0) {
                val random = Random.nextInt(seekBar.progress) + 1
                resultTextView.text = random.toString()
            } else {
                resultTextView.text = "0"
            }


        }


        seekBar?.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {
                // Write code to perform some action when progress is changed.
                currentSeekBarMaxValue.text = "Current Max Value: " + seekBar.progress
            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {
                // When touch is started.
            }

            override fun onStopTrackingTouch(seekBar: SeekBar) {
                //When touch is stopped.
            }
        })





    }




}

