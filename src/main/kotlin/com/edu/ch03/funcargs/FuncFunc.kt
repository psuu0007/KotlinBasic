package com.edu.ch03.funcargs

//FuncFunc.kt

// 반환값에 일반 함수 사용해보기 -> 고차함수임
fun main() {
    println("funcFunc: ${funcFunc()}")
}

fun sum3(a: Int, b: Int) = a + b

fun funcFunc(): Int{
    return sum3(2, 5)
}