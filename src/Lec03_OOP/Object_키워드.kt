package Lec03_OOP

interface Log {
    fun log()
}

class PersonObject private constructor(
    var name: String,
    var age: Int
) {
    //자바에서는 static
    //인터페이스도 구현가능
    companion object Factory : Log {
        private val MIN_AGE = 1

        fun newBaby(name: String): PersonObject {
            return PersonObject(name, MIN_AGE)
        }

        override fun log() {
            println("로그")
        }
    }
}

//object만 있으면 싱글톤이 된다.
object Singleton {
    var a: Int = 0
}

fun main() {
    println(Singleton.a)
    Singleton.a += 10
    println(Singleton.a)
}