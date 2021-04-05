package Q485findMaxConsecutiveOnes;

/**
 * @ClassName run
 * @Deacription TODO
 * @Author bingham
 * @Date 2021/2/15 13:52
 * @Version 1.0
 **/
public class run {
    public static void main(String[] args) {
        int arr[] = {1,1,0,1,1,1};
        me me = new me();
        int maxConsecutiveOnes = me.findMaxConsecutiveOnes(arr);
        System.out.println(maxConsecutiveOnes);
    }
}
