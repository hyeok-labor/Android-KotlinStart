package com.hyeok.androidlab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_my_kotlin.*


/*
    Day1 - Kotlin learning
    1. layout activity .xml 파일은 별 차이가 없는 것 같다.
    2. 세미콜론(;)이 붙지 않아도 코드 실행이 된다.
    3. testBtn 의 경우, 레이아웃에서 선언되었지만 .kt 파일에서 직접 버튼을 선언하지 않아도 된다

    오늘의 결론 : 코틀린이 훨씬 편할거거같다. 내일은 부터 다른 기능을 적용해 볼 예정.
 */
class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        testBtn.setOnClickListener(this)
    }

    override fun onClick(v: View?) {

        Toast.makeText(this,"button click..", Toast.LENGTH_LONG).show()
    }
}
