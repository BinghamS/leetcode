package nonghang;

import java.util.Scanner;

public class test3 {
    public int reorderedPowerOf2(int N) {
        long c = counter(N);
        for (int i = 0; i < 32; i++)
            if (counter(1 << i) == c) return 1;
        return 0;
    }
    public long counter(int N) {        //对数字进行转换  对每一个数字都变成2的幂次和
        long res = 0;
        for (; N > 0; N /= 10)
            res += (int)Math.pow(3, N % 10);
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        test3 test3 = new test3();
        int res = test3.reorderedPowerOf2(i);
        System.out.println(res);

    }
}
