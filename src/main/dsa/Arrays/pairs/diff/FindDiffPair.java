package Arrays.pairs.diff;

import java.util.HashMap;

public class FindDiffPair {
    public static int findPairs(int[] nums, int k) {
        int count =0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            if(!map.containsKey(nums[i])) {
                if(map.containsKey(nums[i] + k)) count++;
                if(map.containsKey(nums[i] - k)) count++;
                map.put(nums[i], 1);
            } else if (k == 0) {
                if(map.get(nums[i]) == 1)
                    count++;
                map.put(nums[i], map.get(nums[i]) + 1);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {3,1,4,1,5};
        //int[] arr = {1,2,3,4,5};
        int k = 1;

        System.out.println("Unique pair from diff "+ findPairs(arr,k));
    }
}
