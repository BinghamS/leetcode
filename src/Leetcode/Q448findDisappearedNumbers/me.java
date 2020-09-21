package Leetcode.Q448findDisappearedNumbers;

import java.util.*;

public class me {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        int arr[] = new int[nums.length];
        for (int i = 1; i <= nums.length; i++) {
            arr[i-1] = i;
        }
        HashSet<Integer> integers = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            integers.add(nums[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            if (!integers.contains(arr[i])) list.add(arr[i]);
        }
        return list;
    }
}
