package test;

public class test0923 {
    public static void main(String[] args) {
        int arr[] = {1, 4, -5, 9, 8, 3, -6};
        int max = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                //ArrayList<Integer> list = new ArrayList<>();
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }
                max = Math.max(sum,max);
            }
        }
        System.out.println(max);
    }
}
