package com.study.kotlinstudy.kotlin

//전역함수
//지역함수

var number10 : Int = 10

fun main(args: Array<String>){
    println(number10)
    val Test2 = Test1("123")
    println(Test2.name)
    Test2.Test1Start()
    println(number10)
}
class Test1 (val name : String) {
    fun Test1Start() {
        number10 = 100
    }

}









