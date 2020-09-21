package Leetcode.Q66plusOne;

/**
 * TODO
 *
 * @author songb
 * @date 2020/5/20 2:24
 */
public class run {
    public static void main(String[] args) {
        me me = new me();
        int[] a = {9,8,7,6,5,4,3,2,1,0};
        int[] ints = me.plusOne(a);
        for (int res_i :ints
             ) {
            System.out.println(res_i);
        }
    }
}
