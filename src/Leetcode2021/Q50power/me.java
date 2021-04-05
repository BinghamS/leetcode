package Q50power;

/**
 * @ClassName me
 * @Deacription TODO
 * @Author bingham
 * @Date 2021/3/27 20:23
 * @Version 1.0
 **/
public class me {
    public double myPow(double x, int n) {
        double res = 1.0;
        for(int i = n; i != 0; i /= 2){
            if(i % 2 != 0){
                res *= x;
            }
            x *= x;
        }
        return  n < 0 ? 1 / res : res;
    }
}
