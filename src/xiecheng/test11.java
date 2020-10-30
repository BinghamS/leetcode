package xiecheng;

import java.util.ArrayList;
import java.util.HashMap;

public class test11 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        for (int i :
                arrayList) {
            System.out.println(i);
            if (i == 1){
                int i1 = arrayList.indexOf(i);
                Integer remove = arrayList.remove(i1);
            }
        }

        System.out.println("***************************");
        for (int j :
                arrayList) {
            System.out.println(j);
        }

    }
}
