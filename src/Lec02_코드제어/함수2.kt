package Lec02_코드제어

//파라미터를 기본값으로 넣어줄수 있다. 자바의 오버로딩 기능이 필요가 없어진다.
fun repeat(
    str: String,
    num: Int = 3,
    useNewLine: Boolean = true
) {
    for (i in 1..num) {
        if (useNewLine) {
            println(str)
        } else {
            print(str)
        }
    }
}

//자바에서는 가변인자를... 을 이용하지만 코틀린은 vararg를 이용한다.
fun printAll(vararg strings: String) {
    for (str in strings) {
        println(str)
    }
}

fun main() {
    repeat("hi", 1, true);
    repeat("hi", 1)
    repeat("hi")

    //named argument
    fun printNameAndGender(name: String, gender: String) {
        println(name)
        println(gender)
    }

    //named argument를 사용하여 builder의 장점을 누릴 수 있다.
    //코틀린에서 java함수를 사용할때는 named argument를 사용할 수 없다.
    printNameAndGender(name = "현수", gender = "MALE")

    val array = arrayOf("A", "B", "C")
    //* spread 연산자를 이용해서 배열안의 값을 , 를 쓰는것처럼 꺼내준다.
    printAll(*array)
}