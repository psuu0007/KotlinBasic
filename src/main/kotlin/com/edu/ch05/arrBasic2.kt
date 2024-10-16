package com.edu.ch05

import java.util.*
import kotlin.random.Random

//arrBasic2

fun main() {

    val numArr = arrayOf(1, 2, 3, 4)

    val strArr = arrayOf("cat", "dog", "lion", 1, 3.233)

//    var 변수명 = Array(요소 크기, 초기값)
    var numArr2 = Array(5, {i -> i})

    println("numArr2: ${Arrays.toString(numArr2)}")


    println("--------------------------------")

//  횟수?
    var cnt = 0
    for (i in numArr2){
        println("$cnt 번째: $i")
        cnt++
    }

    println("--------------------------------")

    numArr2.forEach { item ->
        println(item)
    }

    println("--------------------------------")

    strArr.forEachIndexed({
        i, obj -> println("strArr[$i] = $obj")
    })

    var testArr = Array(10, {i -> i * 2})

    testArr.filter{e -> e > 10}.forEach{e -> print("$e\t")}

//자동 정렬 : alt + ctrl + l
}