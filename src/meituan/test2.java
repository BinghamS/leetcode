package meituan;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int P = sc.nextInt();
        int Q = sc.nextInt();

        int map[][] = new int[N+1][M];
        int cur_i = 0;
        int cur_j = 0;
        int score = 0;
        for (int i = 0; i <= N; i++) {
            String s = sc.nextLine();
            char[] chars = s.toCharArray();
            for (int j = 0; j < chars.length; j++) {
                map[i][j] = getnum(chars[j]);
                if (map[i][j] == 3){
                    cur_i = i;
                    cur_j = j;
                    map[i][j] = 0;
                }
            }
        }


        String ways = sc.nextLine();
        for (int i = 1; i < ways.length(); i++) {
            if (ways.charAt(i) == 'W'){
                cur_i = cur_i+1;
                if (cur_i>0 && cur_i <N){
                    if (map[cur_i][cur_j] ==1){
                        cur_i = cur_i-1;
                    }else if (map[cur_i][cur_j] == 6){
                        score += P;
                    }else if (map[cur_i][cur_j] == 9){
                        score = score-Q;
                    }
                }else {
                    cur_i --;
                }
            }
            if (ways.charAt(i) == 'S'){
                cur_i = cur_i-1;
                if (cur_i>0 && cur_i <N){
                    if (map[cur_i][cur_j] ==1){
                        cur_i = cur_i+1;
                    }else if (map[cur_i][cur_j] == 6){
                        score += P;
                    }else if (map[cur_i][cur_j] == 9){
                        score = score-Q;
                    }
                }else {
                    cur_i ++;
                }
            }
            if (ways.charAt(i) == 'A'){
                cur_j = cur_j-1;
                if (cur_j>0 && cur_i <M){
                    if (map[cur_i][cur_j] ==1){
                        cur_j = cur_j+1;
                    }else if (map[cur_i][cur_j] == 6){
                        score += P;
                    }else if (map[cur_i][cur_j] == 9){
                        score = score-Q;
                    }
                }else {
                    cur_j ++;
                }
            }
            if (ways.charAt(i) == 'D'){
                cur_j = cur_j+1;
                if (cur_j>0 && cur_i <M){
                    if (map[cur_i][cur_j] ==1){
                        cur_j = cur_j-1;
                    }else if (map[cur_i][cur_j] == 6){
                        score += P;
                    }else if (map[cur_i][cur_j] == 9){
                        score = score-Q;
                    }
                }else {
                    cur_j --;
                }
            }
        }

        System.out.println(score);

    }



    public static int getnum(char ch){
        if (ch == 'S'){//起点
            return 3;
        }else if (ch == '#'){//墙
            return 1;
        }else if (ch == '+'){//普通路
            return 0;
        }else if (ch == 'O'){//得分
            return 6;
        }else{//x 陷阱
            return 9;
        }
    }

}
