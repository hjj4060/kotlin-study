package Lec04_FP

/**
 * inLine함수
 *
 * 함수가 호출되는 대신,
 * 함수를 호출한 시점에 함수 본문을 그대로 복붙하고 싶은 경우!
 *
 * 함수를 파라미터로 전달할 떄에 오버헤드를 줄일 수있다.
 *
 * 하지만 inline함수의 사용은 성능 측정과 함께 신중하게 사용되어야 한다.
 */
fun main() {
    println(3.add3(4)) //함수를 호출하는게 아니라 로직자체가 함수를 부르는 쪽에 복사 붙여넣기가 된다.

    //함수안헤 함수를 호출하는것을 지역함수라고 한다.
    fun Int.add4(other: Int): Int {
        return this + other
    }

    println(4.add4(5))
}

inline fun Int.add3(other: Int): Int {
    return this + other
}