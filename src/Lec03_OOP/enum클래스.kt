package Lec03_OOP

fun handleCountry(country: Country) {
    //코틀린에서는 when을 사용해서 조금 더 읽기 쉬운 코드로 바꿀 수 있다.
    //컴파일러가 컨트롤의 모든 타입을 알고 있기 때문에 다른 타입에 대한 로직, else에 대한 로직을 따로 안만들어줘도 된다.
    //enum의 변화를 warning으로 알수 있다.
    when (country) {
        Country.KOREA -> TODO()
        Country.AMERICA -> TODO()
    }
}

enum class Country (
    //코틀린에서는 필드를 생성자와 함께 바로 만든다.
    private val code: String
) {
    KOREA("KO"),
    AMERICA("US")
    ;
}