package JD;

import java.util.Scanner;

public class poke {
    public String getHeart(String[] str){
        int cols = 0;
        int rows = 0;
        String str_res = "";
        for (int i = 0; i < str.length; i++) {
            String[] split = str[i].split(",");
            cols += Integer.parseInt(split[0]);
            rows += Integer.parseInt(split[1]);
        }
        str_res = cols/str.length +"," + rows/str.length;
        return str_res;
    }
    public int getPot(String[] str_list,String heart){
        for (int i = 0; i < str_list.length; i++) {
            if (str_list.equals(heart)){
                return i+1;
            }
        }
        int min_dis = 0;
        int res = 0;
        for (int i = 0; i < str_list.length; i++) {
            int dis = getDistance(str_list[i],heart);
            if (dis<min_dis){
                res = i+1;
            }
        }
        return res;
    }
    public int getDistance(String str,String heart){
        int dis_temp = 0;
        String[] str_sp = str.split(",");
        String[] heart_sp = heart.split(",");
        dis_temp = (Integer.parseInt(heart_sp[0])-Integer.parseInt(str_sp[0]))^2 +(Integer.parseInt(heart_sp[1])-Integer.parseInt(str_sp[1]))^2;
        return dis_temp;
    }

    public static void main(String[] args) {
        String str[] = {"1,1","2,2","1,2","1,3"};
        poke poke = new poke();
        String res = poke.getHeart(str);
        int pot = poke.getPot(str, res);
        System.out.println(pot);
    }
}
