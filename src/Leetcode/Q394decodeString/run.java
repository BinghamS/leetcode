package Leetcode.Q394decodeString;

public class run {
    public static void main(String[] args) {
        String s = "3[a2[c]]";
        me me = new me();
        String string = me.decodeString(s);
        System.out.println(string);
    }
}
