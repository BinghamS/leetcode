package zhong911;

import java.util.HashMap;
import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String[] split = input.split("");

        HashMap<Character, Integer> map = new HashMap<>();

        char res = ' ';
        for (int i = 0; i < split.length; i++) {
            Integer integer = map.get(split[i].charAt(0));
            if (integer == null){
                map.put(split[i].charAt(0),1);
            }else {
                int a = map.get(split[i].charAt(0));
                if (a == 2){
                    res = split[i].charAt(0);
                    break;
                }
                map.replace(split[i].charAt(0),a+1);
            }
        }

        System.out.println(res);

    }
}
