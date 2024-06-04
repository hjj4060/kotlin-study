package Lec02_코드제어

//1차 - return문을 if문 앞에 둬서 statement 활용
fun max(a: Int, b: Int): Int {
    return if (a > b) {
        a
    } else {
        b
    }
}

//2차 - return문을 지우고 = 을 이용한다.
fun max2(a: Int, b: Int): Int =
    if (a > b) {
        a
    } else {
        b
    }

//3차 - 한줄로 변환한다.
fun max3(a: Int, b: Int): Int = if (a > b) a else b

//4차 - = 을 이용하면 타입반환도 없앨수 있다. 만약 block {} 을 사용하면 반환타입이 Unit이 아니라면 명시적으로 작성해야 한다.
fun max4(a: Int, b: Int) = if (a > b) a else b


