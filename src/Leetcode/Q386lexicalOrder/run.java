package Leetcode.Q386lexicalOrder;

import java.util.List;

public class run {
    public static void main(String[] args) {
        int n = 13;
        me me = new me();
        List<Integer> integers = me.lexicalOrder(n);
        for (int i = 0; i < integers.size(); i++) {
            System.out.println(integers.get(i));
        }
    }
}
