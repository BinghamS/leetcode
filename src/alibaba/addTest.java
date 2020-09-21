package alibaba;

import java.util.Scanner;

/*
• 输入N M，表示有N个路口，M条路，
下面输入M行，每行输入A B C,表示A路口到B路口之间有条路，需要花费C分钟来走，正反方向时间一致。
请问从路口1走到路口N，需要多久？

输入：
2 1
1 2 3
输出：
3
输入：
3 3
1 2 5
2 3 5
3 1 2
输出：
2
*/
public class addTest {
    public int[] getShortestPaths(int[][] adjMatrix) {
        int[] result = new int[adjMatrix.length];
        boolean[] used = new boolean[adjMatrix.length];
        used[0] = true;  //表示顶点0已被遍历
        for(int i = 1;i < adjMatrix.length;i++) {
            result[i] = adjMatrix[0][i];
            used[i] = false;
        }

        int i = adjMatrix.length-1;
        int min = Integer.MAX_VALUE;
        int k = 0;
        for(int j = 1;j < adjMatrix.length;j++) {
            if(!used[j] && result[j] != -1 && min > result[j]) {
                min = result[j];
                k = j;
            }
        }
        used[k] = true;
        for(int j = 1;j < adjMatrix.length;j++) {
            if(!used[j]) {
                if(adjMatrix[k][j] != -1 && (result[j] > min + adjMatrix[k][j] || result[j] == -1))
                    result[j] = min + adjMatrix[k][j];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        add test = new add();
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        int[][] map = new int[N][N];
        for (int i = 0; i < M; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
            map[a-1][b-1] = c;
            map[b-1][a-1] = c;
        }
        int[] result = test.getShortestPaths(map);
        System.out.print(result[result.length-1]+" ");
    }
}
