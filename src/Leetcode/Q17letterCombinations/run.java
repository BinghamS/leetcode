package Leetcode.Q17letterCombinations;

import java.util.List;

/**
 * @ClassName run
 * @Deacription TODO
 * @Author bingham
 * @Date 2021/1/3 13:43
 * @Version 1.0
 **/
public class run {
    public static void main(String[] args) {
        String a = "23";
        solution2 solution = new solution2();
        List<String> res = solution.letterCombinations(a);
        for (String str :
                res) {
            System.out.println(str);
        }
    }
}
