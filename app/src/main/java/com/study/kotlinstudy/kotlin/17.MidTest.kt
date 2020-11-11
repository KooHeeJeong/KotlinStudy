package com.study.kotlinstudy.kotlin

import android.widget.Switch

// 1번 문제
// List 두개 만든다.
// 첫번째 List에는 0부터 9까지 값을 넣는다 (반복문 사용)
// 두번째 List에는 첫번째 List의 값을 하나씩 확인 (println)
// 짝수면 True 홀수면 False 를 넣어준다 (println)

// 2번 문제
// 학점 구하지
// 80 ~ 90 -> A
// 70 ~ 80 -> B
// 60 ~ 70 -> C
// 나머지 F

// 3번 문제
// 전달 받은 숫자의 각 자리 수의 합을 구한다.
// 조건 : 전달 받은 숫자는 무조건 두자리 수이다.

// 4번 문제
// 구구단을 출력하자

fun main(args: Array<String>) {
    twoList()
//    score(70)
//    add(77)
    gugudan()
}

///////////////////////////////////////////////////////////////////////////////////

// 1번 문제
// List 두개 만든다.
// 첫번째 List에는 0부터 9까지 값을 넣는다 (반복문 사용)
// 두번째 List에는 첫번째 List의 값을 하나씩 확인 (println)
// 짝수면 True 홀수면 False 를 넣어준다 (println)

fun twoList() {
    val firstList = MutableList(9) { 0 }
    val twoList = MutableList(9) { true }
    for (i in 0..8) {
        firstList[i] = i + 1
    }
    firstList.forEachIndexed { index, item ->
        twoList[index] = item % 2 == 0
    }
    println(firstList)
    println(twoList)

}

////////////////////////////////////////////////////////////////////////////////////////

// 2번 문제
// 학점 구하지
// 80 ~ 90 -> A
// 70 ~ 80 -> B
// 60 ~ 70 -> C
// 나머지 F

fun score(score: Int) {
    when (score) {
        in 80..90 -> println("A")
        in 70..80 -> println("B")
        in 60..70 -> println("C")
        else -> println("F")
    }
}

////////////////////////////////////////////////////////////////////////////////////

// 3번 문제
// 전달 받은 숫자의 각 자리 수의 합을 구한다.
// 조건 : 전달 받은 숫자는 무조건 두자리 수이다.

fun add(num: Int) {
    val a: Int = num / 10
    val b: Int = num % 10

    println(a + b)
}

////////////////////////////////////////////////////////////////////////////////////

// 4번 문제
// 구구단을 출력하자
// 반복에 반복문을 넣으면 된다.

fun gugudan() {
    for (x in 1..9){
        for(y in 1..9) {
            println(" $x X $y = ${x*y}")
        }
    }
}