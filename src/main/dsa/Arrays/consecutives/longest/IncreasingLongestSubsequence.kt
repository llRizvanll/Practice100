/**
 * Given an integer array nums, return the length of the longest strictly increasing
 * subsequence
 * .
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [10,9,2,5,3,7,101,18]
 * Output: 4
 * Explanation: The longest increasing subsequence is [2,3,7,101], therefore the length is 4.
 * Example 2:
 *
 * Input: nums = [0,1,0,3,2,3]
 * Output: 4
 * Example 3:
 *
 * Input: nums = [7,7,7,7,7,7,7]
 * Output: 1
 *
 *
 * Constraints:
 *
 * 1 <= nums.length <= 2500
 * -104 <= nums[i] <= 104
 *
 * https://leetcode.com/problems/longest-increasing-subsequence/description/
 */


fun lengthOfLIS(nums: IntArray): Int {
    if (nums.isEmpty()) {
        return 0
    }

    val n = nums.size
    val dp = IntArray(n) { 1 }
    var maxLength = 1

    for (i in 0 until n) {
        for (j in 0 until i) {
            if (nums[i] > nums[j]) {
                dp[i] = maxOf(dp[i], dp[j] + 1)
            }
        }
        maxLength = maxOf(maxLength, dp[i])
    }

    return maxLength
}

fun main() {
    val nums = intArrayOf(10, 9, 2, 5, 3, 7, 101, 18)
    val result = lengthOfLIS(nums)
    println("Length of Longest Increasing Subsequence: $result")
}
