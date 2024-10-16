package com.edu.ch03

//DefaultParameter


fun main() {
//    val name = "홍길동"
//    val email = "host@example.com"

//    add(name)
//    add(name, email)
//    defaultArgs()
//    defaultArgs(300)
    add(name = "이름")

}

fun add(name: String, email: String = "입력된 값이 없음"){
    val output = "${name}님의 이메일은 ${email}입니다."

    println(output)
}

fun defaultArgs(x: Int = 100, y: Int = 200){
    println(x + y)
}