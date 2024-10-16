package com.edu.ch03

fun main() {

    var str1: String? = "hello world"

    str1 = null

    val len = if(str1 != null) str1.length else -1

    println("str1: $str1 length: ${len}")


}