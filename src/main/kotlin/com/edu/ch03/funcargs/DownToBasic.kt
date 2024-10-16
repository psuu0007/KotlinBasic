package com.edu.ch03.funcargs

//DownToBasic

fun main() {

    val downTo: (Int) -> Int = {x ->
        var sum = 0

        for (i in x downTo 1){
            sum = sum + i
        }

        sum
    }

//    println(downTo(3))

//    d in 3..5
//    10 1씩 감소하는 ?
//    for (i in 10..1){
//        println(i)
//    }
//
//    for (Int i=10; i >= 0; i--){
//
//    }
//
//    for (i: Int = 10; i >= 0; i--){
//
//    }
}

