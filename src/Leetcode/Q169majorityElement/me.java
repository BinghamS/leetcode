package Leetcode.Q169majorityElement;

import java.util.HashMap;

public class me {
    public int majorityElement(int[] nums) {
        if (nums.length == 1){
            return nums[0];
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])){
                int a = map.get(nums[i]);
                if (a+1 >nums.length/2){
                    return nums[i];
                }
                map.replace(nums[i],a+1);
            }else{
                map.put(nums[i],1);
            }
        }
        return 0;
    }
}
