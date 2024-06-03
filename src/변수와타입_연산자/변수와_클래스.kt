package 변수와타입_연산자

fun main() {
    var a = 12 //var은 변경 가능, 타입은 값에 의해서 추론이 된다. 타입추론이라고 함
    val b = 15 //val은 변경 불가능 final 역할
    var a2: Int //값없는 변수 설정  int a; 와 같음
    val a3: Int = 15
    //final과 동일한 역할
    //팁 : val을 기본적으로 쓰고 필요할때 var 사용

    //primitive 타입과 Reference 타입을 구하하지 않아도 된다.
    //null을 대입하려면 ?를 붙여야 한다. 코틀린은 변수에 null이 들어갈수 있는지 없는지를 애당초 표시를 해줘야 한다.
    var a5: Int? = null

    //클래스 생성법
    class Person(
        val name: String,  //val은 getter만 존재
        var isMarried: Boolean //var은 getter, setter 존재
    )

    //코틀린에서는 클래스 객체 생성할 때 new를 써주면 안된다.
    var person = Person("현수", false)
}