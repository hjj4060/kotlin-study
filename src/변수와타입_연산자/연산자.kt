package 변수와타입_연산자

fun main() {
    class JavaMoney(val amount: Long): Comparable<JavaMoney> {
        override fun compareTo(other: JavaMoney): Int {
//            return amount.compareTo(other.amount)
            return compareValues(amount, other.amount)
        }

        override fun equals(other: Any?): Boolean {
            if(other is JavaMoney) {
                return amount == other.amount
            }

            return false
        }
    }

    val money1 = JavaMoney(3_000L)
    val money2 = JavaMoney(2_000L)
    val money3 = money1;
    val money4 = JavaMoney(3_000L);

    //객체끼리의 비교는 자동으로 compareTo 함수를 실행시킨다.
    if(money1 > money2){
        println("money1 is greater than money2")
    }

    println(money1 === money3) //money3와 money1은 주소가 같다. ===비교로 주소가 같은지 확인
    println(money1 === money2) //money1과 money2는 주소와 값 모두 틀리다.
    println(money1 == money4) //money1과 money4는 값이 같다. == 비교로 equals()함수가 호출돼서 true가 반환된다.
}