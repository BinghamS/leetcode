package Q1438longestSubarray;

import java.util.*;

/**
 * @ClassName me
 * @Deacription 不连续子数组的最长长度
 * @Author bingham
 * @Date 2021/2/22 11:02
 * @Version 1.0
 **/
public class me {
    public int longestSubarray(int[] nums, int limit) {
        int max_length = 0;
        for (int i = 0; i < nums.length; i++) {
            max_length = Math.max(max_length,getCount(nums,i,limit));
        }
        return max_length;
    }

    public static int getCount(int[] nums,int left,int limit){
        int count = 0;
        Boolean flag = true;
        for (int i = left + 1; i < nums.length; i++) {
            if(nums[i] <= nums[left] + limit){
                if(flag){
                    count++;
                    flag = false;
                }
                count++;
            }else return count;
        }
        return count;
    }
}
