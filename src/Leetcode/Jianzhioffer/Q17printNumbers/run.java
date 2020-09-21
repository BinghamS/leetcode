package Leetcode.Jianzhioffer.Q17printNumbers;

public class run {
    public static void main(String[] args) {
        int n = 2;
        me me = new me();
        int[] ints = me.printNumbers(n);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }
}
