package some_package       // 가상의 패키지 some_package에 클래스 생성

import java.text.SimpleDateFormat
import java.util.*

class PackageTest {
    fun getNow():String{
        val now= Date()
        val sdf= SimpleDateFormat("yyyy-MM-dd HH:mm")
        return sdf.format(now)
    }
}
