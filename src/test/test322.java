package test;

import java.util.HashMap;
import java.util.HashSet;

public class test322 {
    public static void main(String[] args) {
        int arr[] = {2,2,1,3,3};
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (!set.contains(arr[i])){
                set.add(arr[i]);
            }else {
                set.remove(arr[i]);
            }
        }
        for (int a :set) {
            System.out.println(a);
        }
    }
}
