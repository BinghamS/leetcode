package duxiaoman;

import java.util.*;

public class test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        HashMap<Character, Integer> have = new HashMap<>();
        int count = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (have.containsKey(s1.charAt(i))){
                int temp = have.get(s1.charAt(i));
                have.replace(s1.charAt(i),temp+1);
            }else {
                have.put(s1.charAt(i),1);
            }
        }

        for (int i = 0; i < s2.length(); i++) {
            if (have.containsKey(s2.charAt(i))){
                int temp = have.get(s2.charAt(i));
                if (temp == 1){
                    count++;
                    have.remove(s2.charAt(i));
                }else {
                    count++;
                    have.replace(s2.charAt(i),temp-1);
                }
            }else {
                continue;
            }
        }

        System.out.println(count);
    }
}
