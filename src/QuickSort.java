
/**
 * 快速排序
 */
public class QuickSort {
    public static void quickSort(int[] arr,int low,int high){
        int i ,j ,temp,t;
        if (low > high){return;}
        i=low;
        j = high;
        temp = arr[low];    //temp就是基准位
        while (i<j){
            //先看右边，依次向左递减
            while (temp<=arr[j] && i<j){
                j--;
            }
            //再看左边，依次往右递增
            while (temp>=arr[i] && i<j){
                i++;
            }
            //如果满足条件则交换
            if (i<j){
                t = arr[j];
                arr[j] = arr[i];
                arr[i] = t;
            }
        }
        //最后将基准位与i和j相等位置的数字交换
        arr[low] = arr[i];
        arr[i] = temp;
        //递归调用左半函数
        quickSort(arr,low,j-1);
        //递归调用右半函数
        quickSort(arr,j+1,high);
    }


    public static void main(String[] args) {
        int[] arr = {5,95,32,85,65,45,32,84,32,658};
        quickSort(arr,0,arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        };
    }
}
