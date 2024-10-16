package com.edu.ch05

import kotlin.random.Random

//arrBasic1

fun main() {

    val numArr = arrayOf(1, 2, 3, 4)

    val strArr = arrayOf("cat", "dog", "lion", 1, 3.233)

    println(numArr.get(0))
    println(numArr.get(1))
    println(numArr.get(2))
    println(numArr.get(3))

    for (obj in strArr){
        println(obj)
    }

//    val strArr2 = arrayOf<Int>(1, 12)
//    val strArr3 = intArrayOf(1, 12)
//    val strArr4 = arrayOf(1, 12)
    var randomNumber = Random.nextInt(1, 10)
    println(randomNumber)
}