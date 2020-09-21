package Tencent;

public class test1_2 {
    public static void main(String[] args) {
        int n = 5;
        int k = 3;
        String s = "1 2 3 4 5";
        String[] s1 = s.split(" ");
        int[] arr = new int[n];
        int[] res = new int[n-1];
        int j = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(s1[i]);
            if (i != k-1) {
                res[j] = Integer.parseInt(s1[i]);
                j++;
            }

        }

        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }
}
