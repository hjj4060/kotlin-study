package 코딩테스트.프로그래머스

//https://school.programmers.co.kr/learn/courses/30/lessons/181928

fun main() {

    class Solution {
        fun solution(nums: IntArray): Int {
            val evenJoinNum = nums.filter { it % 2 == 1 }.joinToString("").toInt()
            var oddJoinNum = nums.filter { it % 2 == 0 }.joinToString("").toInt()

            return evenJoinNum + oddJoinNum
        }
    }

    val sol = Solution()
    val arr = intArrayOf(3, 4, 5, 2, 1)
    print(sol.solution(arr))
}
