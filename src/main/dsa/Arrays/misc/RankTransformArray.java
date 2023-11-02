package Arrays.misc;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class RankTransformArray {
    public static int[] arrayRankTransform(int[] arr) {
        int[] rankedArray = arr.clone();
        Map<Integer, Integer> map = new LinkedHashMap<>();
        Arrays.sort(arr);
        int rank = 1;
        if(arr.length==0) return arr;
        int prev = arr[0];

        for (int num : arr) {
            if (prev != num) {
                rank++;
            }
            map.putIfAbsent(num, rank);
            prev = num;
        }

        for (int i = 0; i < rankedArray.length; i++) {
            rankedArray[i] = map.get(rankedArray[i]);
        }

        return rankedArray;
    }

    public static void main(String[] args) {
        //int[] arr = {40,10,20,30};
        int[] arr = {37,12,28,9,100,56,80,5,12};
        System.out.println(" Transformed and ranked array for given array "+ Arrays.toString(Arrays.stream(arrayRankTransform(arr)).toArray()));
    }
}
