package Q202isHappy;

/**
 * @ClassName run
 * @Deacription TODO
 * @Author bingham
 * @Date 2021/2/27 0:02
 * @Version 1.0
 **/
public class run {
    public static void main(String[] args) {
        int n = 7;
        me me = new me();
        boolean happy = me.isHappy(n);
        System.out.println(happy);
    }
}
