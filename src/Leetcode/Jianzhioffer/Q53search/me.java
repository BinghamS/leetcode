package Leetcode.Jianzhioffer.Q53search;

public class me {
    public int search(int[] nums, int target) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) count++;
            else if (count!=0 && nums[i]!= target) return count;
        }
        return count;
    }
}
