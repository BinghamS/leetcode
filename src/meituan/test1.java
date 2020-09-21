package meituan;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        if (M < 100000 || M > 999999){
            System.out.println(0);
        }if (N < 100000 || N > 999999){
            System.out.println(0);
        }if (N<M){
            System.out.println(0);
        }
        int count = 0;
        Boolean flag = true;
        for (int m = M; m <= N; m++) {
            int cur = m;
            int arr[] = new int[6];
            int i = 0;
            while (cur/10>0){
                arr[i] = cur%10;
                cur = cur/10;
                i++;
            }
            arr[5] = cur%10;
            if (arr[5] == 0 || arr[3] == 0 || arr[1] == 0){
                continue;
            }
            for (int j = 0; j < 5; j++) {
                for (int k = j+1; k < 6; k++) {
                    if (arr[i] == arr[k]){
                        flag = false;
                        break;
                    }
                    break;
                }
            }
            if (arr[5]*10+arr[4]+arr[3]*10+arr[2] == arr[1]*10 +arr[0] && flag ){
                count++;
                System.out.println(m);
            }
        }
        System.out.println(count);
    }
}
