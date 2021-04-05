package alibaba;

import java.util.*;

/**
 * @ClassName test0402
 * @Deacription TODO
 * @Author bingham
 * @Date 2021/4/2 20:37
 * @Version 1.0
 **/
public class test0402 {


    static int N = 5;
    static int M = 5;

    static int start_x = 1;
    static int start_y = 0;

    static int end_x = 4;
    static int end_y = 1;

    static char[][] map = new char[N][M];
    static int[][] visit = new int[N][M];

    static int[][] move = {{0,1},{0,-1},{1,0},{-1,0}};

    static int length = 0;

    static class node{
        int x;
        int y;
        int path;
        node(int x,int y,int path){
            this.x=x;
            this.y=y;
            this.path=path;
        }
    }

    public static boolean check(int x,int y) {
        return x >= 0 && y >= 0 && x < N && y < M && map[x][y] == '.' && visit[x][y] != 1;
    }

    public static void bfs(int x,int y){
        Queue<node> q = new LinkedList<node>();
        q.offer(new node(x, y,1));
        while(!q.isEmpty()){
            node temp = q.poll();
            visit[temp.x][temp.y] = 1;

            if(temp.x==end_x && temp.y == end_y){
                length = temp.path;
                return;
            }

            for (int i = 0; i < 4; i++) {
                int n_x = temp.x + move[i][0];
                int n_y = temp.y + move[i][1];
                int n_path = temp.path + 1;
                if (check(n_x,n_y)){
                    q.offer(new node(n_x,n_y,n_path));
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        for (int i = 0; i < N; i++) {
            String str = scan.next();
            char[] chars = str.toCharArray();
            for (int j = 0; j < M; j++) {
                map[i][j] = chars[j];
            }
        }
        bfs(start_x,start_y);
        System.out.println(length);
    }
}