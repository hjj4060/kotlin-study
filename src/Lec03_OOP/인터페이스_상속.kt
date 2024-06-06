package Lec03_OOP

interface Flyable {
    //디폴트 메소드는 default 키워드 없이 메소드 구현이 가능하다
    fun act() {
        println("파닥 파닥")
    }
}

interface Swimable {
    fun act() {
        println("어푸 어푸")
    }
}

class Penguin2(
    species: String
    //인터페이스 구현도 : 을 이용한다. extends와 implement 를 구분하지 않는다.
) : Animal(species, 2), Swimable, Flyable {
    private val wingCount: Int = 2

    override fun move() {
        println("펭귄이 움직인다~ 꽥꽥")
    }

    override val legCount: Int
        get() = super.legCount + this.wingCount

    override fun act() {
        //중복되는 인터페이스를 특정할 때는 super<타입>.함수를 사용한다. 자바에서는 super.타입.함수 이다.
        super<Flyable>.act()
        super<Swimable>.act()
    }
}