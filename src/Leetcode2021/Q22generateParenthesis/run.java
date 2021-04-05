package Q22generateParenthesis;

import java.util.List;

/**
 * @ClassName run
 * @Deacription TODO
 * @Author bingham
 * @Date 2021/2/27 0:53
 * @Version 1.0
 **/
public class run {
    public static void main(String[] args) {
        int n = 3;
        me me = new me();
        List<String> strings = me.generateParenthesis(n);
        for (String str:
             strings) {
            System.out.println(str);
        }
    }
}
