package JD;

import java.util.Scanner;

public class transform {
    public void transform(int num,int n){
        //参数num为输入的十进制数，参数n为要转换的进制
        int array[]=new int[10000];
        int location=0;
        while(num!=0){//当输入的数不为0时循环执行求余和赋值
            int remainder=num%n;
            num=num/n;
            array[location]=remainder;//将结果加入到数组中去
            location++;
        }
        String str = "";
        for(int i=location-1;i>=0;i--){
            if(array[i]>9){
                if(array[i]+55 == 0){
                    str += '@';
                }else if(array[i]+55 == 1){
                    str += '$';
                }else{
                    str += '&';
                }
            }
            else
            if(array[i] == 0){
                str += '@';
            }else if(array[i] == 1){
                str += '$';
            }else{
                str += '&';
            }
        }
        System.out.println(str);
    }
    private void show(int[] arr,int n){
        String str = "";
        for(int i=n;i>=0;i--){
            if(arr[i]>9){
                str+=swap(arr[i]+55);
            }
            else
                str += swap(arr[i]);
        }
        System.out.println(str);
    }

    public char swap(int a){
        if(a == 0){
            return '@';
        }else if(a == 1){
            return '$';
        }else{
            return '&';
        }
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        transform transform = new transform();
        transform.transform(input,3);
    }
}
