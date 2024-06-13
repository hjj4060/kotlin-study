package Lec04_FP

fun main() {
    //JDK 8
    val oldMap = mutableMapOf<Int, String>()
    oldMap[1] = "MONDAY"
    oldMap[2] = "TUESDAY"

    for (key in oldMap.keys) {
        println(key)
        println(oldMap[key])
    }

    for ((key, value) in oldMap.entries) {
        println(key)
        println(value)
    }

    //to는 중위호출
    //mapOf(key to value)를 사용해서 불변 map을 만들 수 있다.
    mapOf(1 to "MONDAY", 2 to "TUESDAY") //java 9 Map.of(1, "MONDAY", 2, "TUESDAY")
}