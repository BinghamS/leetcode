package Q1047removeDuplicates;

import java.util.*;

/**
 * @ClassName me
 * @Deacription TODO
 * @Author bingham
 * @Date 2021/3/9 18:47
 * @Version 1.0
 **/
public class me {
    public String removeDuplicates(String S) {
        int index = -1;
        char[] chars = S.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (index >= 0 && chars[index] == chars[i]) {
                index--;
            } else {
                index++;
                chars[index] = chars[i];
            }
        }
        return String.copyValueOf(chars, 0, index + 1);
    }

    public String removeDuplicates2(String S) {
        Stack<Character> stack = new Stack<>();
        char[] chars = S.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (stack.isEmpty()){
                stack.push(chars[i]);
            }else if (stack.peek() == chars[i]){
                stack.pop();
            }else{
                stack.push(chars[i]);
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        StringBuilder reverse = sb.reverse();
        return reverse.toString();
    }
}
