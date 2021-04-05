/**
 * @ClassName me
 * @Deacription TODO
 * @Author bingham
 * @Date 2021/1/25 18:55
 * @Version 1.0
 **/
public class me {
    public int[] twoSum(int[] nums, int target) {
        int res[] = new int[2];
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[j] + nums[i] == target){
                    res[0] = i;
                    res[1] = j;
                    return res;
                }
            }
        }
        return null;
    }
}
