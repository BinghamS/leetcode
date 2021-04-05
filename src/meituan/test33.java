package meituan;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @ClassName test33
 * @Deacription TODO
 * @Author bingham
 * @Date 2021/3/13 16:51
 * @Version 1.0
 **/
public class test33 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

//        int res[] = new int[n-k+1];

        for (int i = 0; i < n - k + 1; i++) {
            int[] cur_arr = Arrays.copyOfRange(arr, i, i + k);
            int mostNum = getMostNum(cur_arr);
//            res[i] = mostNum;
            System.out.println(mostNum);
        }

    }

    public static int getMostNum(int[] cur){
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int a :
                cur) {
            hashMap.put(a,hashMap.getOrDefault(a,0) + 1) ;
        }
        int max_value = Integer.MIN_VALUE;

        for (int value:
             hashMap.values()) {
            max_value = Math.max(max_value,value);
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int key:
                hashMap.keySet()) {
            if(hashMap.get(key) == max_value){
                list.add(key);
            }
        }

        if (list.size() == 1){
            return list.get(0);
        }
        else{
            int res = Integer.MAX_VALUE;
            for (int a:
                 list) {
                res = Math.min(res,a);
            }
            return res;
        }

    }

//    public static <T> T getModel(List<T> valueList){
//        return valueList
//                .stream()
//                .filter(Object::nonNull)
//                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
//                .entrySet()
//                .stream()
//                .max((Comparator.comparingLong(Map.Entry<T, Long>::getValue)))
//                .map(Map.Entry::getKey)
//                .orElse(null);
//    }

    public static int mode(int[] a){
        int maxValue = 0,maxCount = 0;
        for (int i = 0; i < a.length; i++) {
            int count = 0;
            for (int j = 0; j < a.length; j++) {
                if(a[j] == a[i]) count++;
            }
            if (count > maxCount){
                maxCount = count;
                maxValue = a[i];
            }
        }
        return maxValue;
    }
}
