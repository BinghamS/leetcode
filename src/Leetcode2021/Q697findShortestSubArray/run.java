package Q697findShortestSubArray;

/**
 * @ClassName run
 * @Deacription TODO
 * @Author bingham
 * @Date 2021/2/20 13:27
 * @Version 1.0
 **/
public class run {
    public static void main(String[] args) {
        int []arr = {1,2,2,3,1};
        me me = new me();
        int shortestSubArray = me.findShortestSubArray(arr);
        System.out.println(shortestSubArray);
    }
}
