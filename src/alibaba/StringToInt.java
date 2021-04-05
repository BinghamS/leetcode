package alibaba;
import java.util.*;
/**
 * @ClassName StringToInt
 * @Deacription TODO
 * @Author bingham
 * @Date 2021/4/2 21:11
 * @Version 1.0
 **/


public class StringToInt {
    public static int Max = Integer.MAX_VALUE;
    public static int Min = Integer.MIN_VALUE;

    public int getStringToInt(String str){
        char[] arr = str.toCharArray();
        int n = 0;
        if("".equals(str) || str == null) //judge is the string input is null
        {
            return 0;
        }
        int i = 0;
        int sign = 1;   //judge positive or negative
        if(arr[i] == '+' || arr[i] == '-'){
            if(arr[i] == '-') {
                sign = -1;
            }
            i++;
        }
        for(;i<str.length();i++){
            if(!Character.isDigit(arr[i])){
                return -1;
            }
            int c = Integer.valueOf(arr[i]);
            //when string input is positive and it is bigger than Max
            if(sign > 0 && (n > Max/10 || (n == Max/10 && c > Max%10))){
                return Max;
            }
            //when string input is negative and it is smaller than Min
            if(sign < 0 && (n + Min/10 > 0 || (n == Min*(-1)/10 && c > (Min*(-1))%10 ))){
                return Min;
            }
            n = n*10 + c;
        }

        return sign > 0 ? n : -n;
    }
    public static void main(String[] args){
        StringToInt test = new StringToInt();
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        int result = test.getStringToInt(a);
        System.out.println(result);
    }
}