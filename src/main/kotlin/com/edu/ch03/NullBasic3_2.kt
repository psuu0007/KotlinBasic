package com.edu.ch03

fun main() {

    var str1: String? = "hello world"

    str1 = null

    println("str1: $str1, length: ${str1?.length ?: -1}")

//    세이프 콜은 기본적으로 엘비스 연산자와 함께 사용된다
//    ${str1?.length ?: -1}
//    null이 아닌 경우 ?의 오른쪽
//    null인 경우 왼쪽 ?

}