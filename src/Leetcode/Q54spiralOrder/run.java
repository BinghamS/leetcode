package Leetcode.Q54spiralOrder;

import java.util.List;

public class run {
    public static void main(String[] args) {
        me me = new me();
        int arr[][] = {{1, 2, 3, 4},{5, 6, 7, 8},{9,10,11,12}};
        List<Integer> list = me.spiralOrder(arr);
        for (int i : list) {
            System.out.println(i);
        }
    }
}