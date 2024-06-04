package Lec02_코드제어

import java.io.BufferedReader
import java.io.File
import java.io.FileReader

//try catch finally문은 자바와 동일하다.
fun parseIntOrThrow(str: String): Int {
    try {
        return str.toInt()
    } catch (e: NumberFormatException) {
        throw IllegalArgumentException("주어진 ${str}은 숫자가 아닙니다.")
    }
}

//try catch문 역시 expression 이여서 return 이 앞에 올 수 있다.
fun parseIntOrThrow2(str: String): Int? {
    return try {
        str.toInt()
    } catch (e: NumberFormatException) {
        null
    }
}

//코틀린은 Checked Exception과 Unchecked Exception을 구분하지 않는다. 모두 Unchecked Exception이다.
class FilePrinter {
    fun readFile() {
        val currentFile = File(".")
        val file = File(currentFile.absolutePath + "/a.txt")
        val reader = BufferedReader(FileReader(file))
        println(reader.readLine())
        reader.close()
    }

    //코틀린에서는 try with resources가 사라지고 use라는 확장함수를 사용한다.
    fun readFile2(path: String) {
        BufferedReader(FileReader(path)).use { reader -> {
            println(reader.readLine())
        }}
    }
}

fun main() {
    val fileReader = FilePrinter()
    println(fileReader.readFile())
}