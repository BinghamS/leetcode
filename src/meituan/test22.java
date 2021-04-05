package meituan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @ClassName test22
 * @Deacription TODO
 * @Author bingham
 * @Date 2021/3/13 16:19
 * @Version 1.0
 **/
public class test22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String in = scan.next();


        char[] chars = in.toCharArray();

        ArrayList<String> list = new ArrayList<String>();

        Boolean pre_digit = false;
        String sb = "";
        for (int i = 0; i < chars.length; i++) {

            if(Character.isDigit(chars[i]) ){
                if(!pre_digit){
                    sb = String.valueOf(chars[i]);
                }
                else{
                    sb = sb + String.valueOf(chars[i]);
                    if(i >= chars.length-1){
                        list.add(sb);
                    }
                }
                pre_digit = true;

            }
            else{
                if(pre_digit){
                    list.add(sb);
                }else{
                    continue;
                }
                pre_digit =false;
            }

        }
        int[] arr = new int[list.size()];
        int index = 0;
        for (String str:
             list) {
            arr[index] = Integer.parseInt(str);
            index++;
        }

        Arrays.sort(arr);
        for (int a :
                arr) {
            System.out.println(a);
        }
    }
}
