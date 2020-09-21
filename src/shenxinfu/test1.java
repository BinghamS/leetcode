package shenxinfu;

import java.util.*;

public class test1 {
    public static String get_repeated_chars (String str_a, String strb) {
        HashSet<Character> hashSet = new HashSet<>();
        for (int i = 0; i < str_a.length(); i++) {
            for (int j = 0; j < strb.length(); j++) {
                if (str_a.charAt(i) == strb.charAt(j)){
                    hashSet.add(str_a.charAt(i));
                }
            }
        }
        String res = "";
        for (char c :
                hashSet) {
            res+=String.valueOf(c);
        }
        return res;
    }
    public static void main(String[] args) {
        String a = "abc";
        String b = "c";
        String repeated_chars = get_repeated_chars(a, b);
        System.out.println(repeated_chars);
    }
}
