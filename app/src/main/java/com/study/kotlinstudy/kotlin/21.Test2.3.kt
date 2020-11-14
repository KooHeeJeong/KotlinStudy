package com.study.kotlinstudy.kotlin

// 3) TV 클래스
//      - on/off 기능
//      - 채널을 돌리는 기능
//      - 초기 채널은 (S사 M사 K사 3개)

fun main(array: Array<String>) {
    val channel = listOf<String>("KBS", "MBC", "SBS")
    val TV = TV(channel)
    println(TV.swith())
    println(TV.checkChannel())
    println(TV.channelUp())
    println(TV.checkChannel())
    println(TV.channelUp())
    println(TV.checkChannel())
    println(TV.channelUp())
    println(TV.checkChannel())
    println(TV.channelUp())
    println(TV.checkChannel())
    println(TV.channelUp())
    println(TV.checkChannel())

    println()
    println(TV.checkChannel())
    println(TV.channelDown())
    println(TV.checkChannel())
    println(TV.channelDown())
    println(TV.checkChannel())
    println(TV.channelDown())
    println(TV.checkChannel())
    println(TV.channelDown())
    println(TV.checkChannel())
    println(TV.channelDown())
    println(TV.checkChannel())



}

class TV(val channel: List<String>) {

    var tvState: Boolean = false
    var channelState: Int = 0
        set(value) {
            field = value
            if (field > 2) {
                field = 0
            }
            if (field < 0) {
                field = 2
            }
        }

    fun checkChannel(): String {
        return channel[channelState]
    }

    fun swith() {
        tvState != tvState
    }

    fun channelUp() {
        channelState += 1
    }

    fun channelDown() {
        channelState -= 1
    }
}