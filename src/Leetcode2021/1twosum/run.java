/**
 * @ClassName run
 * @Deacription TODO
 * @Author bingham
 * @Date 2021/1/25 18:55
 * @Version 1.0
 **/

public class run {
    public static void main(String[] args) {
        me me = new me();

        int nums[] = {3,2,4};
        int target = 6;

        int[] res = me.twoSum(nums, target);
        for (int a:
            res ) {
            System.out.println(a);
        }
    }
}
