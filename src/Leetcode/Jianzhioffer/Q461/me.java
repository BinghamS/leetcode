package Leetcode.Jianzhioffer.Q461;

public class me {
    public int hammingDistance(int x, int y) {
        String a = Integer.toBinaryString(x);
        String b = Integer.toBinaryString(y);

        int cha = Math.abs(a.length()-b.length());
        if (a.length() >b.length()){
            for (int i = 0; i < cha; i++) {
                b = "0"+ b;
            }
        }else if (a.length() < b.length()){
            for (int i = 0; i < cha; i++) {
                a = "0"+ a;
            }
        }
        int res = 0 ;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i)!=b.charAt(i)){
                res++;
            }
        }

        return res;
    }
}
