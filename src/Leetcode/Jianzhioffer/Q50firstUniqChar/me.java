package Leetcode.Jianzhioffer.Q50firstUniqChar;

import java.util.HashMap;

public class me {
    public char firstUniqChar(String s) {
        if (s.length() == 0 || s.equals("")){
            char c = ' ';
            return c;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i))==null){
                map.put(s.charAt(i),1);
            }else {
                int val = map.get(s.charAt(i))+1;
                map.replace(s.charAt(i),val);
            }
        }

        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1){
                return s.charAt(i);
            }
        }


        char c = ' ';
        return c;
    }
}
