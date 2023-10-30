package Arrays.triplet

/**
 * Given an integer array nums, return true if there exists a triple of indices (i, j, k) such that i < j < k and nums[i] < nums[j] < nums[k]. If no such indices exists, return false.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,3,4,5]
 * Output: true
 * Explanation: Any triplet where i < j < k is valid.
 * Example 2:
 *
 * Input: nums = [5,4,3,2,1]
 * Output: false
 * Explanation: No triplet exists.
 * Example 3:
 *
 * Input: nums = [2,1,5,0,4,6]
 * Output: true
 * Explanation: The triplet (3, 4, 5) is valid because nums[3] == 0 < nums[4] == 4 < nums[5] == 6.
 *
 *
 * Constraints:
 *
 * 1 <= nums.length <= 5 * 105
 * -231 <= nums[i] <= 231 - 1
 *
 * time complexity of O(N) and a space complexity of O(1).
 */
fun increasingTriplet(nums: IntArray): Boolean {
    var firstMin = Int.MAX_VALUE
    var secondMin = Int.MAX_VALUE

    for (num in nums) {
        when {
            num <= firstMin -> firstMin = num
            num <= secondMin -> secondMin = num
            else -> return true
        }
    }

    return false
}

fun main() {
    val nums = intArrayOf(16, 8, 5, 9, 4, 11, 3, 17, 1)
    val result = increasingTriplet(nums)
    println("Result: $result") // Should print true
}
