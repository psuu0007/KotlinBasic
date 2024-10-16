package com.edu.ch03

//returnFunc.kt

fun main() {

    printSum(10, 20)
    returnTypeFunc("글쿤")
}

fun printSum(a: Int, b: Int): Unit{

    println("$a + $b 결과: ${a + b}")
}

fun returnTypeFunc(str: String){

    println("리턴값이 없는 함수: $str")
}