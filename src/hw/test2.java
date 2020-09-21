package hw;
import java.util.*;

public class test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().trim().split(" ");
        int r = Integer.parseInt(s[0]);
        int c = Integer.parseInt(s[1]);

        int[][] arr = new int[r][c];
        for (int i = 0; i < r; i++) {
            String str = sc.nextLine().trim();
            for (int j = 0; j < c; j++) {
                if (str.charAt(j)=='S') arr[i][j] = 0;
                else arr[i][j] = 1;
            }
        }
        //上面是输入数据

//        查看dfs前的数组
//        for (int i = 0; i < r; i++)
//            System.out.println(Arrays.toString(arr[i]));

        test2 demo = new test2();
        int j = demo.numLakes(arr);
        System.out.println(j);
//        查看dfs后的数组
//        for (int i = 0; i < r; i++)
//            System.out.println(Arrays.toString(arr[i]));

    }
    //计算岛屿数量
    public int numLakes(int[][] grid){
        if(grid == null||grid.length == 0) return 0;
        int nr = grid.length;
        int nc = grid[0].length;
        int num_islands = 0;
        for (int r = 0; r < nr; r++) {
            for (int c = 0; c < nc; c++) {
                if(grid[r][c] == 0){
                    num_islands++;
                    dfs(grid,r,c);
                }
            }
        }
        return num_islands;
    }
    //深度优先搜索，将查看过的置为1
    private void dfs(int[][] grid, int r, int c) {
        int nr = grid.length;
        int nc = grid[0].length;
        if(r<0||c<0||r>=nr||c>=nc||grid[r][c] == 1) return;
        grid[r][c] = 1;
        dfs(grid,r-1,c);
        dfs(grid,r+1,c);
        dfs(grid,r,c-1);
        dfs(grid,r,c+1);
    }
}
