package Q260singleNumber;

import java.util.ArrayList;

/**
 * @ClassName me
 * @Deacription TODO
 * @Author bingham
 * @Date 2021/2/20 19:50
 * @Version 1.0
 **/
public class me {
    public int[] singleNumber(int[] nums) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int a :
                nums) {
            if (!list.contains(a)) {
                list.add(a);
            } else{
                list.remove(list.indexOf(a));
            }
        }
        int res[] = new int[list.size()];
        int i = 0;
        for (int a :
                list) {
            res[i] = a;
            i++;
        }
        return res;
    }
}
