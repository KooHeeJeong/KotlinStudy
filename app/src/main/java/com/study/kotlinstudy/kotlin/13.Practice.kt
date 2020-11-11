package com.study.kotlinstudy.kotlin

fun main(array: Array<String>) {


    // Array 의 Bounds
    // - 처음 만들때 Bounds 즉, Size 값이 정해진다.
    // - Size 를 바꾸기엔 힘들다.
    val array = arrayOf<Int>(1, 2, 3)


    // Array를 만드는 방법 (3)
    val a1 = intArrayOf(1, 2, 3, 4)
    val a2 = charArrayOf('A', 'B') // char -> '' , string -> ""
    val a3 = doubleArrayOf(1.2, 3.4, 6.6)
    val a4 = booleanArrayOf(true, false)

    // Array를 만드는 방법 (4) -> Lambda 를 활용한 방법
    var a5 = Array(10) { 1 }
    for (aa5 in a5){
        println(aa5)
    }

    var a6 = Array(5) { 1; 2; 3; 4; }
//    for (aa6 in a6) {
//        println(aa6)
//    }

}