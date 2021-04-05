package Q1438longestSubarray;

import java.util.Arrays;

/**
 * @ClassName me2
 * @Deacription TODO
 * @Author bingham
 * @Date 2021/2/22 11:32
 * @Version 1.0
 **/
public class me2 {
    public int longestSubarray(int[] nums, int limit) {
        int max_length = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int[] ints = Arrays.copyOfRange(nums, i, j+1);
                if(is_required(ints,limit)){
                    max_length = Math.max(max_length,j-i+1);
                }
            }
        }
        return max_length;
    }
    public static Boolean is_required(int[] nums,int limit){
        if(nums.length<=1){
            return false;
        }
        Arrays.sort(nums);
        int first = nums[nums.length-1];
        int end = nums[0];
        if(Math.abs(first - end) <= limit) return true;
        else return false;
    }
}
