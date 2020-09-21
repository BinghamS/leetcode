package Leetcode.Jianzhioffer.Q56singleNumbers;

public class run {
    public static void main(String[] args) {
        int arr[] ={4,1,4,6};
        me me = new me();
        int[] ints = me.singleNumbers(arr);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }
}
