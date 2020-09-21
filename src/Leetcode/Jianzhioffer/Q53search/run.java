package Leetcode.Jianzhioffer.Q53search;

public class run {
    public static void main(String[] args) {
        int [] arr = {5,7,7,8,8,10};
        int target = 8;
        me me = new me();
        int res = me.search(arr, target);
        System.out.println(res);
    }
}
