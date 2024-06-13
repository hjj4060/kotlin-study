package Lec04_FP

/**
 * 집합은 리스트와 다르게 순서가 없어 같은 element는 하나만 존재할 수 있다.
 */

fun main() {
    val numbers = setOf(100, 200)

    for (number in numbers) {
        println(number)
    }

    for ((idx, value) in numbers.withIndex()) {
        println("${idx} ${value}")
    }

    //LinkedHashSet을 쓴다.
    val mutableNumbers = mutableSetOf(100, 200)
}