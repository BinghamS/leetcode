package zhong911;

import java.util.Scanner;

public class test4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int [][] res = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                res[3-j][i] = arr[i][j];
            }
        }


        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(res[i][j]);
                if (j != 3){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
