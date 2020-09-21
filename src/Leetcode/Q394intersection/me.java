package Leetcode.Q394intersection;

import java.util.HashSet;

public class me {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> integers = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums2[j] == nums1[i]){
                    integers.add(nums1[i]);
                }
            }
        }
        int[] ints = new int[integers.size()];
        int j = 0;
        for (Integer i:integers) {
            ints[j] = i;
            j++;
        }
        return ints;
    }
}
