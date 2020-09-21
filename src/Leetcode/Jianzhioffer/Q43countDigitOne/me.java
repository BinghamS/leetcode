package Leetcode.Jianzhioffer.Q43countDigitOne;

public class me {
    public static int getOntNum(int n){
        int count = 0;

        while (n > 0){
            int temp = n%10;
            if (temp == 1){
                count++;
            }
            n = n/10;
        }

        return count;
    }
    public int countDigitOne(int n) {
        int count = 0 ;
        for (int i = 1; i <= n; i++) {
            int num = getOntNum(i);
            count+=num;
        }

        return count;
    }
}
