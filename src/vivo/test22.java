package vivo;

import java.util.*;

public class test22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        System.out.print(validPalindrome(str));

    }
    public static String validPalindrome(String s) {
        if (s.length() == 1){
            return s;
        }
        int low = 0, high = s.length() - 1;
        boolean flag1 = true, flag2 = true;
        StringBuffer sb=new StringBuffer();
        int i1=-1;int i2=-1;
        while (low < high) {
            char c1 = s.charAt(low), c2 = s.charAt(high);
            if (c1 == c2) {
                low++;
                high--;
            } else {
                i1=high;
                i2=low;

                for (int i = low, j = high - 1; i < j; i++, j--) {
                    char c3 = s.charAt(i), c4 = s.charAt(j);
                    if (c3 != c4) {
                        flag1 = false;

                        break;
                    }
                }
                for (int i = low + 1, j = high; i < j; i++, j--) {
                    char c3 = s.charAt(i), c4 = s.charAt(j);
                    if (c3 != c4) {
                        flag2 = false;

                        break;
                    }
                }
                if((flag1 && !flag2)||(flag1 && flag2)){
                    for(int i=0;i<s.length();i++){
                        if(i!=i1)sb.append(s.charAt(i));
                    }
                }
                if(!flag1 && flag2){
                    for(int i=0;i<s.length();i++){
                        if(i!=i2)sb.append(s.charAt(i));
                    }
                }

                if(!flag1 && !flag2) {String result = "false";return result;}

                String str = new String(sb);
                return str;
            }
        }

        return s;
    }
}



