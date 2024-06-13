package Lec04_FP

/**
 * 컬렉션은 불변인지 가변인지 꼭 선언을 해야 한다.!!
 * 가변 컬렉션은 Mutable이 붙는다. 컬렉션에 element를 추가, 삭제할 수 있다.
 * 불변 컬렉션은 컬렉션에 element를 추가, 삭제할 수 없다.
 *
 * 불변은 컬렉션에 element를 추가 삭제 할수없지만
 * 값은 변경할 수 있다.
 *
 * TIP : 우선 불변리스트를 만들고, 꼭 필요한 경우 가변 리스트로 바꾸자
 *
 * ?위치에 따라서 null가능성 의미가 달라진다.
 * List<Int?> :  리스트에 null이 들어갈 수 있지만, 리스트는 절대 null이 아님
 * List<Int>? :  리스트에 null이 들어갈 수 없지만, 리스트는 null일 수 있음
 * List<Int?>? : 리스트에 null이 들어갈 수도 있고, 리스트 자체가 null일 수 있다.
 */
fun main() {
    //listOf로 불변리스트를 만들수 있다.
    val numbers = listOf(100, 200) //listOf = Arrays.asList = of.list
    println(numbers[0]) //코틀린에서는 대괄호로 값을 바로 가져 올 수 있다.

    for (number in numbers) {
        println(numbers)
    }

    for ((idx, value) in numbers.withIndex()) {
        println("${idx} ${value}")
    }

    //가변 컬렉션은 mutableListOf() 를 쓰면된다., 자바의 ArrayList와 같다.
    val mutableNumbers = mutableListOf(100, 200)
    mutableNumbers.add(300) //컬렉션 원소 추가

    //비어있는 리스트를 만들수 있다. 값이 없어 타입추론이 불가능하여 타입을 명시적으로 넣어야 한다.
    val emptyList = emptyList<Int>()

    //함수 파라미터 타입으로 타입을 추론할 수 있다.
    printNumbers(emptyList())
}

private fun printNumbers(numbers: List<Int>) {

}