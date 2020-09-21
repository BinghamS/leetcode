package Leetcode.Jianzhioffer.Q56singleNumbers;

import java.util.ArrayList;

public class me {
    public int[] singleNumbers(int[] nums) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (!arrayList.contains(nums[i])){
                arrayList.add(nums[i]);
            }else {
                int i1 = arrayList.indexOf(nums[i]);
                arrayList.remove(i1);
            };
        }
        int res[] = new int[2];
        Object[] array = arrayList.toArray();
        for (int i = 0; i < array.length; i++) {
            res[i] = (int)array[i];
        }
        return res;
    }
}
