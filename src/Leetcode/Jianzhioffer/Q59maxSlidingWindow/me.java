package Leetcode.Jianzhioffer.Q59maxSlidingWindow;

public class me {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length< k){
            return nums;
        }
        int max = 0;
        int max1 = 0;
        int [] res = new int[nums.length - k +1];
        for (int i = 0; i < nums.length - k +1; i++) {
            max1 = Math.max(nums[i], nums[i + 1]);
            max = Math.max(max1, nums[i+2]);
            res[i] = max;
        }
        return res;
    }
}
