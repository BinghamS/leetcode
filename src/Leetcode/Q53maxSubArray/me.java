package Leetcode.Q53maxSubArray;

/**
 * TODO
 *
 * @author songb
 * @date 2020/5/20 1:26
 */
public class me {
    public int maxSubArray(int[] nums) {
        int res = nums[0];
        int sum = 0;
        for (int num : nums) {
            if (sum > 0)
                sum += num;
            else
                sum = num;
            res = Math.max(res, sum);
        }
        return res;
    }
}
