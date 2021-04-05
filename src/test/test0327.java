package test;

/**
 * @ClassName test0327
 * @Deacription TODO
 * @Author bingham
 * @Date 2021/3/27 17:36
 * @Version 1.0
 **/
public class test0327 {
    public static void main(String[] args) {
        int arr[] = {1,2,4,5,3,2,1,3,4,5,3,2,1};
        int index = getPeekIndex(arr);
        System.out.println(index);
    }

    public static int getPeekIndex(int arr[]){
        int left = 0;
        int right = arr.length - 1;
        int mid = -1;
        while(left <= right){
            mid = (left + right)/2;
            if(arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1]){
                return mid;
            }else if(arr[mid] > arr[mid-1] && arr[mid] < arr[mid+1]){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return mid;
    }

}
