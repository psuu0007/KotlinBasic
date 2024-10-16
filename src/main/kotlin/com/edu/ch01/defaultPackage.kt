package com.edu.ch01

fun main() {
//    예측 시스템
//    String str = "sd"
    val intro: String = "안녕"
//    immutable
//    Int
//    float ->
//    Float
    val num: Int = 20

    println("intro: " + intro)

    println("num: $num")
//    val은 변수에 다른 값으로 변경할 수 없다
//    var mutable 변수에 다른 값으로도 변경하고 싶다면
    var name: String = "?"

    name = "코틀린"

    println("name: $name")
}