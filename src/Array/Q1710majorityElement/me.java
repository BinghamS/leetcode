package Array.Q1710majorityElement;

import java.util.*;

/**
 * @ClassName me
 * @Deacription TODO
 * @Author bingham
 * @Date 2021/1/28 16:52
 * @Version 1.0
 **/
public class me {
    public int majorityElement(int[] nums) {

        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        int target = nums.length/2;
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(nums[i])){
                int in = hashMap.get(nums[i]);
                if (in+1>target){
                    return nums[i];
                }
                hashMap.put(nums[i],in+1);
            }else{
                hashMap.put(nums[i],1);
            }
        }

        return -1;
    }
}
