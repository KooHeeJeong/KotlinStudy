package com.study.kotlinstudy.kotlin

// 14. Collection
// 가장 많이 사용하는 것
//  -> list , set, map


fun main(args: Array<String>) {

    //Immutable Collection 값을 변경할 수 없다
    //List -> 중복을 허용
    val numberList = listOf<Int>(1, 2, 3, 3)
    println("List 출력 : $numberList")

    //Set  (집합의 특징 : 중복 값이 없다)
    // -> 중복을 허용하지 않는다.
    // -> 순서가 없다!!!
    val numberSet = setOf<Int>(1, 2, 3, 3, 3, 3)
    println("Set 출력 : $numberSet")

    //Map -> Key,value 방식으로 관리한다.
    val numberMap = mapOf<String, Int>("one" to 1, "two" to 2)
    println("Map 출력 : $numberMap")


    //Mutable Collection 값을 변경 할 수 있다.
    val mNumberList = mutableListOf<Int>(1, 2, 3)
    mNumberList.add(3, 4)
    println("mList 출력 : $mNumberList")

    val mNumberSet = mutableSetOf<Int>(1, 2, 3, 4, 4, 4, 4)
    mNumberSet.add(5)
    println("mSet 출력 : $mNumberSet")

    val mNumberMap = mutableMapOf<String, Int>("one" to 1, "two" to 2)
    mNumberMap.put("three",3)
    println("mMap 출력 : $mNumberMap")
 
}