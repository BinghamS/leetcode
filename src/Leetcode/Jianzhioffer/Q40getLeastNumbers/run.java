package Leetcode.Jianzhioffer.Q40getLeastNumbers;

public class run {
    public static void main(String[] args) {
        int arr[] = {4,5,1,6,2,7,3,8};
        int k = 2;
        me me = new me();
        int[] res = me.getLeastNumbers(arr, k);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }

    }
}
