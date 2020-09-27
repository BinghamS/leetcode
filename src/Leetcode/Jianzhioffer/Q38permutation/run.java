package Leetcode.Jianzhioffer.Q38permutation;

public class run {
    public static void main(String[] args) {
        me me = new me();
        String s = "abc";
        String[] permutation = me.permutation(s);
        for (String a :
                permutation) {
            System.out.println(a);
        }
    }
}
