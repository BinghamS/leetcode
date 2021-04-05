package Q66plusOne;

/**
 * @ClassName run
 * @Deacription TODO
 * @Author bingham
 * @Date 2021/2/9 22:16
 * @Version 1.0
 **/
public class run {
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        me me = new me();
        int[] ints = me.plusOne(arr);
        for (int ans :
                ints) {
            System.out.println(ans);
        }
    }
}
