package Q75sortColors;

/**
 * @ClassName run
 * @Deacription TODO
 * @Author bingham
 * @Date 2021/2/9 23:36
 * @Version 1.0
 **/
public class run {
    public static void main(String[] args) {
        mr mr = new mr();
        int arr[] = {2,0,2,1,1,0};
        mr.sortColors(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
