package Q697findShortestSubArray;

import java.util.*;

/**
 * @ClassName me
 * @Deacription TODO
 * @Author bingham
 * @Date 2021/2/20 13:27
 * @Version 1.0
 **/
public class me {
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer, Integer> map = getNums(nums);
        int max = Integer.MIN_VALUE;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i:
             map.keySet()) {
            if (max < map.get(i)){
                max = map.get(i);
                list.add(i);
            }
        }
        int shortNum = getShortNum(1, nums);
        return shortNum;
    }

    public static HashMap<Integer,Integer> getNums(int[] nums){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])){
                int index = map.get(nums[i]);
                map.put(nums[i],index+1);
            }else{
                map.put(nums[i],1);
            }
        }
        return map;
    }

    public static int getShortNum(int max,int[] arr){
        int left = -1,right = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == max ){
                if (left == -1) {
                    left = i;
                }
                right = i;
            }
        }
        return right-left+1;
    }

}
