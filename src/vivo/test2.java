package vivo;

import java.util.*;

public class test2 {
    public static boolean validPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while(i < j){
            if(s.charAt(i) != s.charAt(j)){
                return isValid(s, i + 1, j) || isValid(s, i, j - 1);
            }
            i++;
            j--;
        }
        return true;
    }

    public static boolean isValid(String s, int i, int j){
        while(i < j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        boolean b = validPalindrome(input);
        System.out.println(b);
    }
}
