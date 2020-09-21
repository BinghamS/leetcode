package Leetcode.Q448findDisappearedNumbers;

import java.util.List;

public class run {
    public static void main(String[] args) {
        me me = new me();
        int arr[] = {4,3,2,7,8,2,3,1};
        List<Integer> list = me.findDisappearedNumbers(arr);
        for (int a :
                list) {
            System.out.println(a);
        }
    }
}
