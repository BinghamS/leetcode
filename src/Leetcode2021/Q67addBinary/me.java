package Q67addBinary;

import java.math.BigInteger;

/**
 * @ClassName me
 * @Deacription TODO
 * @Author bingham
 * @Date 2021/2/9 22:34
 * @Version 1.0
 **/
public class me {
    public String addBinary(String a, String b) {
        BigInteger m = BigInteger.valueOf(Integer.parseInt(a, 2));
        BigInteger n = BigInteger.valueOf(Integer.parseInt(b, 2));
        BigInteger res = m.add(n);
        String res_str = res+"";
        return res_str;
    }
}
