package com.study.kotlinstudy.kotlin

// 25. 상속
// 부모로부터 설명을 물려받는다.

//이때 클래스의 접근제어자는 open을 사용한다.

fun main (args : Array<String>) {
    var superCarA : SuperCarA = SuperCarA()
    var truckA : TruckA = TruckA()

    truckA.stop()
    truckA.drive()
}

open class CarA () {
    fun drive() {

    }
    fun stop() {

    }
}
class SuperCarA (){

}
class TruckA() : CarA() {

}