package Tencent;

import java.util.Scanner;

public class test3_me {

    public static int getSum(int a){
        int sum = 0;
        String str = String.valueOf(a);
        String[] split = str.split("");
        for (int i = 0; i < split.length; i++) {
            sum = sum + Integer.parseInt(split[i]);
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int res[] = new int[n];
        for (int i = 0; i < n; i++) {
            int T = scan.nextInt();

            int a = 0;
            int b = 0;
            int max_sum = 0;
            for (a =0;a<=T/2;a++){
                b = T - a;
                int sum_temp = getSum(a)+getSum(b);
                max_sum = Math.max(max_sum, sum_temp);
            }
            res[i] = max_sum;
        }

        for (int i = 0; i < n; i++) {
            System.out.println(res[i]);
        }

    }
}
