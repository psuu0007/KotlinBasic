package com.edu.etc

fun main() {

    var str1 : String = "aaa"

    var num1 : Int = 9

    var concatStr : String

    concatStr = str1 + num1

    println(concatStr)

    str1 = "10"
    concatStr = (str1.toInt() + num1).toString()
    println(concatStr)


    println("$str1 + $num1")


}