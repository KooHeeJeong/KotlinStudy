package com.study.kotlinstudy.kotlin

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
}

///////////////////////////////////////////////////////////////////////////////////

// 1번 문제
// List 두개 만든다.
// 첫번째 List에는 0부터 9까지 값을 넣는다 (반복문 사용)
// 두번째 List에는 첫번째 List의 값을 하나씩 확인 (println)
// 짝수면 True 홀수면 False 를 넣어준다 (println)

fun twoList() {
    val firstList = mutableListOf<Int>(0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
    val twoList = mutableListOf<Boolean>(true,true,true,true,true,true,true,true,true,true)
    for (i in 0..9) {
        firstList[i] = i
    }
    firstList.forEachIndexed { index, item ->
        val number: Int = item % 2
        twoList[index] = number == 0
    }
    println(firstList)
    println(twoList)

}