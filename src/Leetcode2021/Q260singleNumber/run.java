package Q260singleNumber;

/**
 * @ClassName run
 * @Deacription TODO
 * @Author bingham
 * @Date 2021/2/20 19:50
 * @Version 1.0
 **/
public class run {
    public static void main(String[] args) {
        int arr[] = {1,2,1,3,2,5};
        me me = new me();
        int[] ints = me.singleNumber(arr);
        for (int a :
                ints) {
            System.out.println(a);
        }
    }
}
