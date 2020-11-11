package com.study.kotlinstudy.kotlin

fun main(args: Array<String>) {

    val value: Int? = null

    when (value) {
        null -> println("Value is null")
        else -> println("Value is not null")
    }

    val value2: Boolean? = null
    when (value2) {
        true -> println("")
        false -> println("")
        null -> println("Value2 is null !!")
    }

    //when 의 다양한 조건식 (1)
    val value4 = "12345"
    when(value4) {
        is String -> {
            if(true) println("True Value")
                else println("False Value")
        }
        else -> {
            println("No Checking Value")
        }
    }

    //when 의 다양한 조건식 (2)
    val value5 : Int = 87
    when(value5){
        in 50 downTo 20 -> println("Down to ??")
        in 50..90 -> println("Value in")
    }







}