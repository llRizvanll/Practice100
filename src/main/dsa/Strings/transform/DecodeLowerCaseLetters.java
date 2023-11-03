package Strings.transform;

/**
 *          // Decrypt a string where every lowercase letter [a..z]
 *         // is replaced with the corresponding one in [z..a],
 *         // while every other character (including uppercase letters and punctuation) is left untouched. That is, 'a' becomes 'z', 'b' becomes 'y', 'c' becomes 'x', etc.
 *
 *         // For instance, the word ""vmxibkgrlm"", when decoded, would become ""encryption"".
 *         // Sample Test Cases:
 *
 *         // Input:- Yvzs! I xzm'g yvorvev Lzmxv olhg srh qly zg gsv xlolmb!!
 *         // Output:- Yeah! I can't believe Lance lost his job at the colony!!
 *
 *         //
 *
 *         // Input:- wrw blf hvv ozhg mrtsg'h vkrhlwv?
 *         // Output:- did you see last night's episode?
 */
public class DecodeLowerCaseLetters {

        public static void main(String[] args) {
            String input1 = "Yvzs! I xzm'g yvorvev Lzmxv olhg srh qly zg gsv xlolmb!!";
            String input2 = "wrw blf hvv ozhg mrtsg'h vkrhlwv?";

            System.out.println("Answer to first input : "+ decrypt(input1)); //Yeah! I can't believe Lance lost his job at the colony!!

            System.out.println("Answer to second input : "+ decrypt(input2));//did you see last night's episode?
        }

    public static String decrypt(String encrypted) {
        StringBuilder decrypted = new StringBuilder();
        for (char c : encrypted.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                // Calculate the corresponding letter in the reversed alphabet
                char reversed = (char) ('z' - (c - 'a'));
                decrypted.append(reversed);
            } else {
                // Leave all other characters unchanged
                decrypted.append(c);
            }
        }
        return decrypted.toString();
    }


}
