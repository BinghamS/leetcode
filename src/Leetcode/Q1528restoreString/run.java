package Leetcode.Q1528restoreString;

public class run {
    public static void main(String[] args) {
        me me = new me();
        String str = "codeleet";
        int[] arr = {4,5,6,7,0,2,1,3};
        String s = me.restoreString(str, arr);
        System.out.println(s);
    }
}
