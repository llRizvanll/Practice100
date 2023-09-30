fun main(args: Array<String>) {

    val arr = arrayOf(intArrayOf(1, 1, 1), intArrayOf(1, 0, 1), intArrayOf(1, 1, 1))
    setZeroes(arr)
}

fun setZeroes(matrix: Array<IntArray>): Unit {
    val m = matrix.size;
    val n = matrix[0].size

    val rows = IntArray(n)
    val cols = IntArray(m)

    // O(m*n)
    for(i in 0..n-1){
        for(j in 0..m-1){

            if (matrix[i][j] == 0) {
                rows[i] = -1
                cols[j] = -1
            }
        }
    }

    for(i in 0..n-1){
        for(j in 0..m-1){
            if (rows[i] == -1 || cols[j] == -1) {
                matrix[i][j] = 0
            }
            if((j / 2)  == 0)   print(""+matrix[i][j] + " ") else println(matrix[i][i])
        }
    }

}