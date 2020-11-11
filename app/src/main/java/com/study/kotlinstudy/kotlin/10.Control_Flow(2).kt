package com.study.kotlinstudy.kotlin

// 10 제어흐름
// When

fun main(args: Array<String>) {

    val value: Int? = null

    when (value) {
        1 -> {
            println("1값")
        }
        2 -> {
            println("2값")
        }
        3 -> {
            println("3값")
        }
        4 -> {
            println("4값")
        }
        else -> {
            println("I do not know value")
        }
    }

    val value2 = when(value){
        1-> 10
        2-> 20
        3-> 30
        4-> 40
        else -> 100
    }
    println(value2)

}