package test;

import java.util.Random;

public class langestsub {
    public static void main(String[] args) {
        Random a = new Random(100000000);
        int i1 = a.nextInt();
        System.out.println(i1);
        String str = i1+"";
        int max = 0;
        for (int i = 0; i < str.length()-1; i++) {
            for (int j = i+1; j < str.length(); j++) {
                String temp = str.substring(i,j);
                Boolean flag = true;
                for (int k = 0; k < temp.length()-1; k++) {
                    if ((int)temp.charAt(k+1) < (int)temp.charAt(k)){
                        flag = false;
                        break;
                    }
                }
                if (flag){
                    max = Math.max(max,temp.length());
                }
            }
        }
        System.out.println(max);
    }
}
