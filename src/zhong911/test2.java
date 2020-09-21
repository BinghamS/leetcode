package zhong911;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        int b[] = new int[5];
        int res[] =new int[10];
        int m = 0;
        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
            res[m] = a[i];
            m++;
        }
        for (int i = 0; i < 5; i++) {
            b[i] = sc.nextInt();
            res[m] = b[i];
            m++;
        }

        for (int i = 0; i < 10; i++) {
            for (int j = i+1; j < 10; j++) {
                if (res[i] > res [j]){
                    int tmp = res[i];
                    res[i] = res[j];
                    res[j] = tmp;
                }
            }
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(res[i] + " ");
        }

    }
}
