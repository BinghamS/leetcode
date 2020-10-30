package webank;

import java.util.*;

public class test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int arr[]  = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int question[] = new int[q];
        for (int i = 0; i < q; i++) {
            question[i] = sc.nextInt();
        }

        for (int i = 0; i < q; i++) {
            int res = Integer.MAX_VALUE;
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < n; j++) {
                if (Math.abs(arr[j] - question[i]) == min){
                    if (res > arr[j]){
                        res = arr[j];
                    }
                }else if (Math.abs(arr[j] - question[i]) < min){
                    res = arr[j];
                    min = Math.abs(arr[j] - question[i]);
                }
            }
            System.out.println(res);
        }

    }
}
