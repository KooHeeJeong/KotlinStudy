package com.study.kotlinstudy.kotlin

// 1) 사칙 연산을 수행할 수 있는 클래스

// 2) 은행 계좌 만들기
//      - 계좌 생성 기능 (이름, 생년 월일)
//      - 잔고를 확인 하는 기능
//      - 출금 기능
//      - 예금 기능

// 3) TV 클래스
//      - on/off 기능
//      - 채널을 돌리는 기능
//      - 초기 채널은 (S사 M사 K사 3개)


fun main(array: Array<String>) {
//    val calculator2 = Calculator2()
//    println(calculator2.plus(5, 5, 20))
//    println(calculator2.minus(10, 2, 1))
//    println(calculator2.multiply(3, 4, 10))
//    println(calculator2.divide(20, 2, 2))
}
/////////////////////////////////////////

// 1) 사칙 연산을 수행할 수 있는 클래스

class Calculator1() {
    fun plus(a: Int, b: Int): Int {
        return a + b
    }

    fun minus(a: Int, b: Int): Int {
        return a - b
    }

    fun multiply(a: Int, b: Int): Int {
        return a * b
    }

    fun divide(a: Int, b: Int): Int {
        //리턴은 몫만 한다.
        return a / b
    }
}

class Calculator2() {
    fun plus(vararg numbers: Int): Int {
        var result: Int = 0
        numbers.forEach {
            result += it
        }
        return result
    }

    fun minus(vararg numbers: Int): Int {
        var result: Int = numbers[0]
        numbers.forEachIndexed { index, num ->
            if (index != 0) {
                result -= num
            }
        }
        return result
    }

    fun multiply(vararg numbers: Int): Int {
        var result: Int = 1
        numbers.forEach { it ->
            result *= it
        }
        return result
    }

    fun divide(vararg numbers: Int): Int {
        var result: Int = numbers[0]
        numbers.forEachIndexed { index, num ->
            if (index != 0) {
                result /= num
            }
        }
        return result
    }
}

class Calculator3(val initialValue: Int){
    fun plus(numbers: Int): Calculator3 {
        val result: Int = this.initialValue + numbers
        return Calculator3(result)
    }
}

//////////////////////////////////////////
// 2) 은행 계좌 만들기
//      - 계좌 생성 기능 (이름, 생년 월일)
//      - 잔고를 확인 하는 기능
//      - 출금 기능
//      - 예금 기능
