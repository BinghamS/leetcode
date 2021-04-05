package Leetcode.Q15threeSum;

import java.util.List;

/**
 * @ClassName run
 * @Deacription TODO
 * @Author bingham
 * @Date 2020/12/31 12:17
 * @Version 1.0
 **/
public class run {
    public static void main(String[] args) {
        int arr[] = {-1, 0, 1, 2, -1, -4};
        me me = new me();
        List<List<Integer>> lists = me.threeSum(arr);
        for (List list :
                lists) {
            for ( Object a:
                    list) {
                System.out.println(a);
            }
        }

    }
}
