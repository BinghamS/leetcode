package DJI;

import java.util.Scanner;

public class test1 {

    public static int[] Dijsltra(int[][] weight,int start){
        int n = weight.length;//顶点个数
        int[] shortPath = new int[n];//最短路径
        String[] path = new String[n];
        for (int i = 0; i < n; i++) {
            path[i] = new String(start+"-->"+i);
        }
        int[] visited = new int[n];//当前最短路径是否已求出

        //初始化
        shortPath[start] = 0;
        visited[start] = 1;

        for (int count = 0; count < n - 1; count++) {
            int k = -1;
            int dmin = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                if (visited[i] ==0 && weight[start][i] < dmin){
                    dmin = weight[start][i];
                    k = i;
                }
            }
            //System.out.println("k="+k);
            shortPath[k] = dmin;

            visited[k] = 1;

            for (int i = 0; i < n; i++) {
                if (visited[i] == 0 && weight[start][k] + weight[k][i]<weight[start][i]) {
                    weight[start][i] = weight[start][k] + weight[k][i];
                    path[i] = path[k]+"-->"+i;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            return shortPath;
        }
        return null;
    }



    public static void main(String[] args) {
        //输入
        Scanner scanner = new Scanner(System.in);
        String n_p = scanner.nextLine();
        String[] s2 = n_p.split(" ");
        int n = Integer.parseInt(s2[0]);
        int p = Integer.parseInt(s2[1]);

        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = 10000;
            }
        }
        for (int i = 0; i < p; i++) {
            String s = scanner.nextLine();
            String[] s1 = s.split(" ");
            int x = Integer.parseInt(s1[0]);
            int y = Integer.parseInt(s1[1]);
            int z = Integer.parseInt(s1[2]);
            a[x][y] = z;
        }

        int X = scanner.nextInt();

        int start = 0;
        int[] shortPath = Dijsltra(a,start);

        System.out.println(shortPath[X]);

    }

}
