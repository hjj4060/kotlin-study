package Lec04_FP

/**
 * infix 함수
 *
 */

fun Int.add(other: Int): Int {
    return this + other
}

//앞에 infix를 붙여서 3 add 4 로 부를수 있다.
infix fun Int.add2(other: Int): Int {
    return this + other
}

fun main() {
    println(3.add(5))
    println(3 add2 4)
}