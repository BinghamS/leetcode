package webank;

import java.util.*;

public class test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int n = sc.nextInt();
        int m = sc.nextInt();

        int count = sc.nextInt();

        int arr [][] = new int[count][2];
        for (int i = 0; i < count; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        for (int i = 0; i < count; i++) {
            int x = arr[i][0];
            int y = arr[i][1];

            for (int j = 0; j < a; j++) {
                int[] reverse1 = getReverse1(x, y, m);
                x = reverse1[0];
                y = reverse1[1];
            }

            for (int j = 0; j < b; j++) {
                int[] reverse2 = getReverse2(x, y, m);
                x = reverse2[0];
                y = reverse2[1];
            }

            for (int j = 0; j < c; j++) {
                int[] reverse3 = getReverse3(x, y, m);
                x = reverse3[0];
                y = reverse3[1];
            }
            System.out.println(x+" "+ y);

        }

    }

    public static int[] getReverse1(int x,int y,int m){
        int x_new = y;
        int y_new = m-x;
        return new int[]{x_new, y_new};
    }

    public static int[] getReverse2(int x,int y,int m){
        return new int[]{x,m - y};
    }

    public static int[] getReverse3(int x,int y,int m){
        return new int[]{m - y,x};
    }

}
