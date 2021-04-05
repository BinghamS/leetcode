package test;

/**
 * @ClassName test210107
 * @Deacription TODO
 * @Author bingham
 * @Date 2021/1/7 11:47
 * @Version 1.0
 **/
public class test210107 {
    public static String reverse_mine(String str){
        StringBuilder sb = new StringBuilder();
        for (int i = str.length()-1; i >=0; i--) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "abcd";
        String[] split = str.split("");
        String s = reverse_mine(str);
        System.out.println(s);
    }
}
