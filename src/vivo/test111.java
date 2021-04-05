package vivo;
import java.util.Scanner;
/**
 * @ClassName test111
 * @Deacription TODO
 * @Author bingham
 * @Date 2021/3/10 20:33
 * @Version 1.0
 **/
public class test111 {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        String str = in.next();
        String valid = valid("_");
        System.out.println(valid);
    }


    public static String valid(String s){
        if (isPalindrome(s)){
            return s;
        }
        for (int i = 0; i < s.length(); i++) {
            String sub = s.substring(0,i) + s.substring(i + 1);
            if (isPalindrome(sub)){
                return sub;
            }
        }
        return "false";
    }

    public static boolean isPalindrome(String str){
        StringBuilder sb = new StringBuilder(str);
        String re = sb.toString();
        if (re.equals(sb.reverse().toString())){
            return true;
        }else{
            return false;
        }
    }

}

