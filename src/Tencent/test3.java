package Tencent;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int tmp = n%10;
        int result = 0;
        while(n/10 > 0){
            n = n/10;
            result+=tmp+10;
            tmp = n%10-1;
        }

        System.out.println(result);
    }
}
