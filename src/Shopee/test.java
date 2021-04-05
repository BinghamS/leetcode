package Shopee;

/**
 * @ClassName test
 * @Deacription TODO
 * @Author bingham
 * @Date 2021/1/21 11:20
 * @Version 1.0
 **/
public class test {
    public static void dfs(char[][] grid,int row,int col){
        int row_length = grid.length;
        int col_length = grid[0].length;

        if (row<0|| col<0|| row >=row_length || col>=col_length|| grid[row][col] == '0'){
            return;
        }

        grid[row][col] = '0';
        dfs(grid,row-1,col);//向上
        dfs(grid,row+1,col);//向下
        dfs(grid,row,col-1);//向左
        dfs(grid,row,col+1);//向右

    }

    public static int getIslandsNum(char[][] grid){
        if ( grid == null){
            return 0;
        }

        int num_Islans = 0;
        for ( int i=0;i<grid.length;i++){
            for( int j = 0;j< grid[0].length;j++){
                if( grid[i][j] =='1'){
                    num_Islans++;
                    dfs(grid,i,j);
                }
            }
        }
        return num_Islans;
    }


    public static void main(String[] args) {
        char [][] grid =new char[][]{
                {'1','1','0','0','0'},
                {'1','1','0','0','0'},
                {'0','0','1','0','0'},
                {'0','0','0','1','1'}
        };

        int islandsNum = getIslandsNum(grid);
        System.out.println(islandsNum);


    }
}
