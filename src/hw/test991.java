package hw;
import java.util.Scanner;

public class test991 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int[] A = new int[k];
        int[] B = new int[k];
        for (int i = 0; i < k; i++) {
            A[i] = sc.nextInt();
        }
        for (int i = 0; i < k; i++) {
            B[i] = sc.nextInt();
        }

        int N = sc.nextInt();
        int[] C = new int[N];
        int[] D = new int[N];
        for (int i = 0; i < N; i++) {
            C[i] = sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            D[i] = sc.nextInt();
        }

        Boolean[] flag = new Boolean[k];
        Boolean res_flag = false;
        int res = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < k; j++) {
                if (C[i] == A[j]){
                    if (D[i] == B[j]) {
                        res = j+1;

                        for (int m = 1; m < k+1; m++) {
                            if (j+m < k && i+m < N){
                                if (C[i+m] == A[j+m]) {
                                    if (D[i+m] == B[j+m]) {
                                        flag[m-1] = true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        int res_num = 0;
        for (int i = 0; i < k; i++) {
            if (flag[i] != null && flag[i] == true)
                res_num++;
        }
        if (res_num == k-1){
            System.out.println(res);
        }else {
            System.out.println(0);
        }



    }
}
