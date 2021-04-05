package test360;

import java.util.*;

/**
 * @ClassName test1
 * @Deacription
 * 小马最近找到了一款打气球的游戏。
 *
 * 每一回合都会有n个气球，每个气球都有对应的分值，第i个气球的分值为ai。
 *
 * 这一回合内，会给小马两发子弹，但是由于小马的枪法不准，一发子弹最多只能打破一个气球，甚至小马可能一个气球都打不中。
 *
 * 现给出小马的得分规则：
 *
 * 1. 若小马一只气球都没打中，记小马得0分。
 *
 * 2. 若小马打中了第i只气球，记小马得ai分。
 *
 * 3. 若小马打中了第i只气球和第j只气球（i＜j），记小马得ai|aj分。
 *
 * （其中 | 代表按位或，按位或的规则如下：
 *
 * 参加运算的两个数，按二进制位进行或运算，只要两个数中的一个为1，结果就为1。
 *
 * 即 0|0=0,1|0=1，1|1=1。
 *
 * 例：2|4即00000010|00000100=00000110，所以2|4=6 ）
 *
 * 现在请你计算所有情况下小马的得分之和。
 * @Author bingham
 * @Date 2021/3/28 18:58
 * @Version 1.0
 **/
public class test1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String next = scan.next();
    }
}
