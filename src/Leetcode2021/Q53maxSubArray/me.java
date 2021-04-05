package Q53maxSubArray;

/**
 * @ClassName me
 * @Deacription TODO
 * @Author bingham
 * @Date 2021/2/15 16:24
 * @Version 1.0
 **/
public class me {
    public int maxSubArray(int[] nums) {
        String str = "";
        int res = nums[0];
        int sum = 0;
        for(int num : nums){
            if(sum>0){
                sum+=num;
            }else{
                sum = num;
            }
            res = Math.max(sum,res);
        }
        return res;
    }
}
