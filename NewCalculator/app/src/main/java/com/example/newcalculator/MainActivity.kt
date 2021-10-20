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

        var result = bindingClass.result.text.toString() //to record numbers
        var operation:String? = null //to record signs
        var term1: Float? = null //for calculations
        var term2: Float? = null //for calculations

        //fixing the input of numbers
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
            if (result == "0") { //there cannot be two consecutive zeros at the very beginning
                result = "0"
                bindingClass.result.text = result
            }
            else {
                result += "0"
                bindingClass.result.text = result
            }
        }

        bindingClass.fraction.setOnClickListener {
            result += "."
            bindingClass.result.text = result
        }

        //when you click on reset, everything is reset
        bindingClass.reset.setOnClickListener {
            result = "0"
            bindingClass.result.text = result
            term1 = null
            term2 = null
            operation = null
        }

        //operations with arithmetic signs
        bindingClass.division.setOnClickListener {
            if (operation == null){
                term1 = result.toFloat()
                result = "0"
                operation = "division"
            }
            else { //to calculate the result, if we count everything in a row and do not click "result"
                term2 = result.toFloat()
                var a: Float = 0.0f
                var b: Float = 0.0f

                if (term1 != null && term2 != null){
                    a = term1 as Float
                    b = term2 as Float
                }
                else
                    bindingClass.result.text = "ERROR"

                if (operation == "division") {
                    var value = (a / b).toString()
                    val remains = value.substringAfter('.')
                    if (remains == "0"){
                        value = value.replace(".0","")
                    }
                    bindingClass.result.text = value
                    term1 = value.toFloat()
                }
                else if (operation == "multiply") {
                    var value = (a * b).toString()
                    val remains = value.substringAfter('.')
                    if (remains == "0"){
                        value = value.replace(".0","")
                    }
                    bindingClass.result.text = value
                    term1 = value.toFloat()
                }
                else if (operation == "sum"){
                    var value = (a + b).toString()
                    val remains = value.substringAfter('.')
                    if (remains == "0"){
                        value = value.replace(".0","")
                    }
                    bindingClass.result.text = value
                    term1 = value.toFloat()
                }
                else if (operation == "minus"){
                    var value = (a - b).toString()
                    val remains = value.substringAfter('.')
                    if (remains == "0"){
                        value = value.replace(".0","")
                    }
                    bindingClass.result.text = value
                    term1 = value.toFloat()
                }
                else
                    bindingClass.result.text = "ERROR"
            }
            operation = "division"
            result = "0"
        }

        //then it is the same for each sign
        bindingClass.multiply.setOnClickListener {
            if (operation == null){
                term1 = result.toFloat()
                result = "0"
                operation = "multiply"
            }
            else{
                term2 = result.toFloat()
                var a: Float = 0.0f
                var b: Float = 0.0f

                if (term1 != null && term2 != null){
                    a = term1 as Float
                    b = term2 as Float
                }
                else
                    bindingClass.result.text = "ERROR"

                if (operation == "division") {
                    var value = (a / b).toString()
                    val remains = value.substringAfter('.')
                    if (remains == "0"){
                        value = value.replace(".0","")
                    }
                    bindingClass.result.text = value
                    term1 = value.toFloat()
                }
                else if (operation == "multiply") {
                    var value = (a * b).toString()
                    val remains = value.substringAfter('.')
                    if (remains == "0"){
                        value = value.replace(".0","")
                    }
                    bindingClass.result.text = value
                    term1 = value.toFloat()
                }
                else if (operation == "sum"){
                    var value = (a + b).toString()
                    val remains = value.substringAfter('.')
                    if (remains == "0"){
                        value = value.replace(".0","")
                    }
                    bindingClass.result.text = value
                    term1 = value.toFloat()
                }
                else if (operation == "minus"){
                    var value = (a - b).toString()
                    val remains = value.substringAfter('.')
                    if (remains == "0"){
                        value = value.replace(".0","")
                    }
                    bindingClass.result.text = value
                    term1 = value.toFloat()
                }
                else
                    bindingClass.result.text = "ERROR"
            }
            operation = "multiply"
            result = "0"
        }

        bindingClass.sum.setOnClickListener {
            if (operation == null){
                term1 = result.toFloat()
                result = "0"
                operation = "sum"
            }
            else {
                term2 = result.toFloat()
                var a: Float = 0.0f
                var b: Float = 0.0f

                if (term1 != null && term2 != null){
                    a = term1 as Float
                    b = term2 as Float
                }
                else
                    bindingClass.result.text = "ERROR"

                if (operation == "division") {
                    var value = (a / b).toString()
                    val remains = value.substringAfter('.')
                    if (remains == "0"){
                        value = value.replace(".0","")
                    }
                    bindingClass.result.text = value
                    term1 = value.toFloat()
                }
                else if (operation == "multiply") {
                    var value = (a * b).toString()
                    val remains = value.substringAfter('.')
                    if (remains == "0"){
                        value = value.replace(".0","")
                    }
                    bindingClass.result.text = value
                    term1 = value.toFloat()
                }
                else if (operation == "sum"){
                    var value = (a + b).toString()
                    val remains = value.substringAfter('.')
                    if (remains == "0"){
                        value = value.replace(".0","")
                    }
                    bindingClass.result.text = value
                    term1 = value.toFloat()
                }
                else if (operation == "minus"){
                    var value = (a - b).toString()
                    val remains = value.substringAfter('.')
                    if (remains == "0"){
                        value = value.replace(".0","")
                    }
                    bindingClass.result.text = value
                    term1 = value.toFloat()
                }
                else
                    bindingClass.result.text = "ERROR"
            }
            operation = "sum"
            result = "0"
        }

        bindingClass.minus.setOnClickListener {
            if (operation == null && result == "0"){
                result = "-"
            }
            else if (operation == null){
                term1 = result.toFloat()
                result = "0"
                operation = "minus"
            }
            else{
                term2 = result.toFloat()
                var a: Float = 0.0f
                var b: Float = 0.0f

                if (term1 != null && term2 != null){
                    a = term1 as Float
                    b = term2 as Float
                }
                else
                    bindingClass.result.text = "ERROR"

                if (operation == "division") {
                    var value = (a / b).toString()
                    val remains = value.substringAfter('.')
                    if (remains == "0"){
                        value = value.replace(".0","")
                    }
                    bindingClass.result.text = value
                    term1 = value.toFloat()
                }
                else if (operation == "multiply") {
                    var value = (a * b).toString()
                    val remains = value.substringAfter('.')
                    if (remains == "0"){
                        value = value.replace(".0","")
                    }
                    bindingClass.result.text = value
                    term1 = value.toFloat()
                }
                else if (operation == "sum"){
                    var value = (a + b).toString()
                    val remains = value.substringAfter('.')
                    if (remains == "0"){
                        value = value.replace(".0","")
                    }
                    bindingClass.result.text = value
                    term1 = value.toFloat()
                }
                else if (operation == "minus"){
                    var value = (a - b).toString()
                    val remains = value.substringAfter('.')
                    if (remains == "0"){
                        value = value.replace(".0","")
                    }
                    bindingClass.result.text = value
                    term1 = value.toFloat()
                }
                else
                    bindingClass.result.text = "ERROR"
            }
            operation = "minus"
            result = "0"
        }

        //after clicking "result", we output the final result after all operations
        bindingClass.total.setOnClickListener {
            term2 = result.toFloat()
            var a: Float = 0.0f
            var b: Float = 0.0f

            if (term1 != null && term2 != null){
                a = term1 as Float
                b = term2 as Float
            }
            else
                bindingClass.result.text = "ERROR"

            if (operation == "division") {
                var value = (a / b).toString()
                val remains = value.substringAfter('.')
                if (remains == "0"){
                    value = value.replace(".0","")
                }
                bindingClass.result.text = value
            }
            else if (operation == "multiply") {
                var value = (a * b).toString()
                val remains = value.substringAfter('.')
                if (remains == "0"){
                    value = value.replace(".0","")
                }
                bindingClass.result.text = value
            }
            else if (operation == "sum"){
                var value = (a + b).toString()
                val remains = value.substringAfter('.')
                if (remains == "0"){
                    value = value.replace(".0","")
                }
                bindingClass.result.text = value
            }
            else if (operation == "minus"){
                var value = (a - b).toString()
                val remains = value.substringAfter('.')
                if (remains == "0"){
                    value = value.replace(".0","")
                }
                bindingClass.result.text = value
            }
            else
                bindingClass.result.text = "ERROR"
        }
    }
}