package Q56merge;

import java.util.ArrayList;

/**
 * @ClassName me
 * @Deacription TODO
 * @Author bingham
 * @Date 2021/2/25 11:40
 * @Version 1.0
 **/
public class me {
    public int[][] merge(int[][] intervals) {
        ArrayList<int[]> res = new ArrayList<>();
        res.add(new int[]{intervals[0][0],intervals[0][1]});
        for (int i = 1; i < intervals.length; i++) {
            for (int[] arr: res) {
                if(arr[1] < intervals[i][0]){
                    res.add(intervals[i]);
                    break;
                }if (arr[0] > intervals[i][1]){
                    res.add(intervals[i]);
                    break;
                }if (arr[1] == intervals[i][0]){
                    res.remove(res.indexOf(arr));
                    res.add(new int[]{arr[0],intervals[i][1]});
                }if (arr[0] == intervals[i][1]){
                    res.remove(res.indexOf(arr));
                    res.add(new int[]{intervals[i][0],arr[1]});
                }
                if(arr[0] < intervals[i][0] && arr[1] > intervals[i][1]) break;

                if(arr[0] > intervals[i][0] && arr[1] < intervals[i][1]){
                    res.remove(res.indexOf(arr));
                    res.add(new int[]{intervals[i][0],intervals[i][1]});
                }if(arr[0] < intervals[i][0] && arr[1] > intervals[i][0] && arr[1] < intervals[i][1]){
                    res.remove(res.indexOf(arr));
                    res.add(new int[]{arr[0],intervals[i][1]});
                }if(arr[0] > intervals[i][0] && arr[0] < intervals[i][1] && arr[1] > intervals[i][1]){
                    res.remove(res.indexOf(arr));
                    res.add(new int[]{intervals[i][0],arr[1]});
                }
            }
        }
        return res.toArray(new int[res.size()][]);
    }
}
