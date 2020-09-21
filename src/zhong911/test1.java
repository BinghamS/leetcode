package zhong911;

import java.util.ArrayList;
import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int left = 0;
        int right = 1;
        int a1 = arr[0];
        int a2 = arr[1];

        ArrayList<Integer> list = new ArrayList<>();
        list.add(a1);
        list.add(a2);

        for (int i = 2; i < n; i++) {
            while (i>=left && i<=right && right<n){
                if (arr[i] == a1 || arr[i] ==a2 ){
                    right++;
                    list.add(arr[i]);
                }else {
                    a1 = arr[left+1];
                    a2 = arr[left+2];
                    left++;
                    right = left+1;
                    list.clear();
                    list.add(a1);
                    list.add(a2);
                }
            }
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.indexOf(i));
        }

    }
}
