package baidu;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt(), zero_num = 0, five_num = 0;
        for (int i = 0; i < num; i++) {
            if (scanner.nextInt() == 0) {
                zero_num++;
            } else {
                five_num++;
            }
        }
        scanner.close();
        if (zero_num == 0) {
            System.out.println(-1);
        } else if (five_num < 9) {
            System.out.println(0);
        } else {
            String five_basic_string = "555555555";

            StringBuilder result = new StringBuilder();
            for (int i = 0; i < five_num / 9; i++) {
                result.append(five_basic_string);
            }
            for (int i = 0; i < zero_num; i++) {
                result.append(0);
            }
            System.out.println(result);
        }
    }
}