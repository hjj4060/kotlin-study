package 코딩테스트.프로그래머스

//https://school.programmers.co.kr/learn/courses/30/lessons/178871

fun main() {

    /**
     * 설계
     * 1. players를 map에 key: players이름 value: 순위 로 담는다.
     * 2. callings를 for문을 돌아서 players[calling명]의 순위를 현재순위에서 -1
     * 3. calling 앞에 있는 선수를 현재순위에서 +1
     */
    class Solution {
        fun solution(players: Array<String>, callings: Array<String>): Array<String?> {
            var answer: Array<String?> = arrayOf<String?>()

            val playersAndRank = mutableMapOf<String?, Int?>()
            for ((idx, value) in players.withIndex()) {
                playersAndRank[value] = idx
            }

            for ((idx, value) in callings.withIndex()) {
                //callings 사람 앞에있는 players의 이름을 가져온다.
                val frontPlayerName = playersAndRank
                    .filter { it.value == playersAndRank[value]?.minus(1) }
                    .keys.firstOrNull()

                playersAndRank[value] = playersAndRank[value]?.minus(1)
                playersAndRank[frontPlayerName] = playersAndRank[frontPlayerName]?.plus(1)
            }

            //playersAndRank의 Map의 value 순으로 정렬을 하고 key로 list를 만들고 타입을 배열로 만든다.
            answer = playersAndRank.toList()
                .sortedBy { (_, value) -> value }
                .map { (key, _) -> key }
                .toTypedArray()

            return answer
        }
    }

    val sol = Solution()

    val players = arrayOf("mumu", "soe", "poe", "kai", "mine")
    val callings = arrayOf("kai", "kai", "mine", "mine");

    print(sol.solution(players, callings).toList())
}