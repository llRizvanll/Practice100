package Arrays.consecutives.fliptomax;

/**
 * Given a binary array nums and an integer k, return the maximum number of consecutive 1's in the array if you can flip at most k 0's.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
 * Output: 6
 * Explanation: [1,1,1,0,0,1,1,1,1,1,1]
 * Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.
 * Example 2:
 *
 * Input: nums = [0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1], k = 3
 * Output: 10
 * Explanation: [0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1]
 * Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.
 * Constraints:
 * 1 <= nums.length <= 105
 * nums[i] is either 0 or 1.
 * 0 <= k <= nums.length
 *
 * https://leetcode.com/problems/max-consecutive-ones-iii/description/
 */
public class FlipToMaxConsecutive {


    public static int longestOnes(int[] A, int K) {
        int zeroCount=0,start=0,res=0;
        for(int end=0;end<A.length;end++){
            if(A[end] == 0) zeroCount++;
            while(zeroCount > K){
                if(A[start] == 0) zeroCount--;
                start++;
            }
            res=Math.max(res,end-start+1);
        }
        return res;
    }

    public static void main(String[] args) {
        //int[]  numbers = {1,1,0,1,1,1};
        int[] numbers = {1,1,1,0,0,0,1,1,1,1,0};
        System.out.println(longestOnes(numbers,2)+ " output ");
    }
}
