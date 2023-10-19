package Arrays.pairs

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
class Pair(val first: Int, val second: Int)

fun findPairsWithSum(arr: IntArray, targetSum: Int): List<Pair> {
    val pairs = ArrayList<Pair>()
    val seen = HashMap<Int, Int>()

    for (num in arr) {
        val complement = targetSum - num
        if (seen.containsKey(complement)) {
            pairs.add(Pair(num, complement))
        }
        seen[num] = 1
    }

    return pairs
}

fun main() {
    val arr = intArrayOf(2, 4, 3, 1, 5, 6, 7)
    val targetSum = 8
    val result = findPairsWithSum(arr, targetSum)

    for (pair in result) {
        println("(${pair.first}, ${pair.second})")
    }
}
