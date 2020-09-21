package Leetcode.Jianzhioffer.Q58reverseWords;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.ArrayList;

public class me {
    public String reverseWords(String s) {
        if (s.replaceAll(" ","").equals("")) return "";

        String[] split = s.split(" ");
        for (int i = 0; i < split.length; i++) {
            split[i] = split[i].replaceAll(" ","");
        }
        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i < split.length; i++) {
            if (!split[i].equals("")){
                strings.add(split[i]);
            }
        }
        String[] former = new String[strings.size()];
        int size = strings.size();
        for (int i = 0; i < size; i++) {
            former[i] = strings.remove(0);
        }
        String res = "";
        String substring="";
        for (int i = former.length-1; i >= 0; i--) {
            res = res + former[i] +" ";
        }
        substring = res.substring(0, res.length() - 1);

        return substring;
    }
}
