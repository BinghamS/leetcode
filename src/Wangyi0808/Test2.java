package Wangyi0808;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Test2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line1 = scanner.nextLine();
        String[] str_line1 = line1.split(" ");
        int n = Integer.parseInt(str_line1[0]); // 得到长度n
        int m = Integer.parseInt(str_line1[1]); // 给定长度m

        String line2 = scanner.nextLine();
        String[] str_line2 = line2.split(" ");
        int min_target = 0;

        if (m == 0){
            System.out.println(0);
        }

        Arrays.sort(str_line2,new StringComparator());
        String min_num = str_line2[0];
        String max_num = str_line2[str_line2.length-1];



        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < str_line2.length; i++) {
            sb.append(str_line2[i]+" ");
        }

        System.out.println(sb.toString());


    }
}
class StringComparator implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        return (o1 + o2).compareTo(o2 + o1);
    }
}