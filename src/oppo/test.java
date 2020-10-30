package oppo;

public class test {

    public int bsearch(int []arr,int key,int low,int high){
        if (low <= high){
            int mid = (low + high)/2;
            if (key < arr[mid]){
                return bsearch(arr,key,low,mid-1);
            }else if (key > arr[mid]){
                return bsearch(arr,key,mid + 1,high);
            }else {
                return mid;
            }
        }
        return -1;
    }


}
