package alibaba;

import java.util.Scanner;

public class test11
{
    public static long judge(String s,String t){
        int i;
        int j;
        int w=0;
        for(i=0;i<=s.length()-1;i++)
        {
            for(j=w;j<=t.length()-1;j++)
            {
                if(s.charAt(i)==t.charAt(j))
                {
                    w++;
                    break;
                }
            }
        }
        if(w==s.length())
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
    public static void main(String[]args)
    {

        Scanner scanner = new Scanner(System.in);
        long snum = scanner.nextInt();
        long tnum = scanner.nextInt();
        String s1 = scanner.next();
        String t = scanner.next();

        long result=0;
        String s2="";
        for(int i=0;i<s1.length();i++){
            s2="";
            for(int j=i;j<s1.length();j++){
                s2+=s1.charAt(j);
                result+=judge(s2,t);

            }
        }
        System.out.println(result);
    }
}