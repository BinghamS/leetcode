package test;

public class me {
    public String solution(int k,int n,int[] arr){
        int sum = 0;
        int num = 0;
        int distance = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum == k) return "paradox";
            else if (sum > k){
                distance = sum - k;
                sum = k - distance;
                num++;
            }else{
                distance = k-sum;
            }
        }

        return distance + " " + num;
    }
}
