package zijie.exercise.Q3lengthOfLongestSubstring;

import java.util.*;

public class me {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0){
            return 0;
        }
        HashSet<Character> hashSet = new HashSet<Character>();

        int max_num = 1;
        for (int i = 0; i < s.length() - 1; i++) {
            first:for (int j = i+1; j < s.length(); j++) {
                Boolean flag = true;
                int sum = 0;
                hashSet.clear();
                for (int k = i; k <= j; k++) {
                    if(hashSet.contains(s.charAt(k))){
                        break first;
                    }else{
                        hashSet.add(s.charAt(k));
                        sum++;
                    }
                }
                if (sum > max_num){
                    max_num = sum;
                }
            }
        }

        return max_num;
    }

    public int lengthOfLongestSubstring1(String s) {

        if (s.length()==0 || s == ""){
            return 0;
        }

        HashSet<Character> hashSet = new HashSet<>();

        int Max = 1;
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            if(hashSet.contains(s.charAt(i))){
                if(sum > Max){
                    Max = sum;
                }
                sum = 0;
            }
            hashSet.add(s.charAt(i));
            sum++;
        }

        if(sum > Max){
            Max = sum;
        }
        return Max;
    }


    }
