package com.study.kotlinstudy.kotlin

// 08. 제어 흐름
// - if , else



fun main(args : Array<String>){
    var a : Int = 5
    val b : Int = 10
    if (a < b) {
        println("a == $a  결과 a가 b 보다 작습니다.")
        a++

    }else {
        println("값을 도달 했습니다.")
    }
    println(a)


}