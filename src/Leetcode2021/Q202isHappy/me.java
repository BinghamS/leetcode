package Q202isHappy;

import java.util.*;

/**
 * @ClassName me
 * @Deacription TODO
 * @Author bingham
 * @Date 2021/2/27 0:02
 * @Version 1.0
 **/
public class me {
    public boolean isHappy(int n) {

        HashSet<Integer> hashSet = new HashSet<Integer>();

        while(!hashSet.contains(n)){
            if (n == 1) {
                return true;
            }
            hashSet.add(n);
            n = getNextNum(n);
        }
        return false;
    }

    public static int getNextNum(int n){
        int res = 0;
        while( n / 10 != 0 ){
            int last = n % 10;
            res = last * last + res;
            n = n / 10;
        }
        res = n * n + res;
        return res;
    }

}
