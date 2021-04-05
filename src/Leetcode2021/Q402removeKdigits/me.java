package Q402removeKdigits;

import java.util.*;

/**
 * @ClassName me
 * @Deacription TODO
 * @Author bingham
 * @Date 2021/3/9 19:29
 * @Version 1.0
 **/
public class me {
    public String removeKdigits(String num, int k) {
        if (k >= num.length()){
            return "0";
        }
        if (k == 0){
            return num;
        }
        char[] chars = num.toCharArray();
        Stack<Integer> stack = new Stack<>();
        int m = 0;
        for (int i = 0; i < chars.length; i++) {
            if (stack.isEmpty()){
                stack.push(Integer.parseInt(String.valueOf(chars[i])));
            }else if (m < k && stack.peek() > Integer.parseInt(String.valueOf(chars[i]))){
                stack.pop();
                stack.push(Integer.parseInt(String.valueOf(chars[i])));
                m++;
            }else{
                stack.push(Integer.parseInt(String.valueOf(chars[i])));
            }
        }
        StringBuilder sb = new StringBuilder();
        Boolean flag = true;
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        if(Integer.parseInt(sb.toString()) == 0){
            return "0";
        }
        StringBuilder reverse = sb.reverse();

        while(reverse.charAt(0) == '0'){
            reverse.delete(0, 1);
        }

        while(m < k){
            int max = Integer.MIN_VALUE;
            int index = 0;
            for (int i = 0; i < reverse.length(); i++) {
                if (max < Integer.parseInt(String.valueOf(reverse.charAt(i)))){
                    max = Integer.parseInt(String.valueOf(reverse.charAt(i)));
                    index = i;
                }
                if ( i == reverse.length()-1){
                    reverse.delete(i,i+1);
                }
            }
            m++;
        }

        return reverse.toString();
    }
}
