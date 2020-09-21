package duxiaoman;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class test2 {
    public static int dir[][] = {{1,0},{0,-1},{-1,0},{0,1}};

    public static Boolean in(int x,int y,int n,int m){
        return  x>=0 && x<n && y>=0 && y<m;
    }



    public static void dfs(int x,int y,int step,int[][] arr,Boolean[][] isvisited,int ans){
        if (in(x,y,arr.length,arr[0].length)){
            ans = step;
        }
        isvisited[x][y] = true;
        for (int i = 0; i < 4; i++) {
            int tx = x +dir[i][0];
            int ty = y + dir[i][1];
            if (in(tx,ty,arr.length,arr[0].length) && arr[tx][ty] != 3 && !isvisited[tx][ty]){
                dfs(tx,ty,step+1,arr,isvisited,ans);
            }
        }
        isvisited[x][y] = false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int arr[][] = new int[N][M];
            int m = 0,n = 0;
            for (int j = 0; j < N; j++) {
                String s = sc.nextLine();
                for (int k = 0; k < s.length(); k++) {
                    if (s.charAt(k) == '@'){
                        arr[j][k] = 7;//起始点
                    }else if (s.charAt(k) == '.' || s.charAt(k) == '*'){
                        arr[j][k] = 0;//空地
                    }else {
                        arr[j][k] = 3;//不可破坏的障碍物
                    }
                }

            }

            Boolean isVisited[][] = new Boolean[arr.length][arr[0].length];

            for (int k = 0; k < arr.length; k++) {
                for (int j = 0; j < arr[0].length; j++) {
                    if (k == m &&j == n){
                        isVisited[k][j] = true;
                    }else isVisited[k][j] = false;
                }
            }
            int max = Integer.MAX_VALUE;
            dfs(m,n,0,arr,isVisited,max);
            System.out.println(max);
        }
    }
}
