package com.example.simplecalculator

import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity


class ResultActivity : AppCompatActivity(){



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        init()

    }
    private fun init(){
        val textView
        textView.setOnClickListener{
        }
