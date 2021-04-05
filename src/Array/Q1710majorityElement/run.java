package Array.Q1710majorityElement;

/**
 * @ClassName run
 * @Deacription TODO
 * @Author bingham
 * @Date 2021/1/28 16:52
 * @Version 1.0
 **/
public class run {
    public static void main(String[] args) {
        int[] arr = {-1, 1, 1, 1, 2, 1};
        me2 me = new me2();
        int i = me.majorityElement(arr);
        System.out.println(i);

    }
}
