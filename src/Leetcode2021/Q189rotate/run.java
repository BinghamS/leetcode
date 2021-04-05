package Q189rotate;

/**
 * @ClassName run
 * @Deacription TODO
 * @Author bingham
 * @Date 2021/3/25 15:57
 * @Version 1.0
 **/
public class run {
    public static void main(String[] args) {
        int[] ints = {1,2,3,4,5,6,7};
        mr mr = new mr();
        mr.rotate(ints, 3);
        for (int a :
                ints) {
            System.out.println(a);
        }
    }
}
