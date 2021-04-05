package Array.Q867transpose;

/**
 * @ClassName run
 * @Deacription TODO
 * @Author bingham
 * @Date 2021/1/28 15:58
 * @Version 1.0
 **/
public class run {
    public static void main(String[] args) {
        int[][] a = {{1,2,3}, {4, 5, 6}, {7, 8, 9}};
        me me = new me();
        int[][] transpose = me.transpose(a);
        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose[0].length; j++) {
                System.out.print(transpose[i][j]);
                System.out.print("   ");
            }
            System.out.println();
        }
    }
}
