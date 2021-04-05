package Q402removeKdigits;

/**
 * @ClassName run
 * @Deacription TODO
 * @Author bingham
 * @Date 2021/3/9 19:29
 * @Version 1.0
 **/
public class run {
    public static void main(String[] args) {
        me me = new me();
        String s = "1234567890";
        int k = 9;
        String s1 = me.removeKdigits(s, k);
        System.out.println(s1);
    }
}
