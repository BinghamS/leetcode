package Q485findMaxConsecutiveOnes;

/**
 * @ClassName me
 * @Deacription TODO
 * @Author bingham
 * @Date 2021/2/15 13:52
 * @Version 1.0
 **/
public class me {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1){
                count++;
                max = Math.max(count,max);
            }else{
                count = 0;
            }
        }
        return max;
    }
}
