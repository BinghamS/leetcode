package Q53maxSubArray;

/**
 * @ClassName run
 * @Deacription TODO
 * @Author bingham
 * @Date 2021/2/15 16:24
 * @Version 1.0
 **/
public class run {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        me me = new me();
        int i = me.maxSubArray(arr);
        System.out.println(i);
    }
}
