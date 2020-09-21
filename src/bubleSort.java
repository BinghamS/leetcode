public class bubleSort {

    public static int[] bubleSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int [] arr = {1,5,2,9,1,3,4,75,6,8,4,2,6,87,1,5,5,2,7};
        int[] ints = bubleSort(arr);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }
}
