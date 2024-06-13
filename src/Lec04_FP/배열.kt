package Lec04_FP

fun main() {
    var array = arrayOf(100, 200)

    //indices() 함수로 0부터 마지막 index까지의 Range이다.
    for (i in array.indices) {
        println("${i} ${array[i]}")
    }


    array = array.plus(300) //엘리먼트 추가, 딥카피
    //withIndex()를 통해서 인덱스와 값을 한번에 가져올 수 있다.
    for ((idx, value) in array.withIndex()) {
        println("${idx} ${value}")
    }
}