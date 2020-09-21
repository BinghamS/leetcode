package Leetcode.Jianzhioffer.Q15;

public class me {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {

        String string = Integer.toBinaryString(n);

        String[] split = string.split("");
        int res = 0;
        for (int i = 0; i < split.length; i++) {
            if (split[i].equals("1")){
                res ++;
            }
        }

        return res;
    }
}
