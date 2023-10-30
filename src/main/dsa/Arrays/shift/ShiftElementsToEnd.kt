package Arrays.shift

fun main() {
    val arr = intArrayOf(4, 7, 2, 4, 9, 5, 1, 4)
    val digitToMove = 4

    moveDigitToEndInPlace(arr, digitToMove)

    println("Original Array: ${arr.joinToString(", ")}")
}

fun moveDigitToEndInPlace(arr: IntArray, digit: Int) {
    var index = 0

    for (i in arr.indices) {
        if (arr[i] != digit) {
            val temp = arr[i]
            arr[i] = arr[index]
            arr[index] = temp
            index++
        }
    }
}
