package Lec03_OOP

/**
 * Sealed 클래스는
 * 상속이 가능하도록 추상클래스를 만들까하는데 외부에서는 이 클래스를 상속받지 않았으면 좋겠어 라는 고민에서 생겨났다.
 *
 * 컴파일 타임 때 하위 클래스의 타입을 모두 기억한다. 런타임때 클래스 타입이 변경될 수 없다.
 * 하위 클래스는 같은 패키지에 있어야 한다.
 *
 * Enum과 다른점은 클래스를 상속받을 수 있다., 하위 클래스는 멀티 인스턴스가 가능하다.
 * 동일한점은 when을 사용하면 강력하게 이용할 수 있다.
 * 추상화가 필요한 Entity or DTO에 sealed class를 활용
 */

sealed class HyundaiCar(
    val name: String,
    val price: Long,
)

class Avante : HyundaiCar("아반떼", 1000L)
class Sonata : HyundaiCar("소나타", 2000L)
class Grandeur : HyundaiCar("그랜져", 3000L)

private fun handleCar(car: HyundaiCar) {
    when (car) {
        is Avante -> println(car.name)
        is Grandeur -> println(car.name)
        is Sonata -> println(car.name)
    }
}

fun main() {
    handleCar(Avante())
    handleCar(Grandeur())
    handleCar(Sonata())
}

