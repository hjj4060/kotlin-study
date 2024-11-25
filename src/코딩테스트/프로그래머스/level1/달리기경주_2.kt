package 코딩테스트.프로그래머스.level1

//https://school.programmers.co.kr/learn/courses/30/lessons/178871
fun main() {
    val players = arrayOf("mumu", "soe", "poe", "kai", "mine")
    val callings = arrayOf("kai", "kai", "kai", "poe", "poe", "poe")

    //시간초과
    class Solution {
        fun solution(players: Array<String>, callings: Array<String>): Array<String> {
            var answer: Array<String> = arrayOf<String>()

            //map 자료구조에 (이름, 순위) 를 넣는다.
            //calling 불리우는 키를 찾아서 순위 -1 앞에있는 사람찾아서 순위 +1
            val playerRanking = players.mapIndexed { index, player ->
                player to index
            }.toMap().toMutableMap()

            callings.forEach {
                val callingRanking = playerRanking[it]!!
                //find를 통해 처음부터 끝까지 순위가 맞는사람을 찾기 때문에 타임아웃 에러가 발생
                val callingFrontName = playerRanking.entries.find { it.value == callingRanking.minus(1) }!!.key
                playerRanking[it] = callingRanking.minus(1)
                playerRanking[callingFrontName] = playerRanking[callingFrontName]!!.plus(1)
            }

            return playerRanking.entries.sortedBy {
                it.value
            }.map {
                it.key
            }.toTypedArray()
        }
    }

    val sol = Solution()
    println(sol.solution(players, callings).toList())
}
