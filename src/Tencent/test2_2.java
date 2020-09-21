package Tencent;

import java.util.Arrays;
import java.util.Scanner;

public class test2_2 {
    int getMin(char[]input,int index){
        char min=input[index];
        int minIndex=index+1;
        char result='z';
        for(int i=index+1;i<input.length;i++){
            if(input[i]>min&&input[i]<result){
                result=input[i];
                minIndex=i;
            }
        }
        return minIndex;
    }
    void exchange(char []input,int index,int minIndex){
        char temp=input[index];
        input[index]=input[minIndex];
        input[minIndex]=temp;
    }
    void reverse(char input[],int first,int end) {
        while(first<end){
            exchange(input,first,end);
            first++;
            end--;
        }
    }

    public static String getSubString(String str,int k){
        if (k<=str.length()){
            String res = str.substring(0,k);
            return res;
        }else if (k<=str.length()*2-1){
            String res =  str.substring(1,k-str.length());
            return res;
        }

        return "_________";
    }

    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        int k = scan.nextInt();
        char [] c=input.toCharArray();
        Arrays.sort(c);
//        System.out.println(new String(c));
        System.out.println(getSubString(input, k));

    }
}
