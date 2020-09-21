package Leetcode.Q136singleNumber;

import java.util.HashSet;

public class me {
    public int singleNumber(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashSet.contains(nums[i])){
                hashSet.remove(nums[i]);
            }else {
                hashSet.add(nums[i]);
            }
        }
        Object[] objects = hashSet.toArray();
        String string = objects[0].toString();
        int res =Integer.parseInt(string);
        return res;
    }
}
