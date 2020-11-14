package com.study.kotlinstudy.kotlin


//////////////////////////////////////////
// 2) 은행 계좌 만들기
//      - 계좌 생성 기능 (이름, 생년 월일, 초기금액 )
//      - 잔고를 확인 하는 기능
//      - 출금 기능
//      - 예금 기능

fun main(array: Array<String>) {
    val bank = Account("구희정", "950120", 10000)
    println(bank.checkBalance())
    bank.save(12345)
    println(bank.checkBalance())
    println(bank.withdraw(20000000))


}

class Account {
    var name: String
    var birth: String
    var balance: Int

    constructor(name: String, birth: String, balance: Int) {
        this.name = name
        this.birth = birth
        this.balance = balance
    }

    fun checkBalance(): Int {
        return balance
    }

    fun withdraw(amount: Int): Boolean {
        return if (balance >= amount) {
            balance -= amount
            true
        } else {
            false
        }
    }

    fun save(amount: Int) {
        balance += amount
    }
}
