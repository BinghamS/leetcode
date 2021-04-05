package TopK;

/**
 * @ClassName run2
 * @Deacription TODO
 * @Author bingham
 * @Date 2021/3/27 22:52
 * @Version 1.0
 **/
public class run2 {
    public static void main(String[] args) {
        int arr[] = {9, 8, 6, 99, 8, 4, 0, -1, 5, 7};
        me2 me = new me2();
        int[] ints = me.getLessNumbers(arr, 5);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }
}
