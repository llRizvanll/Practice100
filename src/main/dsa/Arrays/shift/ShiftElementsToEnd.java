package Arrays.shift;

import java.util.Arrays;

public class ShiftElementsToEnd {
    public static void main(String[] args) {
        int[] arr = {4, 7, 2, 4, 9, 5, 1, 4};
        int digitToMove = 4;

        moveDigitToEndInPlace(arr, digitToMove);

        System.out.println("Original Array: " + Arrays.toString(arr));
    }

    public static void moveDigitToEndInPlace(int[] arr, int digit) {
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != digit) {
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
                index++;
            }
        }
    }
}
