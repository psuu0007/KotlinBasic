package com.edu.ch03

fun main() {

    var test: Number = 12.2

    println("$test")

    test = 12
    println("$test")

    test = 120L
    println("$test")

    test += 10.0f
    println("$test")


    var num1 : Int = 10
    var num2 : Double = 0.0

    var sum : Int = num1 + num2.toInt()

    println("Sum: $sum")
}