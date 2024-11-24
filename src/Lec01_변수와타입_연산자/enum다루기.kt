package Lec01_변수와타입_연산자

//기본적인 enum
//코틀린에서 enum은 소프트 키워드(soft keyword)라고 부른다.
enum class Color {
    RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET
}

//프로퍼티와 메서드가 있는 enum 클래스
enum class Color2(var red: Int, var green: Int, var blue: Int) {
    RED(255, 0, 0), ORANGE(255, 165, 0),
    YELLOW(255, 255, 0), GREEN(0, 255, 0),
    BLUE(0, 0, 255), INDIGO(75, 0, 130),
    VIOLET(238, 130, 238);

    //enum 클래스안에서 메서드 정의가 필요할때 상수목록과 메서드 사이에 ; 로 구분을 해줘야 한다.
    fun rgb() = (red * 256 + green) * 256 + blue
}

fun main() {
    println(Color2.RED.rgb())
    println("123" + Color.RED)
}


