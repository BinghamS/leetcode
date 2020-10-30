package LearnLeetcode.pivotIndex;

import java.util.HashSet;

public class pivotIndex {
    public static int pivotIndex(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int sum1 = 0,sum2 = 0;
            for (int j = 0; j < i; j++) {
                sum1 += nums[j];
            }
            for (int j = i + 1; j < nums.length; j++) {
                sum2 += nums[j];
            }
            if (sum1 == sum2) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {-1,-1,-1,0,1,1};
        int res = pivotIndex(arr);
        System.out.println(res);
    }
}
