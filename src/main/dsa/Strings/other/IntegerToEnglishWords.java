package Strings.other;

public class IntegerToEnglishWords {

        public static String numberToWords(int num) {
            if (num == 0 )
                return "Zero";
            return helper(num).trim();
        }

    private static String helper(int num) {
        int billion = 1000000000;
        int million = 1000000;
        int thousand = 1000;
        int hundred = 100;
        int ten = 10;

        String[] tens = {"","Ten","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty",
                "Ninety"};
        String[] ones = {"", "One","Two","Three","Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven","Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};

        StringBuilder sb = new StringBuilder();
        if (num >= billion) {
            sb.append(helper(num / billion)).append(" Billion ").append( helper(num % billion));
        } else if  (num >= million) {
            sb.append(helper(num / million)).append(" Million ").append( helper(num % million));
        }else if (num >= thousand) {
            sb.append(helper(num / thousand)).append(" Thousand ").append( helper(num % thousand));
        }else if (num >= hundred) {
            sb.append(helper(num / hundred)).append(" Hundred ").append( helper(num % hundred));
        }else if (num >= 20) {
            sb.append(tens[num / ten]).append(" ").append( helper(num % ten));
        } else {
            sb.append(ones[num]);
        }
        return sb.toString().trim();

    }

    public static void main(String[] args) {
        System.out.println("--> "+numberToWords(123)); // One Hundred Twenty Three
    }

}
