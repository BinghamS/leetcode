package Leetcode.q344reverseString;

public class ME {
    public void reverseString(char[] s) {
        char res[] = new char[s.length];
        for (int i = 0; i < s.length; i++) {
            res[i] = s[s.length-i-1];
        }
        for (int i = 0; i < res.length; i++) {
            s[i] = res[i];
        }
    }
}
