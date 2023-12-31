package Arrays.misc;

public class PerfectDivisorNumber {

    public static boolean checkPerfectNumber(int num) {
        if(num==1) return false;

        int i = 2;
        int sq =(int)Math.sqrt(num);
        int sum=1;
        while(i<=sq){
            if(num%i==0) {
                sum+=i;
                sum+=num/i;
            }
            i++;
        }
        if(sum==num) return true;

        return false;
    }

    public static void main(String[] args) {
        System.out.println(" Is this perfect number ? : "+checkPerfectNumber(28));
    }
}
