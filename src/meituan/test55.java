package meituan;

import java.util.*;

/**
 * @ClassName test55
 * @Deacription 
 * 5 4
 * 3 2 3 4 6
 * 1 2
 * 2 3
 * 3 4
 * 4 5
 * @Author bingham
 * @Date 2021/3/13 17:28
 * @Version 1.0
 **/
public class test55 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(i, scan.nextInt());
        }
        int road[][] = new int[n][n];
        for (int i = 0; i < m; i++) {
            int from = scan.nextInt();
            int to = scan.nextInt();

        }

    }
}
