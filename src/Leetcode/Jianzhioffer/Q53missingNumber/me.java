package Leetcode.Jianzhioffer.Q53missingNumber;

import java.util.Arrays;

public class me {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length + 1; i++) {
            if (i == nums.length) return i++;
            if (nums[i] != i){
                return i;
            }
        }
        return 0;
    }
}
