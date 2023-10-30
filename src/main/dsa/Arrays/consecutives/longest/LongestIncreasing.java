package Arrays.consecutives.longest;
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
public class LongestIncreasing {
        public static int lengthOfLIS(int[] nums) {
            if (nums == null || nums.length == 0) {
                return 0;
            }

            int n = nums.length;
            int[] dp = new int[n];
            int maxLength = 1;

            for (int i = 0; i < n; i++) {
                dp[i] = 1; // Minimum length for any subsequence is 1
                for (int j = 0; j < i; j++) {
                    if (nums[i] > nums[j]) {
                        dp[i] = Math.max(dp[i], dp[j] + 1);
                    }
                }
                maxLength = Math.max(maxLength, dp[i]);
            }

            return maxLength;
        }

        public static void main(String[] args) {
            int[] nums = {10, 9, 2, 5, 3, 7, 101, 18};
            int result = lengthOfLIS(nums);
            System.out.println("Length of Longest Increasing Subsequence: " + result);
        }
}
