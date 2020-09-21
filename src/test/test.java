package test;

import java.util.Scanner;
public class test {
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
        int sum = 0;
        int num = 0;
        int distance = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum == k) System.out.println("paradox");
            else if (sum > k){
                distance = sum - k;
                sum = k - distance;
                num++;
            }else{
                distance = k-sum;
            }
        }
        System.out.println(distance + " " + num);
    }
}