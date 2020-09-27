package hw;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class test2222 {
    public static void main(String[] args) {
        String s = "1&4&&10&20&&23";
        ArrayList<Integer> res = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        int pre;
        int last;
        String[] sp1 = s.split("&&");
        for (int i = 0; i < sp1.length; i++) {
            String[] sp2 = sp1[i].split("&");
            if (sp2.length ==1){//只有一个数
                pre = Integer.parseInt(sp2[0]);
                if (temp.size() == 0){
                    temp.add(pre);
                }else {
                    for (int j = temp.get(0); j < pre+1; j++) {
                        res.add(j);
                    }
                    temp.clear();
                }
            }else {//多个数
                Boolean flag = false;
                for (int j = 0; j < sp2.length;j++) {
                    res.add(Integer.parseInt(sp2[j]));
                    pre = Integer.parseInt(sp2[0]);
                    last = Integer.parseInt(sp2[sp2.length-1]);
                    if (j != 0 && j != sp2.length-1){
                        continue;
                    }else if (j == 0){
                        if (temp.size() == 0){//在两侧计数
                            temp.add(pre);
                            flag = true;
                        }else {
                            if (flag){
                                System.out.println(111);
                            }else {
                                for (int m = temp.get(0); m < pre+1; m++) {
                                    res.add(m);
                                }
                                temp.clear();
                            }
                        }
                    }else {
                        temp.add(last);
                    }
                }
            }
        }
        HashSet<Integer> integers = new HashSet<>();
        for (int a :res) {
            integers.add(a);
            //System.out.println(a);
        }
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int a :
                integers) {
            treeSet.add(a);
        }
        for (int a :
                treeSet) {
            System.out.println(a);
        }

    }
}
