package Leetcode.Q49groupAnagrams;

import java.util.*;

public class me {
    public List<List<String>> groupAnagrams(String[] strs) {




        return null;
    }

    public Boolean hasSameChar(String a, String b){
        char[] achars = a.toCharArray();
        char[] bchars = b.toCharArray();

        for (int i = 0; i < achars.length; i++) {
            for (int j = 0; j < bchars.length; j++) {
                if(achars[i]==(bchars[j])){
                }
            }
        }
        return false;
    }
}
