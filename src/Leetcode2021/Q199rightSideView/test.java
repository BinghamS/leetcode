package Q199rightSideView;

/**
 * @ClassName test
 * @Deacription TODO
 * @Author bingham
 * @Date 2021/3/26 14:31
 * @Version 1.0
 **/
public class test {
    public static void main(String[] args) {
        int n = 10;
        String str = "eww";
        boolean s = str.startsWith("s");
        int p = 0, q = 0, r = 1;
        for (int i = 1; i <= n; ++i) {
            p = q;
            q = r;
            r = p + q;
            System.out.println(r);
        }

    }
}
