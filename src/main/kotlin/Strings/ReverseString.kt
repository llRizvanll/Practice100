package Strings

import Arrays.buyandsell.maxProfit


fun main(args: Array<String>) {
    val string = "The Quick brown fox jump over the lazy dog"
    print(" "+ reverseWords(string))
}
fun reverseWords(s: String): String {
    var start = s.lastIndex
    val dq = ArrayDeque<String>()

    while(start >= 0) {
        var end = start
        while(start >= 0 && s[start] != ' ') start-- // O(N)
        dq.addLast(s.substring(start + 1, end + 1)) // O(N)
        while(start >= 0 && s[start] == ' ') start-- //O(N)
    }

    return dq.joinToString(" ").trim() // O(N)
}