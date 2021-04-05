package Jianzhi14cuttingRope;

/**
 * @ClassName me
 * @Deacription TODO
 * @Author bingham
 * @Date 2021/2/24 11:32
 * @Version 1.0
 **/
public class me {
    public int cuttingRope(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        if (n == 3) return 3;

         int round = n / 3;
         if(n % 3 == 0){
             return (int) Math.pow(3,round);
         }if(n % 3 == 1){
             return (int) (Math.pow(3,round-1) * 4);
        }else{
             return (int) (Math.pow(3,round) * 2);
        }

    }
}
