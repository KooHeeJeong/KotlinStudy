package com.study.kotlinstudy.kotlin

// 18. Class

// OOP -> Object Oriented Programing (객체지향 프로그래밍)

// 객체란 뭘까 ?
// - 이름이 있는 모든 것

// 절차 지향 프로그래밍
// - 코드를 위에서 아래로 실행하면 문제가 해결된다.

// 객체 지향 프로그래밍
// - 객체를 만들어서, 객체에게 일을 시켜서 문제를 해결한다.
// - ex, 선수, 심판, 경기장, 관중 -> 축구 게임

// 객체를 만드는 방법
// - 설명서가 있어야 한다.

fun main(array: Array<String>) {

    //클래스(설명서) 를 통해서 실체를 만드는 방법
    // -> 인스턴스화 -> 인스턴스(객체)
    Car("v8 engine", "big")

    // 우리가 만든 클래스는 자료형이 된다. (설명서 1)
    val bigCar: Car = Car("v8 engine", "big")

    val superCar: SuperCar = SuperCar("good engine", "big", "white")

    //인스턴스가 가지고 있는 기능을 사용 하는 방법
    val runableCar:RunableCar = RunableCar("simple engine", "white body")
    runableCar.ride()
    runableCar.drive()
    runableCar.navi("부산")

    //인스턴스의 멤버 변수에 접근 하는 방법
    val runalbleCar2: RunalbleCar2 = RunalbleCar2("nice engine", "long body")
    println(runalbleCar2.body)
    println(runalbleCar2.engine)
}


// 클래스(설명서) 만드는 방법(1)
class Car(var engine: String, var body: String) {

}

// 클래스(설명서) 만드는 방법(2) -> 이 방법이 익숙해지면 축약된 방법(1) 을 하면된다.
class SuperCar {
    var engine: String
    var body: String
    var door: String

    constructor(engine: String, body: String, door: String) {
        println(engine)
        println(body)
        println(door)
        this.engine = engine
        this.body = body
        this.door = door
    }
}

// 클래스(설명서) 만드는 방법(3) -> 1번 방법의 확장
class Car1(engine: String, body: String) {
    var door: String = ""

    //contructor = 생성자
    constructor(engine: String, body: String, door: String) : this(engine, body) {
        this.door = door
    }
}

// 클래스(설명서) 만드는 방법 (4) - 2번 방법의 확장
class Car2 {
    var engine: String = ""
    var body: String = ""
    var door: String = ""

    constructor(engine: String, body: String) {
        this.engine = engine
        this.body = body
    }

    constructor(engine: String, body: String, door: String) {
        this.engine = engine
        this.body = body
        this.door = door
    }
}

class RunableCar(engine: String, body: String) {

    fun ride() {
        println("탑승 하였습니다.")
    }
    fun drive() {
        println("달립니다 ! ")
    }
    fun navi(destination: String) {
        println("$destination 으로 목적지가 설정되었습니다.")
    }
}

class RunalbleCar2 {
    var engine: String
    var body : String
    constructor(engine: String,body: String){
        this.engine = engine
        this.body = body
    }

    //클래스가 인스턴스 화가 될때 가장 먼저 출력이 된다.
    //초기셋팅을 할때 유용하다.
    init {
        println("RunableCar 2 가 만들어졌습니다.")
    }

    fun ride() {
        println("탑승 하였습니다.")
    }
    fun drive() {
        println("달립니다 ! ")
    }
    fun navi(destination: String) {
        println("$destination 으로 목적지가 설정되었습니다.")
    }
}

//오버로딩
// Class 안에 멤버변수는 같을 수 없다.
// Class 안에 함수는 이름이 같더라도 파라미터가 다르면 다르게 인식한다.
class TestClass() {
    fun test(first: String) {

    }
    fun test(first : String , second :String ) {

    }
}