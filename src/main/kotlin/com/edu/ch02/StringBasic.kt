package com.edu.ch02

fun main() {
    var str1: String = "Hello"
    var str2 = "World"
    var str3 = "Hello"

    println("str1 === str2: ${str1 === str2}")
    println("str1 === str3: ${str1 === str3}")

//    형식화된 다중 문자열
    val formattedStr = """
        var a = 5
        신기하다
        백틱 같은 느낌?
    """.trimIndent()

    println(formattedStr)
}