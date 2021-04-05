package Q74searchMatrix;

/**
 * @ClassName run
 * @Deacription TODO
 * @Author bingham
 * @Date 2021/2/9 23:10
 * @Version 1.0
 **/
public class run {
    public static void main(String[] args) {
        me me = new me();
        int matrix[][] = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 50}};
        int target = 30;
        boolean b = me.searchMatrix(matrix, target);
        System.out.println(b);
    }
}
