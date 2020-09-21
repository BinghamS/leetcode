package Leetcode.Jianzhioffer.Q21exchange;

public class run {
    public static void main(String[] args) {
        int nums[] = {1,2,3,4};
        me me = new me();
        int[] exchange = me.exchange(nums);
        for (int i = 0; i < exchange.length; i++) {
            System.out.println(exchange[i]);
        }
    }
}
