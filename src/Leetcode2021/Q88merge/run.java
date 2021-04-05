package Q88merge;

/**
 * @ClassName run
 * @Deacription TODO
 * @Author bingham
 * @Date 2021/2/20 15:44
 * @Version 1.0
 **/
public class run {
    public static void main(String[] args) {
        int nums1[] = {1,2,3,0,0,0};
        int nums2[] = {2,5,6};
        int m = 3, n = 3;
        me me = new me();
        me.merge(nums1,m,nums2,n);

        for (int a :
                nums1) {
            System.out.println(a);
        }
    }
}
