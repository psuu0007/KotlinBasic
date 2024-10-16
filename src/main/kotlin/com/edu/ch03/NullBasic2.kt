package com.edu.ch03

fun main() {

//    세이프 콜과 non-null 단정 기호

    var str1 : String? = "오늘은 날이 춥네요"

    str1 = null

//    println("str1: $str1 length: ${str1.length}")

//    safe-call
//    println("str1: $str1 length: ${str1?.length}")

//    assert exp
//    println("str1: $str1 length: ${str1!!.length}")

}