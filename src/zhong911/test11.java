package zhong911;

import java.util.Scanner;

public class test11 {
    public static int findSubString(String str) {
        if (str.length() <= 2)
            return str.length();
        int max = 0;
        for (int i = 0; i < str.length(); i++) {
            char cur_char = str.charAt(i);
            char new_char = cur_char;
            int j = i;
            while (j >= 0 && str.charAt(j) == cur_char)
                j--;
            if (j >= 0) {
                new_char = str.charAt(j);
                j--;
                for (; j >= 0; j--) {
                    if (str.charAt(j) != cur_char && str.charAt(j) != new_char)
                        break;
                }
            }
            int tmp = i - j;
            if (tmp > max)
                max = tmp;

        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = "";
        for (int i = 0; i < n; i++) {
            str = str +sc.next();
        }
        int res = findSubString(str);
        System.out.println(res);
    }
}
