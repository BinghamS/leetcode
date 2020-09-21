package DJI;

import java.math.BigDecimal;
import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n_p = scanner.nextLine();
        String[] s2 = n_p.split(" ");
        int n = Integer.parseInt(s2[0]);
        int x = Integer.parseInt(s2[1]);

        int[][] a = new int[n][2];

        for (int i = 0; i < n; i++) {
            String s = scanner.nextLine();
            String[] s1 = s.split(" ");
            a[n][0] = Integer.parseInt(s1[0]);
            a[n][1] = Integer.parseInt(s1[1]);
        }

        BigDecimal bbb= new BigDecimal("654654654654654654654654654");
        BigDecimal ccc= new BigDecimal("2");
        BigDecimal divide = bbb.divide(ccc);



    }
}
