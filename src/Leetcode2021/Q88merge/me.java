package Q88merge;

import java.util.Arrays;

/**
 * @ClassName me
 * @Deacription TODO
 * @Author bingham
 * @Date 2021/2/20 15:44
 * @Version 1.0
 **/
public class me {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j = 0;
        for (int i = n + m - 1; i > m-1; i--) {
            nums1[i] = nums2[j];
            j++;
        }
        Arrays.sort(nums1);
    }
}
