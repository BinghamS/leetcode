package ZTE;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();//学生人数
        int m = scan.nextInt();//学生人数
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scan.nextInt();
            }
        }

        int[] avgs = new int[m];
        int[] sum = new int[m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                sum[i] = sum[i] + arr[i][j];
            }
        }

        for (int i = 0; i < m; i++) {
            avgs[i] = sum[i]/n;
        }

        Boolean[] sended = new Boolean[n];
        for (int i = 0; i < n; i++) {
            sended[i] = false;
        }
        int res = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] > avgs[i]) {
                    if (sended[j] == true) {
                        continue;
                    }else {
                        sended[j] = true;
                        res++;
                    }
                }
            }
        }

        System.out.println(res);

    }
}
