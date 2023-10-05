package Strings.reversestring.word

/**
 * Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "Let's take LeetCode contest"
 * Output: "s'teL ekat edoCteeL tsetnoc"
 * Example 2:
 *
 * Input: s = "God Ding"
 * Output: "doG gniD"
 */
fun main(args: Array<String>) {
    val stringArr = "ABCDEFGHI"
    print("word in reverse order "+ getReverseString(stringArr))
}

fun getReverseString(str: String): String {
    val result = StringBuilder()
    var word = ""

    for (ch in str.toCharArray()) {
        if (ch == ' ') {
            result.append(word).append(ch);
            word = "";
        } else {
            word = ch + word
        }
    }

    return result.toString() + word
}
