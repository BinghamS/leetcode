package Leetcode.Jianzhioffer.Q62lastRemaining;

import java.util.*;

public class me2 {
    public int lastRemaining(int n, int m) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(i);
        }
        int i = 0;
        while (list.size() > 1){
            i = i+m;
            while (i >= list.size()){
                i = i-list.size();
            }
//            for (int j = 0; j < list.size(); j++) {
//                list.remove(i);
//            }
            list.remove(i);
        }

        return list.get(0);
    }
}
