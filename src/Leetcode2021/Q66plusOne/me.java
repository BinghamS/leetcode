package Q66plusOne;


import java.util.Stack;

/**
 * @ClassName me
 * @Deacription TODO
 * @Author bingham
 * @Date 2021/2/9 22:16
 * @Version 1.0
 **/
public class me {
    public int[] plusOne(int[] digits) {
        int num = 0;
        for (int a:
             digits) {
            num = a + num*10;
        }
        num += 1;
        Stack<Integer> stack = new Stack();
        while(num != 0){
            int i = num % 10;
            stack.push(i);
            num = num/10;
        }
        int size = stack.size();
        int res[] = new int[size];
        for (int i = 0; i < size; i++) {
            res[i] = stack.pop();
        }
        return res;
    }
}
