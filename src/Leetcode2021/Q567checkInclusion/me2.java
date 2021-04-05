package Q567checkInclusion;

import java.util.HashMap;

/**
 * @ClassName me2
 * @Deacription TODO
 * @Author bingham
 * @Date 2021/2/14 21:31
 * @Version 1.0
 **/
public class me2 {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()){
            return false;
        }
        HashMap<Character, Integer> map_s1 = getmap(s1);
        int left = 0;
        int right = s1.length();
        while(right < s2.length()){
            String substring = s2.substring(left, right);
            HashMap<Character, Integer> map_temp = getmap(substring);
            if(map_temp.equals(map_s1)){
                return true;
            }

                left++;
                right++;

        }
        return false;
    }

    public static HashMap<Character, Integer> getmap(String str){
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if(!map.containsKey(str.charAt(i))){
                map.put(str.charAt(i),1);
            }else{
                int index = map.get(str.charAt(i));
                map.put(str.charAt(i),index+1);
            }
        }
        return map;
    }
}
