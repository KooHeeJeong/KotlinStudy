package com.study.kotlinstudy.kotlin

fun main(args: Array<String>) {

    val night = Night(100, 25)
    val monseter = Monseter(70, 20)

//    night.attack(monseter)
//    monseter.attack(night)
    for(i in 1..9){
        monseter.attack(night)
    }

}

class Night {
    private var HP: Int
    private var Power: Int

    constructor(HP: Int, Power: Int) {
        this.HP = HP
        this.Power = Power
    }

    fun attack(monseter: Monseter) {
        monseter.defense(Power)

    }

    fun defense(damage: Int) {
        HP -= damage
        if(HP>0) {
            heal()
            println("자동 힐 발생 ! HP : $HP")
        }
        else {
            println("기사가 사망하였습니다.")
        }
    }

    private fun heal() {
        HP += 5
    }
}

class Monseter {
    private var HP: Int
    private var Power: Int

    constructor(HP: Int, Power: Int) {
        this.HP = HP
        this.Power = Power

    }

    fun attack(night: Night) {
        night.defense(Power)

    }

    fun defense(damage: Int) {
        HP -= damage
        if (HP >0) {
            println("몬스터는 죽지 않았습니다. HP = $HP ")
        }
        else
            println("몬스터는 죽었습니다.")
    }
}