package Arrays.consecutives;

/**
 * Given a binary array nums, return the maximum number of consecutive 1's in the array.
 *  Max Consecutive Ones
 *
 *
 *  Example 1:
 *
 * Input: nums = [1,1,0,1,1,1]
 * Output: 3
 * Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
 * Example 2:
 *
 * Input: nums = [1,0,1,1,0,1]
 * Output: 2
 *
 *
 * Constraints:
 *
 * 1 <= nums.length <= 105
 * nums[i] is either 0 or 1.
 *
 */
public class ConsecutiveOnes {

    public static int findMaxConsecutiveOnes(int[] nums) {

        int max = 0, consecutiveMax = 0;

        for (int item: nums)
            max = Math.max(max, consecutiveMax = item == 0 ? 0 : consecutiveMax + 1);

        return max;
    }



    public static void main(String[] args) {
        // Print consecutive ones
        int[]  numbers = {1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(numbers)+ " output ");
    }
}
