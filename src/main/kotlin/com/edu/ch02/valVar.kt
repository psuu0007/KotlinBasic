package com.edu.ch02

fun main() {
//    변수 선언 예
//    val username: String = "길동"
//    선언키워드 변수명: 자료형 = 값

//    코틀린은 자료형을 지정하지 않고 변수를 선언하면
//    변수에 할당된 값을 보고 알아서 자료형을 지정할 수 있다
//    -> 자료형을 추론한다 라고 한다

    val number = 10
    var lang = "Korean"
    val secondNum: Int = 20
    lang = "English"

    println("Number: $number")
    println("Language: $lang")
    println("Second Number: $secondNum")
}