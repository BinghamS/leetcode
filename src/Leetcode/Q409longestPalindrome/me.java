package Leetcode.Q409longestPalindrome;

import java.util.HashMap;
import java.util.*;

public class me {
    public int longestPalindrome(String s) {
        int max = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            for (int j = i+1; j < s.length(); j++) {
                String substring = s.substring(i, j);
                if (isRalindrome(substring)){
                    max = Math.max(max,substring.length());
                }
            }
        }
        return max;
    }

    public static Boolean isRalindrome(String s){
        Boolean flag = true;
        for (int i = 0; i < s.length() / 2 + 1; i++) {
            if (s.charAt(i) != s.charAt(s.length()-1-i)){
                flag = false;
            }
        }
        return flag;
    }

    public int longestPalindrome1(String s){
        int max = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),1);
            }else {
                int a = map.get(s.charAt(i));
                map.put(s.charAt(i),a+1);
            }
        }
        Boolean flag = false;
        for (Map.Entry<Character, Integer> entry:
             map.entrySet()) {
            if (entry.getValue()%2 == 0){
                max += entry.getValue();
            }else {
                flag = true;
                if (entry.getValue()-1 > 0) {
                    max = max + entry.getValue() - 1;
                }
            }
        }
        if (flag == true)   max++;

        return max;
    }

}
