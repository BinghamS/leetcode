package test360;

import java.util.Scanner;

/**
 * @ClassName test22
 * @Deacription TODO
 * @Author bingham
 * @Date 2021/3/28 19:59
 * @Version 1.0
 **/
public class test22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        int K = scan.nextInt();

        int arr[][] = new int[N][2];
        for (int i = 0; i < N; i++) {
            arr[i][0] = scan.nextInt();
            arr[i][1] = scan.nextInt();
        }

        int dp1[] = new int[N];
        int dp2[] = new int[N];

        for (int i = 0; i < N; i++) {
            if (arr[0][0] == 0){
                dp1[0] = 0;
                dp2[0] = arr[0][1];
            }else{
                dp1[i] = arr[i][0];
            }
        }

    }
}
