package 변수와타입_연산자

//코틀린은 암시적 변환이 안된다.
val number1: Int = 0
//val number2: Long = number1

//코틀린은 to타입()을 이용해서 명시적 타입변경을 해줄수 있다.
val number2: Long = number1.toLong();

val longNumer: Int = 5
val doubleNumber: Double = 1.5
var result = longNumer + doubleNumber

private class Person(
    val name: String,  //val은 getter만 존재
    var isMarried: Boolean //var은 getter, setter 존재
)

//Java에서의 Object가 코틀린에서는 Any이다.
//Any뒤에 ?는 null이 올수 있다는 뜻이다.
fun printAgeIfPerson(obj: Any?) {
    if (obj is Person) {
        //var person = obj as Person //as Person은 Java의 (Person) obj
        //is로 타입 검사를 했기때문에 자동으로 Person으로 캐스팅해준다 이것을 스마트 캐스팅이라고 한다.
        println(obj.name)
    }

    //!가 붙으면 Not이 된다.
    if (obj !is Person) {
        println("person 객체가 아닙니다.")
    }
}

fun printAgeIfPerson2(obj: Any?) {
    var person = obj as? Person //as뒤에 ?의 의미는 obj가 Person이면 Person객체를 반환하고, 그게 아니면 null을 반환한다.
    println(person?.name) //person뒤에 ?의 의미도 person객체가 null이면 null을 반환하고 그게 아니면 person.name을 실행한다.
}

fun main() {
    var person = Person("현수", true)
    printAgeIfPerson(person)
    printAgeIfPerson("현수")

    var person2 = Person("토르", true)
    printAgeIfPerson2(null)
    printAgeIfPerson2(person2)

    //여러줄의 문자열 입력
    var name = "kira"
    var str =
    """
        ABC
        DEF
        ${name}
    """.trimIndent()
    println(str)

    //특정 문자열 가져오기
    val str2 = "ABC"
    println(str2[0])
    println(str2[2])
}

