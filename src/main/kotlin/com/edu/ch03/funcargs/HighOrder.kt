package com.edu.ch03.funcargs

//HighOrder.kt

// 변수에 할당하는 람다식 함수
fun main() {

    var result: Int
//    val multi = {x: Int, y: Int -> x * y}

//    val multi: (Int, Int) -> Int = {x: Int, y: Int -> x * y}
//    변수를 함수처럼 사용: 람다식의 선언 자료형은 람다식 매개변수에 자료형이 명시된 경우 생략 가능
//    = 선언 자료형이 명시되어 있으면 생략가능 -> 함수의 내용과 결과 반환, 표현식이 여러 줄인 경우
//    마지막 표현식이 반환

//    val multi: (Int, Int) -> Int = {x: Int, y: Int ->
//        println("x * y")
//        var result = x * y
//        x * y  // 마지막 표현식이 리턴
//    }

// 선언 자료형 생략
    val multi = {x: Int, y: Int -> x * y}

    // 람다식 매개변수 자료형의 생략
//    val multi: (Int, Int) -> Int = {x, y -> x * y}

    // 잘못된 예시 추론이 불가능함
//    val multi = {x, y -> x * y}

    result = multi(10, 20)
    println(result)

}

//fun highFunc(sum: (Int, Int) -> Int, a: Int, b: Int): Int
//고차 함수명      람다식 매개변수            정수형 매개변수   반환 타입
//{
//    return sum(a, b)
//}

//fun sum(a: Int, b: Int): Int{
//    return a + b
//}