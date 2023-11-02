package scenario;

import java.util.ArrayList;
import java.util.List;

public class LockScreenCombinations {
    public static void main(String[] args) {
        int[] dots = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int numSelected = 5;

        List<List<Integer>> combinations = generateCombinations(dots, numSelected);

        System.out.println("Total combinations of selecting five dots: " + combinations.size());

        // Uncomment the following lines to print all combinations
         for (List<Integer> combo : combinations) {
             System.out.println(combo);
         }
    }

    public static List<List<Integer>> generateCombinations(int[] dots, int numSelected) {
        List<List<Integer>> result = new ArrayList<>();
        generateCombinationsHelper(dots, numSelected, 0, new ArrayList<>(), result);
        return result;
    }

    private static void generateCombinationsHelper(int[] dots, int numSelected, int start, List<Integer> current, List<List<Integer>> result) {
        if (numSelected == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = start; i < dots.length; i++) {
            current.add(dots[i]);
            generateCombinationsHelper(dots, numSelected - 1, i + 1, current, result);
            current.remove(current.size() - 1);
        }
    }
}
