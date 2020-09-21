package Leetcode.Q394intersection;

public class run {
    public static void main(String[] args) {
        int[] a = {4,9,5};
        int[] b = {9,4,9,8,4};
        me me = new me();
        int[] intersection = me.intersection(b,a);
        for (int i :
                intersection) {
            System.out.println(i);
        }
    }
}
