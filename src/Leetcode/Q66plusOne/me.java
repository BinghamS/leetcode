package Leetcode.Q66plusOne;

/**
 * TODO
 *
 * @author songb
 * @date 2020/5/20 2:24
 */
public class me {
    public int[] plusOne(int[] digits) {
        if (digits.length == 0) return null;

        int num = 0;
        for (int i = 0; i < digits.length; i++) {
            num = (int) (num + digits[i] * Math.pow(10,(digits.length - i -1)));
//            num = num + digits[i] * (10^(digits.length - i));
        }
        System.out.println(num);
        int num_new = num + 1;


        int n = num_new;
        int count = 0;
        while (n % 10 != 0 || n/10 != 0){
            count ++;
            n = n/10;
        }
        int[] res_arr = new int[count];

        int m = num_new;
        int j = 0;
        for (int i = count; i > 0 ; i--) {
            int a  = (int) (m / Math.pow(10,i-1));
            res_arr[j] = a;
            j++;
            m = m - a * (int)Math.pow(10,i-1);
        }

        return res_arr;

    }
}
