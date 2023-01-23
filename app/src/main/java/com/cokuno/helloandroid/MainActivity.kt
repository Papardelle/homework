package com.cokuno.helloandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var nameTextView: TextView
    private lateinit var answerButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nameTextView = findViewById(R.id.hello_android_one)
        answerButton = findViewById(R.id.button1)
    }

    fun onAnswerButton(view: View) {
        nameTextView.text = getString(R.string.hello_android_two)
    }

}