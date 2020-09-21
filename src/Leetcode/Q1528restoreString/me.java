package Leetcode.Q1528restoreString;

import java.util.HashMap;

public class me {
    public String restoreString(String s, int[] indices) {
        HashMap<Integer, Character> map = new HashMap<Integer, Character>();
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            map.put(indices[i],s.charAt(i));
        }
        for (int i = 0; i < map.size(); i++) {
            res = res + map.get(i);
        }
        return res;
    }
}
