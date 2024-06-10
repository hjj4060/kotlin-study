package Lec03_OOP

//data 클래스는 equals, toString, hashCode를 자동으로 만들어준다.
data class PersonDTO(
    val name: String,
    val age: Int,
)

fun main() {
    val dto1 = PersonDTO("강현수", 100)
    val dto2 = PersonDTO("강현수", 100)

    println(dto1 == dto2) // ==는 equals()를 실행한다.
    println(dto1)
}
