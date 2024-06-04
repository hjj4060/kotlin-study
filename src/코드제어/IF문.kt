package 코드제어

import java.beans.Expression

/**
 * 자바에서는 if문은 Statement지만 코틀린에서는 Expression이다.
 * Statement : 프로그램의 문장, 하나의 값으로 도출되지 않는다.
 *
 * Expression: 하나의 값으로 도출되는 문장
 */
fun validateScoreIsNotNegative(score: Int) {
    if (score < 0) {
        throw IllegalArgumentException("${score}는 0보다 작을 수 없습니다.")
    }
}

fun getPassOrFail(score: Int): String {
    if(score < 0) {
        return "P"
    } else {
        return "F"
    }
}

fun getGrade(score: Int): String {
    //if문이 statement여서 if문 앞에 return을 앞에 둘수 있다.
    return if (score >= 90) {
        "A"
    } else if (score >= 80) {
        "B"
    } else if (score >= 70) {
        "C"
    } else {
        "D"
    }
}

//Expr 인터페이스를 만들고 구현체 2개를 만든다.
interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr

fun eval(e: Expr): Int {
    if (e is Num) {
        return e.value
    }
    if (e is Sum) {
        return eval(e.left) + eval(e.right)
    }
    throw IllegalArgumentException("Unknown expression")
}

fun main() {
    println(eval(Sum(Sum(Num(1), Num(2)), Num(4))))
    println(getGrade(80))
}