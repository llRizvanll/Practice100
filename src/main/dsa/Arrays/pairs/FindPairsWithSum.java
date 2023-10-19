package Arrays.pairs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/***
 * https://www.geeksforgeeks.org/print-all-pairs-with-given-sum/
 *
 * Given an array of integers, and a number ‘sum’, print all pairs in the array whose sum is equal to ‘sum’.
 *
 * Examples :
 * Input  :  arr[] = {1, 5, 7, -1, 5},
 *           sum = 6
 * Output : (1, 5) (7, -1) (1, 5)
 * Input  :  arr[] = {2, 5, 17, -1},
 *           sum = 7
 * Output :  (2, 5)
 */
public class FindPairsWithSum {

    public static void main(String[] args) {
        int[] arr = {2, 4, 3, 1, 5, 6, 7};
        int targetSum = 8;

        List<Pair> pairs = findPairsInSum(arr,targetSum);
        for (Pair pair : pairs) {
            System.out.println("(" + pair.getFirst() + ", " + pair.getSecond() + ")");
        }
    }

    private static List<Pair> findPairsInSum(int[] arr, int targetSum) {
        Map<Integer,Integer> map = new HashMap<>();
        ArrayList<Pair> pairList = new ArrayList<>();

        for (int num :
                arr) {
            int sumValue = targetSum - num;
            if(map.containsKey(sumValue)){
                pairList.add(new Pair(num,sumValue));
            }
            map.put(num,1);
        }

        return pairList;
    }

    static class Pair {
        private final int first;
        private final int second;

        public Pair(int first,int second){
            this.first = first;
            this.second = second;
        }

        public int getFirst() {
            return first;
        }

        public int getSecond() {
            return second;
        }
    }
}
