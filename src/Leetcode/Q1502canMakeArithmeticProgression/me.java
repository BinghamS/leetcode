package Leetcode.Q1502canMakeArithmeticProgression;

import java.util.Arrays;

public class me {
    public boolean canMakeArithmeticProgression(int[] arr) {
        if (arr.length == 0 || arr == null)return false;
        Arrays.sort(arr);
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (i == 0) temp = arr[i+1] - arr[i];
            if (arr[i+1]-arr[i] != temp){
                return false;
            }
        }
        return true;
    }
}
