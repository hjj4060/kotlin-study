package Lec02_코드제어

/**
 * 코틀린에서 반복문을 다루는 방법
 * 1. for-each문
 * 2. 전통적인 for문
 * 3. Progression과 Range
 *
 * 코틀린에서 for문을 사용할때 등차수열을 사용한다.
 */

fun main() {
    val numbers = listOf(1L, 2L, 3L)
    //향상된 for문에서 자바와 차이점은 : 대신에 in이 들어간다.
    for (number in numbers) {
        println(number)
    }

    //1부터 3을 출력한다.
    for (i in 1..3) {
        println(i)
    }

    //3부터 1을 출력한다.
    for (i in 3 downTo 1) {
        println(i)
    }

    //step으로 i를 2씩 증가시킨다.
    for (i in 1..5 step 2) {
        println(i)
    }

}