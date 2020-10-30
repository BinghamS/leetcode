package webank;

import java.util.*;
public class test11 {

    public static void ask(int []arr,int k){
        int min=Integer.MAX_VALUE;
        int index=-1;
        for(int i=0;i<arr.length;i++){
            if(Math.abs((arr[i]-k))<min){
                min=Math.abs((arr[i]-k));
                index=i;
            }
        }
        System.out.println(arr[index]);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        int q=scan.nextInt();
        int [] arr=new int[n];
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        int [] qu=new int[n];
        for(int j=0;j<q;j++){
            qu[j]=scan.nextInt();
        }
        for(int j=0;j<q;j++){
            ask(arr,qu[j]);
        }
    }

}
