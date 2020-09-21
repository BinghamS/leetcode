package Leetcode.Jianzhioffer.Q17printNumbers;

public class me {
    public int[] printNumbers(int n) {
        int max_num = (int) Math.pow(10,n)-1;
        int arr[] = new int[max_num];
        for (int i = 0; i < max_num; i++) {
            arr[i] = i+1;
        }
        return arr;
    }

}
