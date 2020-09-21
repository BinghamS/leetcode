package xiaomi;

import java.util.Scanner;

public class test2 {
    public static String removeRepeatChar(String str) {

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int i1 = sb.indexOf(String.valueOf(c));
            if (i1==-1){
                sb.append(c);
            }
        }
        return sb.toString();
    }
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
        String res = removeRepeatChar(input);
        System.out.println(res);
    }
}
