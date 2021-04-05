package Leetcode.Q830largeGroupPositions;

import java.util.*;

/**
 * @ClassName me
 * @Deacription TODO
 * @Author bingham
 * @Date 2021/1/5 0:25
 * @Version 1.0
 **/
public class me {
    public List<List<Integer>> largeGroupPositions(String s) {
        char cur = s.charAt(0);
        int num = 1;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == cur){
                num++;
            }else{
                num = 1;
                cur = s.charAt(i);
            }

        }
        return null;
    }
}
