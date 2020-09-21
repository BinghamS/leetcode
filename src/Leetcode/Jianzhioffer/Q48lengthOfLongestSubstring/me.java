package Leetcode.Jianzhioffer.Q48lengthOfLongestSubstring;

import java.util.HashSet;

public class me {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        if (s.length() == 1){
            return 1;
        }
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j <= s.length(); j++) {
                String substring = s.substring(i, j);
                HashSet<Character> hashSet = new HashSet<Character>();
                for (int k = 0; k < substring.length(); k++) {
                    if (!hashSet.contains(substring.charAt(k))){
                        hashSet.add(substring.charAt(k));
                        if (hashSet.size() == substring.length()){
                            max = Math.max(max,substring.length());
                        }
                    }else {
                        break;
                    }
                }
            }
        }
        return max;
    }
}
