package com.hyeok.androidlab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_my_kotlin.*
import some_package.PackageTest     // 가상의 패키지에 생성되었지만 호출이 가능함


/*
    Day1 - Kotlin learning
    1. layout activity .xml 파일은 별 차이가 없는 것 같다.
    2. 세미콜론(;)이 붙지 않아도 코드 실행이 된다.
    3. testBtn 의 경우, 레이아웃에서 선언되었지만 .kt 파일에서 직접 버튼을 선언하지 않아도 된다

    오늘의 결론 : 코틀린이 훨씬 편할거거같다. 내일은 부터 다른 기능을 적용해 볼 예정.

    Day2 - Kotlin learning
    1. 가상의 패키지를 생성해서 import 받아올 수 있다 -> 하나의 패키지에서 복잡한 파일 관리 배제가능
    2. fun 은 함수(메서드)를 생상할때...
    3. 코틀린 에서는 모든 것이 Object 이다 변수 선언 -> 변수명 : 타입 = value
    4. Number Type 에 대입하는 데이터에 언더바 입력가능 !!
    5. var와 val의 차이점
        ㄴ 공통적으로 컴파일러가 타입을 추론할 수 있다면 타입을 입력하지 않아도 됨.
        ㄴ var = 초기화 후 값을 변경 가능, 다른 타입 불가
        ㄴ val = Java의 final 변수와 같다. 선언 후 변경 불가 !
 */
class MainActivity : AppCompatActivity(), View.OnClickListener {

    // 변수값에 언더바 입력 하기 : 데이터를 읽기 쉽게..ㅎ
    val oneMillion:Int = 1_000_000

    // Int to Double Type Casting
    var a1:Int =10
    var a2:Double= a1.toDouble()
    // Error!! ==> var a3:Double = a1

    // Int type의 변수를 참고해 String 변수 선언
    val i = 10      // int
    val s = "i=$i"  // String ==> "i=10" 문자열이 된다!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        testBtn.setOnClickListener(this)

        // FileTest.kt Test
        // hyeok Tag 아래에, name은 name변수명의 값을 호출, sum은 sum함수 {} 내에 파라미터 입력.
        Log.d("hyeok","name : $name, sum:${sum(10)}")
    }

    override fun onClick(v: View?) {

        Toast.makeText(this,"button click..", Toast.LENGTH_LONG).show()

        // view에서 가져온 값이 testBtn과 일치할 때 가상패키지로부터 import한 메서드 실행
        if(v==testBtn){
            val test = PackageTest()
            Log.d("kkang",test.getNow());
        }
    }


}
