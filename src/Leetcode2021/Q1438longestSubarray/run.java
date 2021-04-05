package Q1438longestSubarray;

/**
 * @ClassName run
 * @Deacription TODO
 * @Author bingham
 * @Date 2021/2/22 11:02
 * @Version 1.0
 **/
public class run {
    public static void main(String[] args) {
        int arr[] = {4,2,2,2,4,4,2,2};
        int limit = 0;
        me2 me = new me2();
        int i = me.longestSubarray(arr, limit);
        System.out.println(i);

    }
}
