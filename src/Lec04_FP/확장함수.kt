package Lec04_FP

/**
 * 확장함수는 기존 java 코드 위에 자연스럽게 코틀린 코드를 추가할 수는 없을까?!
 * Java로 만들어진 라이브러리를 유지보수, 확장할 때 Kotlin 코드를 덧붙이고 싶어서 나왔다.
 *
 * 확장함수는 마치 이 함수가 클래스 안에 있는 멤버 함수인 것 같이 사용된다
 *
 * 확장함수는 클래스에 있는 private 또는 protected 멤버를 가져올 수 없다.?
 * 확장함수와 멤버함수의 이름이 같다면 멤버함수가 실행된다.
 *
 * 확장함수는 원본 클래스의 private, protexted 멤버 접근이 안된다.
 * 멤버함수, 확장함수 중 멤버함수에 우선권이 있다.
 * 확장함수는 현재 타입을 기준으로 호출된다.
 */

fun main() {
    val str = "ABC"
    //멤버함수인것처럼 사용할 수 있다.
    println(str.lastChar())

    val train: Train = Train()
    println(train.isExpensive()) //Train의 확장함수

    //상위타입 Train의 확장함수가 호출된다.
    val srt1: Train = Srt()
    srt1.isExpensive() //Train의 확장함수

    val str2: Srt = Srt()
    str2.isExpensive() //Srt의 확장함수
}

//fun 확장하려는클래스.함수이름(파라미터): 리턴타입 { this를 이용해 실제 클래스 안의 값에 접근 }
fun String.lastChar(): Char {
    return this[this.length - 1]
}

open class Train(
    val name: String = "새마을기차",
    val price: Int = 5_000,
)

fun Train.isExpensive(): Boolean {
    println("Train의 확장함수")
    return this.price >= 10000
}

class Srt : Train("SRT", 40_000)

fun Srt.isExpensive(): Boolean {
    println("Srt의 확장함수")
    return this.price >= 10000
}