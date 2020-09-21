package Leetcode.Q53maxSubArray;


/**
 * TODO
 *
 * @author songb
 * @date 2020/5/20 1:26
 */
public class run {
    public static void main(String[] args) {
        me me = new me();
        int[] a = {-2,1,-3,4,-1,2,1,-5,4};
        int res = me.maxSubArray(a);
        System.out.println(res);
    }

}
