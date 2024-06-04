package Lec02_코드제어

/**
 * When 사용법
 * - 코틀린에서는 switch case가 사라졌고 대신에 when을 쓴다.
 * - when 역시도 statement다
 * - switch 대신에 when을 쓴다.
 * - case대신에 바로 값을 쓰고 화살표로 분기를 친다.
 * - default 대신에 else를 사용한다.
 */
fun getGradeWithSwitch(score: Int): String {
    return when (score / 10) {
        9 -> "A"
        8 -> "B"
        7 -> "C"
        else -> "D"
    }
}

//코틀린에서는 특정 값만을 가지고 분기를 칠수있는게 아니라 다양한 조건을 가지고 분기를 칠 수 있다.
fun getGradeWithSwitch2(score: Int): String {
    return when (score) {
        in 90..100 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }
}

//obj가 String 타입인지 아닌지 분기처리를 간편하게 할 수 있다.
fun startsWithA(obj: Any): Boolean {
    return when (obj) {
        is String -> obj.startsWith("A")
        else -> false
    }
}

fun judgeNumber(number: Int) {
    //number == 1 || number == 0 || number == -1
    when (number) {
        1, 0, -1 -> println("1또는 0또는 -1입니다.")
        else -> println("1, 0, -1이 아닙니다.")
    }
}

//코틀린에서 when을 값 없이 조건 분기로만 사용할 수 있다.
fun judgeNumber2(number: Int) {
    when {
        number == 0 -> println("주어진 숫자는 0입니다.")
        number % 2 == 0 -> println("주어지는 숫자는 홀수 입니다.")
        else -> println("주어지는 숫자는 홀수 입니다.")
    }
}

fun main() {
    //getGradeWithSwitch()
}