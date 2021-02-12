package com.example.calculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onbuttonclick(view: View) {
         if (isnewop){
             textoutput.setText("")
         }
          isnewop = false
        val buselect = view as Button
        var buclickvalue: String = textoutput.text.toString()
        when (buselect.id) {
            bu0.id -> {
                buclickvalue += "0"
            }

            bu1.id -> {
                buclickvalue += "1"
            }
            bu2.id -> {
                buclickvalue += "2"
            }
            bu3.id -> {
                buclickvalue += "3"
            }
            bu4.id -> {
                buclickvalue += "4"
            }
            bu5.id -> {
                buclickvalue += "5"
            }
            bu6.id -> {
                buclickvalue += "6"
            }
            bu7.id -> {
                buclickvalue += "7"
            }
            bu8.id -> {
                buclickvalue += "8"
            }
            bu9.id -> {
                buclickvalue += "9"
            }
            budot.id -> {
                buclickvalue += "."
            }
        }
        textoutput.setText(buclickvalue)
    }


    var op = "*"
    var oldnum= ""
    var isnewop =true
    fun buopevent(view: View) {

        val buselect = view as Button

        when (buselect.id) {
            bumul.id -> {
                op = "*"
            }
            budiv.id -> {
                op = "/"
            }
            busub.id -> {
                op = "-"
            }
            buadd.id -> {
                op = "+"
            }


        }
        oldnum= textoutput.text.toString()
        isnewop =true
    }


    fun equalevent (view: View){

        val buselect =view as Button
        val newnum = textoutput.text.toString()
        var finalop :Double?= null

        when(op){
            "*"->{
                finalop =oldnum.toDouble()*newnum.toDouble()
            }
            "/"->{
                finalop =oldnum.toDouble()/newnum.toDouble()
            }
            "-"->{
                finalop =oldnum.toDouble()-newnum.toDouble()
            }
            "+"->{
                finalop =oldnum.toDouble()+newnum.toDouble()
            }
        }
        textoutput.setText(finalop.toString())
        isnewop =true

    }

    fun buclear (view: View){

            textoutput.setText("")
        isnewop =true

    }

    fun bupercent (view: View){

        var number:Double = textoutput.text.toString().toDouble()/100

        textoutput.setText(number.toString())
        isnewop =true
    }
}













