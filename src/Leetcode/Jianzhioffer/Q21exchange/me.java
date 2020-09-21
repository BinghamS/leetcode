package Leetcode.Jianzhioffer.Q21exchange;

public class me {
    public int[] exchange(int[] nums) {
        int res[] = new int[nums.length];
        int i = 0;
        for (int k = 0; k < nums.length; k++) {
            if (nums[k]%2 == 1){//奇数
                res[i] = nums[k];
                i++;
            }
        }
        for (int k = 0; k < nums.length; k++) {
            if (nums[k]%2 == 0){
                res[i] = nums[k];
                i++;
            }
        }

        return res;
    }
}
