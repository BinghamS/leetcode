package xiecheng;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class test1 {

        public ArrayList<String> Permutation(String str) {
            ArrayList list = new ArrayList();
            if (str != null && str.length() > 0) {
                PermutationHelper(str.toCharArray(), 0, list);
                //上图所示，左右在以C开头的字符串，结果并不是已经排好序的，所以进行sort
                Collections.sort(list);
            }
            return list;
        }
        //递归method
        public static void PermutationHelper(char[] cs,int i, ArrayList list) {
            //当进行两次交换即：A swap A ， B swap B
            if(i == cs.length - 1) {
                //结果之一
                String val = String.valueOf(cs);
                //这里做了去重判断，原因是因为当有重复的元素时会出现相同的字符串，例：aabc
                if (!list.contains(val)){
                    list.add(val);
                }
            }else {
                for(int j = i; j < cs.length; ++j) {
                    swap(cs, i, j);
                    PermutationHelper(cs, i + 1, list);
                    //回溯
                    swap(cs, i, j);
                }
            }
        }
        //swap交换操作
        public static void swap(char[] s,int i,int j) {
            char tmp = s[i];
            s[i] = s[j];
            s[j] = tmp;
        }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String before = scan.nextLine();
        String sentence = scan.nextLine();
        String after = scan.nextLine();

        ArrayList<String> strings = new ArrayList<>();
        test1 test1 = new test1();
        strings = test1.Permutation(before);
        String s = sentence;
        for (int i = 0; i < strings.size(); i++) {
            s = s.replaceAll(strings.get(i), after);
        }
        System.out.println(s);
    }
}
