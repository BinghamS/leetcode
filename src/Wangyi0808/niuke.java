package Wangyi0808;

public class niuke {
    public int minNumberInRotateArray(int [] array) {
        int [] arr_res = new int[array.length];
        if (array.length % 2 == 0){
            //偶数
            for (int i = 0; i < (array.length / 2);i++){
                arr_res[i] = array[i+array.length/2];
            }
            for (int i = (array.length / 2); i < array.length; i++) {
                arr_res[i] = array[i-array.length/2];
            }
        }else {
            //奇数
        }
        

        return 0;
    }
    public static void main(String[] args) {
        niuke niuke = new niuke();
        int[] arr = {3,4,1,2};
        int res = niuke.minNumberInRotateArray(arr);
        System.out.println(res);
    }
}
