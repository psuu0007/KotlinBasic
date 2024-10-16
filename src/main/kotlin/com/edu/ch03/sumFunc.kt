package com.edu.ch03

//sumFunc.kt

fun main() {

    val result1 = sum(3, 2)
    val result2 = sum(5, 7)

    println(result1)
    println(result2)

}

fun sum(a: Int, b: Int): Int{
    var sum = a + b

    return sum
}

//fun 함수이름(변수명: 자료형, 변수명: 자료형, ....): 반환타입{
//    표현식....
//
//    return 반환값
//}