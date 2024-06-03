package 코드제어

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

fun main() {

}