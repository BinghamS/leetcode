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
public class add {
    /*
     * 参数adjMatrix:为图的权重矩阵，权值为-1的两个顶点表示不能直接相连
     * 函数功能：返回顶点0到其它所有顶点的最短距离，其中顶点0到顶点0的最短距离为0
     */
    public int[] getShortestPaths(int[][] adjMatrix) {
        int[] result = new int[adjMatrix.length];   //用于存放顶点0到其它顶点的最短距离
        boolean[] used = new boolean[adjMatrix.length];  //用于判断顶点是否被遍历
        used[0] = true;  //表示顶点0已被遍历
        for(int i = 1;i < adjMatrix.length;i++) {
            result[i] = adjMatrix[0][i];
            used[i] = false;
        }

        int i = adjMatrix.length-1;
            int min = Integer.MAX_VALUE;    //用于暂时存放顶点0到i的最短距离，初始化为Integer型最大值
            int k = 0;
            for(int j = 1;j < adjMatrix.length;j++) {  //找到顶点0到其它顶点中距离最小的一个顶点
                if(!used[j] && result[j] != -1 && min > result[j]) {
                    min = result[j];
                    k = j;
                }
            }
            used[k] = true;    //将距离最小的顶点，记为已遍历
            for(int j = 1;j < adjMatrix.length;j++) {  //然后，将顶点0到其它顶点的距离与加入中间顶点k之后的距离进行比较，更新最短距离
                if(!used[j]) {  //当顶点j未被遍历时
                    //首先，顶点k到顶点j要能通行；这时，当顶点0到顶点j的距离大于顶点0到k再到j的距离或者顶点0无法直接到达顶点j时，更新顶点0到顶点j的最短距离
                    if(adjMatrix[k][j] != -1 && (result[j] > min + adjMatrix[k][j] || result[j] == -1)) {
                        result[j] = min + adjMatrix[k][j];
                    }
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
