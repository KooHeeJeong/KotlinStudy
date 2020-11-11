package com.study.kotlinstudy.kotlin

var a = 1 + 2 + 3 + 4 + 5
var b = "1"
var c = b.toInt()
var d = b.toFloat()

var e = "John"
var f = "My name is $e Nice to meet you"

var z : Int = 0

// NULL
// - 존재 하지 않는다.

//var abc : Int = null
//자료형 뒤에 < ? > 를 붙이면 NULL 을 가질수 있는 자료형이 된다.
var abc1 : Int? = null

var g = a + 3

fun main(){
    println(a)
    println(b)
    println(c)
    println(d)
    println(e)
    println(f)
    println(abc1)

    println(g)

}