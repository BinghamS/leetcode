package test;

import java.util.HashMap;
import java.util.Scanner;

public class run {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
            String s2= scanner.nextLine();
            String[] s3 = s2.split(" ");
            int k = Integer.parseInt(s3[0]);
            int n = Integer.parseInt(s3[1]);
            int[] arr = new int[n];
            String str = scanner.nextLine();
            String[] s1 = str.split(" ");
            for (int i = 0; i < s1.length; i++) {
                arr[i] = Integer.parseInt(s1[i]);
            }
            me me = new me();
            String s = me.solution(k, n, arr);
        System.out.println(s);
    }

}
