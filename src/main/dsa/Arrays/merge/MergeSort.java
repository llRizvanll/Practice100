package Arrays.merge;

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class MergeSort {

    public static void getMergedArray(int[] a, int[] b, int n, int m) {
        int i = n - 1;
        int j = m - 1;
        int  lastIndex = n + m - 1;

        // merge a & b based on comparison
        while(j >= 0 ){
            if (i >= 0 && a[i] > b[j]) {

                // copy element ,  possible of first array all less only
                a[lastIndex] = a[i];
                i--;
            }
            else {

                a[lastIndex] = b[j];
                j--;

            }

            // move the indices here
            lastIndex--;
        }
    }

    public static void main(String[] args) {

        //System.out.println("Hello, World!");
        int[] a = {2,3,4,5,10,-1,-1,-1,-1}; //ascending order
        int[] b = {6,9,11,15};  // ascending order

        //System.out.println(" output of merged array is => "+getMergedArray(a,b,5,5));
        getMergedArray(a,b,5,4);

        int bothArraySize = 9;
        for (int i =0; i < bothArraySize ; i++){
            System.out.println(a[i]);
        }

        //output => [2,3,4,5,6,9,10,11,15] // outcome will be in ascending order
        //time complexity // O(m+n)
        //space complexity

    }
}