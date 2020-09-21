package Wangyi0808;

import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());//几个数
        if (n<1 || n > 1000000) System.out.println(0);
        String str_a = scan.nextLine();
        String[] s = str_a.split(" ");
        int[] a = new int[n];//数组
        int num = 0; // 可拆分素数和
        for (int i = 0; i < s.length; i++) {
            a[i] = Integer.parseInt(s[i]);
            int temp = a[i];
            if (temp>1){
                if (temp == 2 || temp == 3){
                    num += 1;
                }
                else if (temp%2==0){//偶数
                    int num_temp = temp / 2;
                    num += num_temp;
                }else{//大于3的奇数
                    temp = temp-3;
                    int num_temp = temp / 2 + 1;
                    num += num_temp;
                }
            }
        }

        System.out.println(num);

    }
}
