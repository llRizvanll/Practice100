package Arrays.consecutives

fun main(args: Array<String>) {
    val numbers : IntArray = intArrayOf(1,1,0,1,1,1)

    print("output is => "+getMaxConsecutiveOnes(numbers))
}

fun getMaxConsecutiveOnes(num: IntArray): Int {
    var max = 0;
    var counter = 0;
    num.forEach { item ->
        when (item){
            1 -> counter++
            else -> {
                max = Math.max(counter, max);
                counter = 0
            }
        }
    }

    return Math.max(counter,max);
}