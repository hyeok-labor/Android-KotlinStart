package com.hyeok.androidlab

// 파일로 작성하기
// 변수와 함수를 클래스 단위로 묶지 않고 파일에 나열해서 작성하는 방법

val name = "hyeok"

fun sum(count:Int):Int{
    var sum=0
    // 1 부터 count까지 증가하는 값이 i에 자동으로 저장됨 : count 는 Int형 parameter임.
    for(i in 1..count){
        sum+=i
    }
    return sum
}