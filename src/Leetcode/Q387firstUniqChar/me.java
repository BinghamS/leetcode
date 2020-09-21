package Leetcode.Q387firstUniqChar;

public class me {
    public int firstUniqChar(String s) {
        for (int i = 0; i < s.length(); i++) {
            Boolean flag = false;
            for (int j = 0; j < s.length(); j++) {
                if (i!=j){
                    if (s.charAt(i) == s.charAt(j)) {
                        flag = true;
                        break;
                    }}
                }

            if (flag == false) return i;
        }
        return -1;
    }
}
