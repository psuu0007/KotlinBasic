package com.edu.ch03.funcargs

//HighOrder2.kt


fun main() {

//  매개변수가 없고, 반환 타입이 없는 경우
    val greet: () -> Unit = { println("hello world") }
    val greet2 = { println("hello world") }

    val square: (Int) -> Int = {x -> x * x}

}