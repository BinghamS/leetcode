package vivo;

import java.util.Scanner;

public class test1 {
    // dp方程=> dp[i][j] = dp[i - 1][j] + dp[i][j - 1]
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;

        int[][] dp = new int[m][n];

        int start =  Integer.MAX_VALUE;
        boolean flag = false;
        for(int i = 0; i < m; i++) {
            if(obstacleGrid[i][0] == 1) {
                dp[i][0] = 0;
                start = i;
                flag = true;
                break;
            } else {
                dp[i][0] = 1;
            }
        }

        if(flag) {
            for(int i = start; i < m; i++) {
                dp[i][0] = 0;
            }
            flag = false;
        }

        for(int j = 0; j < n; j++) {
            if(obstacleGrid[0][j] == 1) {
                dp[0][j] = 0;
                start = j;
                flag = true;
                break;
            } else {
                dp[0][j] = 1;
            }
        }
        if(flag) {
            for(int j = start; j < n; j++) {
                dp[0][j] = 0;
            }
            flag = false;
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if(obstacleGrid[i][j] != 1) {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                } else {
                    dp[i][j] = 0;
                }
            }
        }

        return dp[m - 1][n - 1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        arr[a][b] = 3;//start
        arr[c][d] = 4;//finish


    }
}
