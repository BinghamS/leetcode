package Leetcode.Q283moveZeroes;

import java.util.Arrays;

public class me {
    public void moveZeroes(int[] nums) {
        int arr[] = new int[nums.length];
        Arrays.fill(arr,0);
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=0){
                arr[j] = nums[i];
                j++;
            }
        }
        nums = arr;
    }

}
