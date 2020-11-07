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
// 함수명, 매개변수(obj) : 매개변수 타입(Any), 리턴값(Int)
fun getLength(obj: Any):Int{
    if(obj is String){
        return obj.length
    }
    return 0

    // ==> 인자값이 String 일 때, 길이 반환 그렇지 않다면 return 0
}

// 이게 되네..
fun cases(obj:Any):String{
    when(obj){
        1->return "One"
        "hello"-> return "Greeting"
        is Long -> return "Long"
        !is String -> return "Not a String"
        else -> return "unknown"
    }
}