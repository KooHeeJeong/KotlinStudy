package com.study.kotlinstudy.kotlin

// 04. Function
// - 함수
//      - 어떤 input 을 넣어주면 어떤  output 나오는 것
//      - ex. y = x + 2

// - 함수를 선언 하는 방법
// fun 함수명 (변수명 : 타입, 변수명 : 타입 ....) : 반환형 {
//      함수내용
//      return 반환 값
// }

fun plus(first: Int, second: Int): Int {
    val result: Int = first + second
    return result
}

// - 디폴트 값(기본 값)을 갖는 함수 만들기
fun plusFive(first: Int, second: Int = 5): Int {
    val result: Int = first + second

    return result
}

// - 반환값이 없는 함수 만들기
fun printPlus(first: Int, second: Int) {
    val result: Int = first + second
    println(result)
}

// - 반환값이 없는 함수 만들기 2
fun printPlus2(first: Int, second: Int): Unit {
    val result: Int = first + second
    println(result)
}

// - 가변인자를 갖는 함수 선언하는 방법
fun plusMany(vararg numbers : Int)   {
    for (number in numbers) {
        println(number)
    }
}

fun main() {
}



