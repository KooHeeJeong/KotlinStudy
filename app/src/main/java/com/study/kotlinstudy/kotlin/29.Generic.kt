package com.study.kotlinstudy.kotlin

import kotlin.String as String1

// 29. Generic 타입
// 목적 : 타입을 체크하는 기능
// - 제너릭 타입은 실제로 만들기는 어렵고 사용법만 숙지한다.

fun main (args : Array<String1>){

    val list1 = listOf(1,2,3,"가")
    val a : String1 = list1[2].toString()
    println("$a")


    val list2 = listOf<String1>("가","나","다")
    val b : String1 = list2[2]
    println("$b")




}

