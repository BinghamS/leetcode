package huiwen;

/**
 * @ClassName me
 * @Deacription TODO
 * @Author bingham
 * @Date 2021/3/27 15:55
 * @Version 1.0
 **/
public class me {
    public Boolean isHuiwen(String str){
        StringBuilder sb = new StringBuilder(str);
        String s = sb.reverse().toString();
        return str.equals(s) ? true:false;
    }
}
