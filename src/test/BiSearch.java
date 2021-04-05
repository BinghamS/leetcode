package test;

/**
 * @ClassName BiSearch
 * @Deacription TODO
 * @Author bingham
 * @Date 2021/3/26 11:19
 * @Version 1.0
 **/
public class BiSearch {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int res = search(arr, 6);
        System.out.println(res);
    }

    public static int search(int[] arr, int target){
        int left = 0;
        int right = arr.length-1;
        while(left < right){
            int mid = (left + right) / 2;
            if(arr[mid] == target){
                return mid;
            }
            if(arr[mid] > target){
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        return -1;
    }
}
