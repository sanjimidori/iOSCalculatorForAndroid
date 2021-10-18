package com.example.newcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.newcalculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var bindingClass: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        var result = bindingClass.result.text.toString()
        var operation:String? = null
        var term1: Double = -1.0
        var term2: Double = -1.0

        bindingClass.one.setOnClickListener {
            if (result == "0") {
                result = "1"
                bindingClass.result.text = result
            }
            else {
                result += "1"
                bindingClass.result.text = result
            }
        }

        bindingClass.two.setOnClickListener {
            if (result == "0") {
                result = "2"
                bindingClass.result.text = result
            }
            else {
                result += "2"
                bindingClass.result.text = result
            }
        }

        bindingClass.three.setOnClickListener {
            if (result == "0") {
                result = "3"
                bindingClass.result.text = result
            }
            else {
                result += "3"
                bindingClass.result.text = result
            }
        }

        bindingClass.four.setOnClickListener {
            if (result == "0") {
                result = "4"
                bindingClass.result.text = result
            }
            else {
                result += "4"
                bindingClass.result.text = result
            }
        }

        bindingClass.five.setOnClickListener {
            if (result == "0") {
                result = "5"
                bindingClass.result.text = result
            }
            else {
                result += "5"
                bindingClass.result.text = result
            }
        }

        bindingClass.six.setOnClickListener {
            if (result == "0") {
                result = "6"
                bindingClass.result.text = result
            }
            else {
                result += "6"
                bindingClass.result.text = result
            }
        }

        bindingClass.seven.setOnClickListener {
            if (result == "0") {
                result = "7"
                bindingClass.result.text = result
            }
            else {
                result += "7"
                bindingClass.result.text = result
            }
        }

        bindingClass.eight.setOnClickListener {
            if (result == "0") {
                result = "8"
                bindingClass.result.text = result
            }
            else {
                result += "8"
                bindingClass.result.text = result
            }
        }

        bindingClass.nine.setOnClickListener {
            if (result == "0") {
                result = "9"
                bindingClass.result.text = result
            }
            else {
                result += "9"
                bindingClass.result.text = result
            }
        }

        bindingClass.zero.setOnClickListener {
            result += "0"
            bindingClass.result.text = result
        }

        bindingClass.fraction.setOnClickListener {
            result += "."
            bindingClass.result.text = result
        }

        bindingClass.reset.setOnClickListener {
            result = "0"
            bindingClass.result.text = result
            term1 = -1.0
            term2 = -1.0
            operation = null
        }

        bindingClass.division.setOnClickListener {
            if (operation == null){
                term1 = result.toDouble()
                result = "0"
                operation = "division"
            }
            else
                bindingClass.result.text = "ERROR"
        }

        bindingClass.multiply.setOnClickListener {
            if (operation == null){
                term1 = result.toDouble()
                result = "0"
                operation = "multiply"
            }
            else
                bindingClass.result.text = "ERROR"
        }

        bindingClass.sum.setOnClickListener {
            if (operation == null){
                term1 = result.toDouble()
                result = "0"
                operation = "sum"
            }
            else
                bindingClass.result.text = "ERROR"
        }

        bindingClass.minus.setOnClickListener {
            if (operation == null){
                term1 = result.toDouble()
                result = "0"
                operation = "minus"
            }
            else
                bindingClass.result.text = "ERROR"
        }

        bindingClass.total.setOnClickListener {
            term2 = result.toDouble()
            if (operation == "division")
                bindingClass.result.text = (term1 / term2).toString()
            else if (operation == "multiply")
                bindingClass.result.text = (term1 * term2).toString()
            else if (operation == "sum")
                bindingClass.result.text = (term1 + term2).toString()
            else if (operation == "minus")
                bindingClass.result.text = (term1 - term2).toString()
            else
                bindingClass.result.text = "ERROR"
        }
    }
}