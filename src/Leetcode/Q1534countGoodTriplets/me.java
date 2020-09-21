package Leetcode.Q1534countGoodTriplets;

import java.util.Arrays;

public class me {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
//        Arrays.sort(arr);
        int count = 0;
        for (int i = 0; i < arr.length-2; i++) {
            for (int j = i+1; j < arr.length-1; j++) {
                for (int k = j+1; k < arr.length; k++) {
                    Boolean x = Math.abs(arr[i]-arr[j]) <=a;
                    Boolean y = Math.abs(arr[j]-arr[k]) <=b;
                    Boolean z = Math.abs(arr[i]-arr[k]) <=c;
                    if (x && y&& z) count++;
                }
            }
        }

        return count;
    }
}
