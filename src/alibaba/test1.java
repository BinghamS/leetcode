package alibaba;

import java.util.HashSet;
import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int s_length = scan.nextInt();
//        int t_length = scan.nextInt();
//        String s = scan.nextLine();
//        String t = scan.nextLine();

        int s_length = 2;
        int t_length = 4;
        String s = "ac";
        String t = "abca";


        HashSet<String> s_sub = new HashSet<String>();
        for (int i = 0; i < s_length; i++) {
            for (int j = 1; j <= s_length; j++) {
                s_sub.add(s.substring(i,j));

            }
        }
        s_sub.remove("");

        HashSet<String> t_sub = new HashSet<String>();
        for (int i = 0; i < t_length; i++) {
            for (int j = 1; j <= t_length; j++) {
                t_sub.add(t.substring(i,j));
            }
        }
        t_sub.remove("");
        int aaa = s_sub.size();
        String s_stringlist[] = new String[s_sub.size()];
//        for (int i = 0; i < s_sub.size(); i++) {
////            s_stringlist[i] = s_sub.;
//        }
        int m = 0;
        for (String str:s_sub){
            s_stringlist[m] = str;
        }


        int count = 0;
        for (int i = 0; i < s_sub.size(); i++) {
            for (int j = 0; j < t_sub.size(); j++) {

            }
        }

    }
}
