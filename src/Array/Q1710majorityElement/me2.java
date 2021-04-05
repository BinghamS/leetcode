package Array.Q1710majorityElement;

import java.util.*;

/**
 * @ClassName me2
 * @Deacription TODO
 * @Author bingham
 * @Date 2021/1/28 17:15
 * @Version 1.0
 **/
public class me2 {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int length = nums.length;
        int mid = nums[length / 2];
//        int mid_minus = nums[length / 2 - 1];
        int beginning = nums[0];
        int ending = nums[length-1];

        if (mid == ending){
            return ending;
        }else if(mid == beginning){
            return beginning;
        }else{
            return -1;
        }

    }
}
