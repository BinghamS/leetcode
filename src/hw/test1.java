package hw;

import java.util.*;

public class test1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
//        int[][] arr = new int[n][2];
//        for (int i = 0; i < n; i++) {
//            arr[i][0] = scan.nextInt();
//            arr[i][1] = scan.nextInt();
//        }

        int n = 6;
        int[][] arr = {{2,2},{2,1},{3,2},{5,2},{3,1},{7,2}};


        int[][] a1 = new int[3][2];
        int[][] b1 = new int[3][2];

        TreeMap<Integer, Integer> treeMap1 = new TreeMap<Integer, Integer>();
        TreeMap<Integer, Integer> treeMap2 = new TreeMap<Integer, Integer>();

        for (int i = 0; i < n; i++) {
            if (arr[i][1] == 1){
                treeMap1.put(i,arr[i][0]);
            }
            if (arr[i][1] == 2){
                treeMap2.put(i,arr[i][0]);
            }
        }

        int count1 = 0,count2 = 0;
        int[] res1;
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        int[][] array1 = new int[treeMap1.size()][2];
        if (treeMap1.size()<=3){
            Iterator<Map.Entry<Integer, Integer>> iterator1 = treeMap1.entrySet().iterator();
            res1 = new int[treeMap1.size()];
            int i = 0;
            while(iterator1.hasNext()){
                Map.Entry entry = (Map.Entry)iterator1.next();
                int value = (int) entry.getValue();
                count1 = count1 + value;
                res1[i] = (int) entry.getKey();
                arrayList1.add(res1[i]+1);
                i++;
            }
        }else if(treeMap1.size() > 3){
            Iterator<Map.Entry<Integer, Integer>> iterator1 = treeMap1.entrySet().iterator();
            res1 = new int[3];
            int i = 0;
            while(iterator1.hasNext()){
                Map.Entry entry = (Map.Entry)iterator1.next();
                int value = (int) entry.getValue();
//                count2 = count2 + value;
//                res[i] = (int) entry.getKey();
//                arrayList2.add(res[i]+1);
                array1[i][0] = value;
                array1[i][1] = (int) entry.getKey();
                i++;
            }

            i = 0;
            for (int j = array1.length-1; j >= array1.length-3; j--) {
                count1 = count1 + array1[j][0];
                res1[i] = array1[j][1]+1;
                arrayList1.add(array1[j][1]+1);
            }
        }

        ArrayList<Integer> arrayList2 = new ArrayList<>();
        int[][] array2 = new int[treeMap2.size()][2];
        int[] res2;
        if (treeMap2.size()<=3){
            Iterator<Map.Entry<Integer, Integer>> iterator2 = treeMap2.entrySet().iterator();
            res2 = new int[treeMap2.size()];
            int i = 0;
            while(iterator2.hasNext()){
                Map.Entry entry = (Map.Entry)iterator2.next();
                int value = (int) entry.getValue();
                count2 = count2 + value;
                res2[i] = (int) entry.getKey();
                arrayList1.add(res2[i]+1);
                i++;
            }
        }else if(treeMap2.size() > 3){
            Iterator<Map.Entry<Integer, Integer>> iterator2 = treeMap2.entrySet().iterator();
            res2 = new int[3];
            int i = 0;
            while(iterator2.hasNext()){
                Map.Entry entry = (Map.Entry)iterator2.next();
                int value = (int) entry.getValue();
//                count2 = count2 + value;
//                res[i] = (int) entry.getKey();
//                arrayList2.add(res[i]+1);
                array2[i][0] = value;
                array2[i][1] = (int) entry.getKey();
                i++;
            }

            i = 0;
            for (int j = array2.length-1; j >= array2.length-3; j--) {
                count2 = count2 + array2[j][0];
                res2[i] = array2[j][1]+1;
                arrayList2.add(array2[j][1]+1);
            }
        }


        if (count1 >= count2){
            int res[] = new int[arrayList1.size()];
            for (int i = 0; i<arrayList1.size(); i++) {
                res[arrayList1.size()-i-1] = arrayList1.get(i);
                //System.out.print(arrayList1.get(i) + " ");
            }
            for (int i = 0; i < arrayList1.size(); i++) {
                System.out.print(res[i]+" ");
            }
            System.out.println();
            System.out.println(1);
            System.out.println(count1);
        }else{
            int res[] = new int[arrayList2.size()];
            for (int i = 0; i < arrayList2.size(); i++) {
                res[arrayList2.size()-i-1] = arrayList2.get(i);
//                System.out.print(arrayList2.get(i) + " ");
            }
            for (int i = 0; i < res.length; i++) {
                System.out.print(res[i]+" ");
            }
            System.out.println();
            System.out.println(2);
            System.out.println(count2);
        }



    }
}
