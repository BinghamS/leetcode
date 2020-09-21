package Leetcode.Q58lengthOfLastWord;

/**
 * TODO
 *
 * @author songb
 * @date 2020/5/20 1:47
 */
public class me {
    public int lengthOfLastWord(String s) {
        if (s.equals("") || s.equals(" ")) return 0;
        String[] s1 = s.split(" ");

        int length = s1.length;
        if (length == 0) return 0;
        String res_word = s1[(length - 1)];
        return res_word.length();
    }
}
