package Leetcode.Q17letterCombinations;

import java.util.*;

/**
 * @ClassName me
 * @Deacription TODO
 * @Author bingham
 * @Date 2021/1/3 13:43
 * @Version 1.0
 **/
public class me {

    static char[] chars2 = {'a','b','c'};
    static char[] chars3 = {'d','e','f'};
    static char[] chars4 = {'g','h','i'};
    static char[] chars5 = {'j','k','l'};
    static char[] chars6 = {'m','n','o'};
    static char[] chars7 = {'p','q','r','s'};
    static char[] chars8 = {'t','u','v'};
    static char[] chars9 = {'w','x','y','z'};

    /**
     * @Author bingham
     * @Description TODO
     * @Date 13:44 2021/1/3
     * @Param [digits]
     * @return java.util.List<java.lang.String>
     **/
    public List<String> letterCombinations(String digits) {
        List<char[]> chars = new ArrayList();
        chars.add(chars2);
        chars.add(chars3);
        chars.add(chars4);
        chars.add(chars5);
        chars.add(chars6);
        chars.add(chars7);
        chars.add(chars8);
        chars.add(chars9);

        ArrayList<String> res = new ArrayList<>();

        String[] split = digits.split("");



        return null;
    }
}
