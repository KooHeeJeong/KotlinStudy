package com.study.kotlinstudy.kotlin

// 16. Iterable
// 반복문

fun main(array: Array<String>) {

    val a = mutableListOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9)

    println("\n 반복하는 방법 (1)")
    // 반복하는 방법 (1) -> index는 알 수 없다.
    for (item in a) {
        if (item == 5) {
            println("Item is Five")
        } else {
            println("Item is notFive")
        }
    }

    //반복하는 방법 (2) -> index값을 가져올 수 있다.
    println("\n 반복하는 방법 (2)")
    for ((index, item) in a.withIndex()) {
        println("index : $index value : $item")
    }

    // 반복하는 방법 (3)
    println("\n 반복하는 방법 (3)")
    a.forEach {
        println(it)
    }

    // 반복하는 방법 (4)
    println("\n 반복하는 방법 (4)")
    a.forEach { item ->
        println(item)
    }

    // 반복하는 방법 (5)
    println("\n 반복하는 방법 (5)")
    a.forEachIndexed { index, item ->
        println("index : $index Value : $item ")
    }

    // 반복하는 방법 (6)
    println("\n 반복하는 방법 (6)")
    println(a.size)
    for (i in 0 until a.size) {
        // until은 마지막을 포함 하지 않는다.
        // 0부터 8까지
        println(a[i])
    }

    // 반복하는 방법 (7)
    // step = 2칸씩 뛰어서
    println("\n 반복하는 방법 (7)")
    for (i in 0 until a.size step (2)) {
        println(a[i])
    }

    // 반복하는 방법 (8)
    // downTo = 내림차순으로 반복문 실행
    println("\n 반복하는 방법 (8)")
    for (i in a.size - 1 downTo (0)) {
        println(a[i])
    }

    // 반복하는 방법 (9)
    println("\n 반복하는 방법(9)")
    for (i in a.size - 1 downTo (0) step (2)) {
        println(a[i])
    }

    //반복하는 방법 (10)
    println("\n 반복하는 방법 (10)")
    for (i in 0..a.size) {
        println(i)
    }

    // Until 과 .. 의 차이
    // Until -> 끝 값을 -1
    // .. -> 끝 값까지


    //반복하는 방법 (11)
    println("\n 반복하는 방법 (11)")
    var b: Int = 0
    var c: Int = 4
    while (b < c) {
        println("b")
        b++
    }

    //반복하는 방법 (12)
    var d: Int = 0
    var e: Int = 4
    println("\n 반복하는 방법 (12)")
    do {
        println("hello")
        d++
    } while (d < e)
}


