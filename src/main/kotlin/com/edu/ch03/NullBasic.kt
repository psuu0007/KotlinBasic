package com.edu.ch03

fun main() {

//    Null can not be a value of a non-null type String

//    null을 허용한 변수
//    변수에 null 할당하기
//    일반적인 변수 선언시에는 null 값을 할당할 수 없다
//    null을 허용하려면 자료형 뒤에 물음표(?) 기호를 명시해야 한다
    var str1 : String = "Hello"
//    str1 = null // null 허용하지 않음
    println("str1: $str1")

    var str2 : String? = "Hello"
    str2 = null
    println("str2: $str2")
}