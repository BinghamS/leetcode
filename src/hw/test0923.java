package hw;

import java.util.ArrayList;

public class test0923 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int arr[] = {1,2,3};
        int m = 0;
        for (int i = 0; i < 13; i++) {
            int cur =  i % 3;
            if (cur != 2){
                arrayList.add(i);
            }
        }
        for (int res :
                arrayList) {
            System.out.println(res);
        }
    }
}
