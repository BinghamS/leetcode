package Tencent;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s2 = scan.nextLine();
        String[] s3 = s2.split(" ");
        int n = Integer.parseInt(s3[0]);
        int k = Integer.parseInt(s3[1]);

        String s = scan.nextLine();
        String[] s1 = s.split(" ");
        int[] arr = new int[n];
        int[] res = new int[n-1];
        int j = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(s1[i]);
            if (i != k-1) {
                res[j] = Integer.parseInt(s1[i]);
                j++;
            }

        }

        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }

    }
}
