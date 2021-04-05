package Q189rotate;

/**
 * @ClassName mr
 * @Deacription TODO
 * @Author bingham
 * @Date 2021/3/25 15:57
 * @Version 1.0
 **/
public class mr {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n;
        for (int i = 0; i < k; i++) {
            int temp = nums[n - 1];
            for (int j = n - 1; j > 0; j--) {
                nums[j] = nums[j - 1];
            }
            nums[0] = temp;
        }
    }
}
