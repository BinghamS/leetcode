package Q46permute;

import java.util.List;


/**
 * @ClassName run
 * @Deacription TODO
 * @Author bingham
 * @Date 2021/2/8 17:30
 * @Version 1.0
 **/
public class run {
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        me me = new me();
        List<List<Integer>> permute = me.permute(arr);
        System.out.println(permute);
    }
}
