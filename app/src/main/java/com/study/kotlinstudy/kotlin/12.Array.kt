package com.study.kotlinstudy.kotlin

// 12. 배열

// 배열이 필요한 이유
// - 어떠한 모음집이 필요할 때
//

fun main(array: Array<String>) {

    // 배열을 생성하는 방법 (1)
    val group1 = arrayOf<Int>(1, 2, 3, 4, 5)
//    println(group1 is Array)

    // 배열을 생성하는 방법 (2)
    val group2 = arrayOf(1,2,3,4,5)
//    println(group2 is Array)

    // 배열의 값을 꺼내는 방법(1)
    val test1 = group1.get(0)
//    println(test1)

    // 배열의 값을 꺼내는 방법(2)
    val test2 = group2[1]
//    println(test2)

    // 배열의 값을 바꾸는 방법(1)
    group1.set(0,100)
    println(group1[0])

    // 배열의 값을 바꾸는 방법(2)
    group1[0] = 200
    println(group1[0])

}