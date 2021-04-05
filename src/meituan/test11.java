package meituan;

import java.util.Scanner;

/**
 * @ClassName test11
 * @Deacription TODO
 * @Author bingham
 * @Date 2021/3/13 15:55
 * @Version 1.0
 **/
public class test11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int arr[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scan.nextInt();
            }
        }

        if (m == n){
            dealSame(arr,n);
        }
        else{
            dealDiff(arr,n,m);
        }
    }

    public static void dealSame(int arr[][], int n){
        int res[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                res[i][j] = arr[j][i];
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void dealDiff(int arr[][], int n, int m){
        int res[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                res[i][j] = arr[j][i];
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }

}
