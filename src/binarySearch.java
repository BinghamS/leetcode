/**
 * 二分搜索
 */

public class binarySearch {
    public static int BinarySearch(int[] arr,int key,int low,int high){
        int mid = 0;
        if (low>=0 && high<=arr.length && low<=high){
            mid = (low + high)/2;
            if (arr[mid]>key){
                return BinarySearch(arr,key,low,mid-1);
            }else if(arr[mid]<key){
                return BinarySearch(arr,key,mid+1,high);
            }else {return mid;}
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 5, 8, 10, 15, 19, 23, 26, 28, 30};
        System.out.println(BinarySearch(arr, 15, 0, 10));
    }
}
