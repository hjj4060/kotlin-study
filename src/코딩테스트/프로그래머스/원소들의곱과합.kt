package 코딩테스트.프로그래머스

import kotlin.math.pow

//https://school.programmers.co.kr/learn/courses/30/lessons/181929?language=kotlin

fun main() {

    class Solution {
        fun solution(num_list: IntArray): Int {
            var answer: Int = 0
            var productElementValue = productElement(num_list)
            var plusElementAndSquareValue = plusElementAndSquare(num_list)

            answer = if (productElementValue < plusElementAndSquareValue) {
                1
            } else {
                0
            }

            return answer
        }

        private fun productElement(num_list: IntArray): Int {
            var productElementValue = 1

            for (idx in num_list.indices) {
                println("num : ${num_list[idx]}")
                productElementValue *= num_list[idx]
            }

            return productElementValue;
        }

        private fun plusElementAndSquare(num_list: IntArray): Int {
            var plusElementAndSquareValue: Double = 0.0

            for (idx in num_list.indices) {
                plusElementAndSquareValue += num_list[idx];
            }

            return plusElementAndSquareValue.pow(2).toInt()
        }
    }

    val sol = Solution();
    var array = intArrayOf(5, 7, 8, 3)
    println(sol.solution(array));
}