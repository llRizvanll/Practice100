package Strings.reversestring.word;

/**
 * Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

 * Example 1:
 *
 * Input: s = "Let's take LeetCode contest"
 * Output: "s'teL ekat edoCteeL tsetnoc"
 * Example 2:
 *
 * Input: s = "God Ding"
 * Output: "doG gniD"
 *
 */
public class ReverseWord1 {


    public static final String getReverseString(String str) {
        StringBuilder result = new StringBuilder();
        String word = "";

        for (char ch :
                str.toCharArray())
            if (ch == ' ') {
                result.append(word).append(ch);
                word = "";
            } else {
                word = ch + word;
            }
        return result + word;
    }

    public static void main(String[] args) {
        String s = "ABCDEFGHI";
        System.out.println(getReverseString(s)+" output");;
    }
}
