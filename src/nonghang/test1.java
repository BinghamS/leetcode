package nonghang;

import java.util.Scanner;

public class test1 {
    public static int oprate(int a,int b,String op){
        if (op.equals("+")){
            return a+b;
        }else if (op.equals("-")){
            return a-b;
        }else if (op.equals("*")){
            return a*b;
        }else return a/b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String opration[] = { "+","-","*","/"};

        int res = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 4; k++) {
                    int oprate = oprate(n, n, opration[i]);
                    int oprate1 = oprate(oprate, n, opration[j]);
                    int oprate2 = oprate(oprate1, n, opration[k]);
                    if (oprate2 == m){
                        res = 1;
                        break;
                    }
                }
            }
        }
        System.out.println(res);
    }
}
