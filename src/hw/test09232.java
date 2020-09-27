package hw;

import java.util.ArrayList;

public class test09232 {
    public static void main(String[] args) {
        String s = "1&&4&10&20&&23";

        int a = 0;
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> res = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i<s.length()){
            if (s.charAt(i) =='&'){
                int pre = Integer.parseInt(String.valueOf(sb));
                if (i+1<s.length()){
                    if (s.charAt(i+1) =='&'){//连续两个

                    }else {//单个

                    }
                }
            }
            else {//数字
                sb.append(s.charAt(i)) ;
                while (s.charAt(i+1) != '&'){
                    i++;
                    sb.append(s.charAt(i));
                }
            }

        }


    }
}
