package Lec01_변수와타입_연산자

fun main() {

}

private fun startWithA1(str: String?): Boolean {
    if (str == null) {
        throw IllegalArgumentException("null이 들어왔습니다.")
    }
    return str.startsWith("A")
}

private fun startWithA2(str: String?): Boolean? {
    //null 처리를 해주지 않으면 에러난다.
    //return str.startsWith("A")

    //?를 붙여주면 str이 null일때 null을 반환한다.
    //앞에 ?는 safe call이라고 하고 null이 아닐 경우에 호출된다.
    return str?.startsWith("A")
}

private fun startWithA3(str: String?): Boolean? {
    //뒤에 ?: 는 엘비스 연산자라 불리고 null일 경우에 호출된다.
    return str?.startsWith("A") ?: null
}

private fun startWithA4(str: String?): Boolean? {
    //이 변수는 절대 null이 아닐 경우에는 !!를 붙여준다.
    //혹시라도 null이 들어오면 nullpointerException에러가 난다.
    return str!!.startsWith("A")
}