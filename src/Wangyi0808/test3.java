package Wangyi0808;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        String str_a = scanner.nextLine();
        int[] a = new int[n];
        String[] s = str_a.split(" ");
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(s[i]);
        }

    }
}
