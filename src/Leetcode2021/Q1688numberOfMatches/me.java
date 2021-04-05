package Q1688numberOfMatches;

/**
 * @ClassName me
 * @Deacription TODO
 * @Author bingham
 * @Date 2021/2/8 16:21
 * @Version 1.0
 **/
public class me {
    public int numberOfMatches(int n) {
        int round = 0;
        while(n > 1){
            int i = 0;
            if (n % 2 ==0){//even number
                i = n / 2;
                n = n / 2;
            }else{
                i = (n-1)/2;
                n = (n-1)/2+1;
            }
            round += i;
        }

        return round;

    }

}
