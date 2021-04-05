package TopK;

import java.util.*;

/**
 * @ClassName me2
 * @Deacription TODO
 * @Author bingham
 * @Date 2021/3/27 22:52
 * @Version 1.0
 **/
public class me2 {
    public int[] getLessNumbers(int[] arr,int k){//前k小，大根堆
        if(k == 0 || arr.length ==0) {
            return new int[0];
        }

        Queue<Integer> pq = new PriorityQueue<>((v1, v2)->v2-v1);
        for(int num:arr){
            if(pq.size() < k) {
                pq.offer(num);
            } else if(num < pq.peek()){
                pq.poll();
                pq.offer(num);
            }
        }

        int [] res = new int[pq.size()];
        int idx = 0;
        for(int num: pq){
            res[idx++] = num;
        }
        return res;
    }

}
