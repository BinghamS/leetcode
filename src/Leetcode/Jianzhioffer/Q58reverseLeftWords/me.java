package Leetcode.Jianzhioffer.Q58reverseLeftWords;

public class me {
    public String reverseLeftWords(String s, int n) {
        if (n == 0){
            return s;
        }
        if (s.length() == 0|| s == null || s ==""){
            return s;
        }

        //旋转
        String res = "";
        res = s.substring(n,s.length()) + s.substring(0,n);
        return res;
    }
}
