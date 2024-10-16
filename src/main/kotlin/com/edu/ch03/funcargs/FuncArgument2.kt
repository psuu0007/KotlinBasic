package com.edu.ch03.funcargs

//FuncArgument2

// 일반 함수를 강사가 자주 사용했던 방법 -> 고차함수 아님
fun main() {

    val res1 = sum(30, 20)
    var res2 = sum(30, 30)
    res2 = mul(res2, 3)


    println("res1: $res1, res2: $res2")
}

fun sum2(a: Int, b: Int) = a + b
fun mul2(a: Int, b: Int) = a * b