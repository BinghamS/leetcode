package Leetcode.Jianzhioffer.Q39majorityElement;
import java.util.*;

public class me {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        if (nums.length<=1)return nums[0];
        int target = nums.length/2;

        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) == null){
                map.put(nums[i],1);
            }else {
                int val = map.get(nums[i]);
                map.replace(nums[i],val+1);
                if (val+1 > target){
                    res = nums[i];
                    break;
                }
            }
        }

        return res;
    }
}
