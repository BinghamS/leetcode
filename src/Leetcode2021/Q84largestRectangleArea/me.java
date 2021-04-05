package Q84largestRectangleArea;

/**
 * @ClassName me
 * @Deacription TODO
 * @Author bingham
 * @Date 2021/2/25 19:34
 * @Version 1.0
 **/
public class me {
    public int largestRectangleArea(int[] heights) {
        int max = 0;
        for (int i = 0; i < heights.length; i++) {
            max = Math.max(max,heights[i] * getWidth(heights,i));
        }
        return max;
    }

    public static int getWidth(int[] heights,int k){
        int res = 0;
        for (int i = k; i < heights.length; i++) {
            if(heights[i] >= heights[k]){
                res++;
            }else{
                break;
            }
        }
        for (int i = k; i >= 0; i--) {
            if(heights[i] >= heights[k]){
                res++;
            }else{
                break;
            }
        }

        return res-1;
    }
}
