package xiaomi;

import java.util.Scanner;

public class test22 {

    public static String removeRepeatChar2(String str) {

        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < str.length(); i ++) {

            char charWord = str.charAt(i);

            int firstPosition = str.indexOf(charWord);

            int lastPosition = str.lastIndexOf(charWord);

            if (firstPosition  == lastPosition || firstPosition == i) {

                sb.append(charWord);

            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < input.length(); i ++) {
            char cur = input.charAt(i);
            int first = input.indexOf(cur);
            int last = input.lastIndexOf(cur);
            if (first  == last || first == i) {
                sb.append(cur);
            }
        }
        System.out.println(sb.toString());
    }
}
