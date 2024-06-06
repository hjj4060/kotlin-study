package Lec03_OOP

fun main() {
    moveSomething(object : Movable {
        //Java에서는 new 타입이름(), Kotlin에서는 object : 타입이름
        override fun move() {
            println("무브")
        }

        override fun fly() {
            println("날다")
        }
    })
}

interface Movable {
    fun move()
    fun fly()
}

private fun moveSomething(movable: Movable) {
    movable.move()
    movable.fly()
}