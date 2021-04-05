package TopK;

import java.util.*;

/**
 * @ClassName me
 * @Deacription TODO
 * @Author bingham
 * @Date 2021/3/27 22:49
 * @Version 1.0
 **/
public class me {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int[] ret = new int[k];
        PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> map.get(o2)-map.get(o1));
        pq.addAll(map.keySet());
        for(int i=0;i<k;i++){
            ret[i]=pq.remove();
        }
        return ret;
    }
}
