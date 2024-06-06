package Lec03_OOP


//constructor는 생성자함수이다.
class Person constructor(name: String, age: Int) {
    val name: String = name
    var age: Int = age
}

//constructor는 생략이 가능하다.
class Person2(name: String, age: Int) {
    //생성자에서 타입을 명시했기 때문에 타입 생략이 가능하다.
    val name = name //val은 getter만 자동으로 만들어준다.
    var age = age //var은 getter, setter를 자동으로 만들어준다.
}

//코틀린에서는 생성자에서 프로퍼티를 만들어 줄 수 있다.
//바디에 아무것도 없으면 생략 가능하다.
class Person3(
    val name: String,
    var age: Int
)

class Person4(
    val name: String,
    var age: Int
) {
    //init 블럭은 생성자가 호출되는 시점에 한번 실행된다. 생성자 데이터를 검증할수 있다.
    init {
        if (age <= 0) {
            throw IllegalArgumentException("나이는 ${age}일 수 없습니다.")
        }
    }

    //constructor로 생성자를 추가할 수 있다., this() 함수로 생성자를 호출한다.
    //위에서 명시된 생성자는 주생성자이고 반드시 존재해야 한다.
    //아래 생성자는 부생성자이고 있어도 되고 없어도 된다.
    constructor(name: String) : this(name, 1)

    constructor() : this("강현수")
}
//코틀린에서 constructor보다는 디폴트 파라미터나, Converting과 같은 경우 부생성자가 필요할 때 정적 팩토리 메소드를 쓴다.
//사실상 부생성자를 쓸일이 없다.
class Person5(
    name: String = "강현수",
    var age: Int = 1
) {
    //함수 만들어서 로직 생성방법
    fun isAdult(): Boolean {
        return this.age >= 20
    }

    //커스텀 getter를 정의한 프로퍼티처럼 보이게 하는 기능사용
    val isAdult2: Boolean
        get() = this.age >= 20

    //body를 활용
    val isAdult3: Boolean
        get() {
          return this.age >= 20
        }

    //개인적인 의견으로 속성을 다룰땐 커스텀 getter, 나머지는 함수이용

    //custom getter
    var name: String = name
        get() = this.name.uppercase()

    //백킹필드 name을 그대로 사용하면 . 필드로 get() 함수가 실행되기 때문에 무한루프가 생긴다.
    var name2: String = name
        get() = field.uppercase()
}

fun main() {
    //getter와 setter를 사용할때 . 필드를 이용한다.
    //자바 클래스에 대해서도 . 필드로 getter, setter를 사용한다.
    val person = Person3("최태현", 100)
    println(person.name) //getter 사용
    person.age = 10 //setter 사용

    //에러 발생
    val person2 = Person4("현수", -1)
}