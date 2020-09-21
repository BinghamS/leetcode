package test2;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s= scanner.nextLine();
        String[] s1 = s.split(" ");
        int N = Integer.parseInt(s1[0]);
        int M = Integer.parseInt(s1[1]);
        int T = Integer.parseInt(s1[2]);

        int[][] arr = new int[N+M][2];
        for (int i = 0; i < N + M; i++) {
            String s2 = scanner.nextLine();
            String[] s3 = s2.split(" ");
            int a = Integer.parseInt(s3[0]);
            int b = Integer.parseInt(s3[1]);
            arr[i][0] = a;
            arr[i][1] = b;
        }
        if (T <= 0){
            System.out.println(0);
        }else{
            //只有一餐
            int min_N_1=-1;
            for (int i = 0; i < N + M; i++) {
                if (arr[i][1] >= T){
                    if (min_N_1 == -1){
                        min_N_1 = arr[i][0];
                    }
                    if (min_N_1!=-1 && min_N_1>arr[i][1]){
                        min_N_1 = arr[i][0];
                    }
                }
            }

            //中餐+晚餐
            int sum_M = 0;
            int min_N_2 = -1;
            for (int i = 0; i < N; i++) {
                for (int j = N; j < M + N; j++) {
                    int sum_M_temp = arr[i][1] + arr[j][1];
                    if (sum_M_temp>=T){
                        if (min_N_2 ==-1){
                            min_N_2 = arr[i][0]+arr[j][0];
                        }
                        if (min_N_2 !=-1 && min_N_2>(arr[i][0]+arr[j][0])){
                            min_N_2 = arr[i][0]+arr[j][0];
                        }
                    }
                }
            }

            int min_res = 0;
            if (min_N_1 == -1 ){
                min_res = min_N_2;
            }else if (min_N_2 == -1){
                min_res = min_N_1;
            }else{
                min_res = Math.min(min_N_1,min_N_2);
            }

            System.out.println(min_res);
        }



    }
}
