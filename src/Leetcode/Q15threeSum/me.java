package Leetcode.Q15threeSum;

import java.util.*;

/**
 * @ClassName me
 * @Deacription TODO
 * @Author bingham
 * @Date 2020/12/31 12:17
 * @Version 1.0
 **/
public class me {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> lists = new ArrayList<List<Integer>>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length-2; i++) {
            for (int j = i+1; j < nums.length-1; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    if (nums[i]+nums[j]+nums[k] == 0){
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                        if (!lists.contains(list)) {
                            lists.add(list);
                        }

                    }
                }
            }
        }
        return lists;
    }
}
