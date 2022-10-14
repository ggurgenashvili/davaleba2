package com.example.simplecalculator

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity :AppCompatActivity() {


    private var firstNum: Float = 0F
    private var secondNum: Float = 0F
    private var operation = ""


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        val sumbutton = findViewById(R.id.sumbutton) as Button
        sumbutton.setOnClickListener() {
            addOperation(sumbutton)
        }
        val subbutton = findViewById(R.id.subbutton) as Button
        subbutton.setOnClickListener() {
            addOperation(subbutton)
        }
        val multiply = findViewById(R.id.multiply) as Button
        sumbutton.setOnClickListener() {
            addOperation(multiply)
        }
        val divide = findViewById(R.id.divide) as Button
        sumbutton.setOnClickListener() {
            addOperation(divide)
        }


    }
//    private fun init(){
//        EditText.OnClickListener{
//            addText(firstNum)
//
//        }
//        EditText.setOnClickListener{
//            addText(secondNum)
//
//        }
//
//        sumbutton.setOnClickListener{
//            addOperation(sumbutton)
//        }
//        multiply.setOnClickListener{
//            addOperation(multiply)
//        }
//    }

//
//

    private fun addOperation(button: Button) {
        operation = button.text.toString()
//        firstNum = EditText.toString().toFloat()
//        TextView.text = ""

    }

    private fun result() {
//        if (.text.isNotEmpty()) {
//            secondNumber = textButton.text.toString().toFloat()

        var result: Float = 0F
        if (operation == "+") {
            result = firstNum + secondNum
        } else if (operation == "-") {
            result = firstNum - secondNum
        } else if (operation == "*") {
            result = firstNum * secondNum
        } else if (operation == ":") {
            result = firstNum / secondNum
        }

    }




}




