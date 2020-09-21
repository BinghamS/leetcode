package test;

import java.util.*;
import java.util.Map;

public class abouthashmap {
    public static void main(String[] args) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('a',1);
        map.put('b',1);
        map.put('c',1);
        map.put('d',1);
        map.put('e',1);
        for (Map.Entry entry:
             map.entrySet()) {
            System.out.println(entry.getKey()+":::::"+entry.getValue());
        }
    }
}
