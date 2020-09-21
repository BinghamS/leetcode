package Leetcode.Q283moveZeroes;

public class run {
    public static void main(String[] args) {
        int arr [] = {0,1,0,3,12};
        me me = new me();
        me.moveZeroes(arr);
        for (int a :
                arr) {
            System.out.println(a);
        }
    }

}
