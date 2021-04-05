package Q415addStrings;

/**
 * @ClassName run
 * @Deacription TODO
 * @Author bingham
 * @Date 2021/2/27 12:20
 * @Version 1.0
 **/
public class run {
    public static void main(String[] args) {
        String num1 = "5678";
        String num2 = "1234";
        me me = new me();
        String s = me.addStrings(num1, num2);
        System.out.println(s);
    }
}
