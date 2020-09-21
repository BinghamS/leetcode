package Leetcode.Jianzhioffer.Q62lastRemaining;

public class me {
    public int lastRemaining(int n, int m) {
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }

        int i = 0;
        while (!isFinal(arr)){
            i = i+3;
            if (i < n){
                arr[i] = 0;
            }else arr[i - n] = 0;

        }

        int res = 0;
        for (int j = 0; j < n; j++) {
            if (arr[j] != 0) res = arr[j];
        }
        return res;

    }

    public static Boolean isFinal(int[] arr){
        int count= 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) count++;
        }
        if (count ==1){
            return true;
        }else return false;
    }

}
