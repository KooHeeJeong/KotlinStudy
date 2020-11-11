package com.study.kotlinstudy.kotlin

fun main(args: Array<String>) {
    //엘비스 연산자

    val number: Int? = null
    val number2 = number ?: 10

    println(number)
    println(number2)

}