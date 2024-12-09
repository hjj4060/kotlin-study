package 코딩테스트.프로그래머스.level1


fun main() {
    val players = arrayOf("mumu", "soe", "poe", "kai", "mine")
    val callings = arrayOf("kai", "kai", "kai", "poe", "poe", "poe")

    //시간초과
    class Solution {
        fun solution(players: Array<String>, callings: Array<String>): Array<String> {
            var answer = Array<String>(players.size, { "  " })
            var rank = HashMap<Int, String>()
            var player = HashMap<String, Int>()

            for (i in players.indices) {
                rank[i] = players[i]
                player[players[i]] = i
            }

            callings.forEach {
                val winer = it
                val winerrank = player[it]!! - 1

                val loser = rank[winerrank]!!

            }

            return answer
        }
    }

    val sol = Solution()
    println(sol.solution(players, callings).toList())
}
