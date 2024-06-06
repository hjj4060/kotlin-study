package Lec03_OOP

abstract class Animal(
    protected val species: String,
    //추상 프로퍼티가 아니면, 상속받을때 open을 꼭 붙여줘야 한다.
    protected open val legCount: Int,
) {
    abstract fun move()
}

//변수뒤에 타입용으로 쓰는 : 은 변수뒤에 바로 붙여야 하고 상속으로 쓰이는 : 은 한칸띄어줘야 한다.
//상속 받을때 extends 대신에 : 을 쓴다.
class Cat(
    species: String
) : Animal(species, 4) {

    override fun move() {
        println("고양이가 사뿐 사뿐 걸어가~")
    }
}

//추상클래스 상속
class Penguin(
    species: String
) : Animal(species, 2) {
    private val wingCount: Int = 2

    override fun move() {
        println("펭귄이 움직인다~ 꽥꽥")
    }

    override val legCount: Int
        get() = super.legCount + this.wingCount
}
