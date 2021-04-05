package test360;

import java.util.*;

/**
 * @ClassName test2
 * @Deacription TODO
 * @Author bingham
 * @Date 2021/3/28 19:45
 * @Version 1.0
 **/
public class test2 {
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

        int res = 0;
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        for (int i = 0; i < N; i++) {
            if(arr[i][0]==0){
                res += arr[i][1];
            }
            else if (arr[i][0] <= M){
                treeMap.put(arr[i][1],arr[i][0]);
            }
        }


        for (int i = 0; i < K; i++) {
            Map.Entry<Integer, Integer> entry = treeMap.lastEntry();
            int key = entry.getKey();
            res += key;
            treeMap.remove(key);
        }

        System.out.println(res);

    }
}
