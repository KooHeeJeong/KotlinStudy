package com.study.kotlinstudy.kotlin

fun main(args: Array<String>) {
    var superMonster = SuperMonster(100, 10)
    var superNight = SuperNight(100, 20)
    superMonster.attack(superNight)
    superNight.attack(superMonster)
    superMonster.attack(superNight)
}

open class base(var hp: Int, val power: Int) {


    fun attack(base: base) {
        defense(power)
    }

    fun defense(damage: Int) {
        hp -= damage
        if (hp > 0) println("${javaClass.simpleName} 는 공격 받았습니다. 남은 체력 -> $hp")
        else println("${javaClass.simpleName}은 죽었습니다.")
    }

}

class SuperMonster(hp: Int, power: Int) : base(hp, power) {

}

class SuperNight(hp: Int, power: Int) : base(hp, power) {

}
