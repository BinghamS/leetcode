package Q84largestRectangleArea;

/**
 * @ClassName run
 * @Deacription TODO
 * @Author bingham
 * @Date 2021/2/25 19:34
 * @Version 1.0
 **/
public class run {
    public static void main(String[] args) {
        int[] arr = {2,1,5,6,2,3};
        me me = new me();
        int i = me.largestRectangleArea(arr);
        System.out.println(i);
    }
}
