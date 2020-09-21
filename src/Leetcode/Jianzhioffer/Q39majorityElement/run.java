package Leetcode.Jianzhioffer.Q39majorityElement;

public class run {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 2, 2, 2, 5, 4, 2};
        me me = new me();
        int res = me.majorityElement(arr);
        System.out.println(res);
    }
}
