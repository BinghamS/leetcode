package Leetcode.Q1534countGoodTriplets;

public class run {
    public static void main(String[] args) {
        me me = new me();
        int arr[] = {3,0,1,1,9,7};
        int res = me.countGoodTriplets(arr, 7, 2, 3);
        System.out.println(res);
    }
}
