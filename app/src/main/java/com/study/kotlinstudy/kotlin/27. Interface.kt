package com.study.kotlinstudy.kotlin

// 인터페이스
// 인터페이스는 약속
// 인터페이스는 생성자가 없다 -> 인스턴스화를 시킬 수 없다. -> 설명서가 아니다.
// 즉, 인터페이스는 지침서이다. -> 구현하고싶은것을 구현하여라.

// 상속의 특징과 비슷하게 부모는 자식 클래스를 사용할수 없고 , 자식은 부모클래스를 사용할 수 있다.

// 상속과 다른점.
// - 상속은 조상을 찾아가는 느낌 (최소한의 기능들을 모아둔것)
// - 인터페이스는 같은 종의 느낌.

interface person_ {
    fun eat() {

    }
    fun sleep() {

    }
}

open class person() {
    fun eat() {

    }
    fun sleep() {

    }
}

class student() : person() {

}

class teacher() : person() {

}