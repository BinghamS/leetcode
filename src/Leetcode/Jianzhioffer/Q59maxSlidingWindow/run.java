package Leetcode.Jianzhioffer.Q59maxSlidingWindow;

public class run {
    public static void main(String[] args) {
        me me = new me();
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        int[] ints = me.maxSlidingWindow(nums, k);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }
}
