package Q3lengthOfLongestSubstring;

import java.util.*;

/**
 * @ClassName me
 * @Deacription TODO
 * @Author bingham
 * @Date 2021/3/25 22:50
 * @Version 1.0
 **/
public class me {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0){
            return 0;
        }
        if (s.length() == 1){
            return 1;
        }
        int max = 0;
        for (int i = 0; i < s.length()-1; i++) {
            HashSet<Character> set = new HashSet<>();
            set.add(s.charAt(i));
            for (int j = i+1; j < s.length(); j++) {
                if(!set.contains(s.charAt(j))){
                    set.add(s.charAt(j));
                    if (j == s.length() - 1) {
                        int length = set.size();
                        max = Math.max(max,length);
                        set.clear();
                    }
                }else{
                    int length = set.size();
                    max = Math.max(max,length);
                    set.clear();
                }
            }
        }
        return max;
    }
}
