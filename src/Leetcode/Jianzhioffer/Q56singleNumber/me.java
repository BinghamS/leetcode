package Leetcode.Jianzhioffer.Q56singleNumber;

import java.util.HashMap;

public class me {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }else {
                Integer count = map.get(nums[i]);
                map.put(nums[i],count+1);
            }
        }
        for (Integer i :
                map.keySet()) {
            if (map.get(i) == 1) return i;
        }
        return 0;
    }
}
