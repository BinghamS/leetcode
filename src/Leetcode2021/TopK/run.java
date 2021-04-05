package TopK;

/**
 * @ClassName run
 * @Deacription TODO
 * @Author bingham
 * @Date 2021/3/27 22:49
 * @Version 1.0
 **/
public class run {
    public static void main(String[] args) {
        int arr[] = {1,1,1,2,2,3};
        me me = new me();
        int[] ints = me.topKFrequent(arr, 1);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }

    }
}
