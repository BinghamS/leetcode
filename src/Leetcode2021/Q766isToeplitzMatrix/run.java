package Q766isToeplitzMatrix;

/**
 * @ClassName run
 * @Deacription TODO
 * @Author bingham
 * @Date 2021/2/22 10:12
 * @Version 1.0
 **/
public class run {
    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3, 4}, {5, 1, 2, 3}, {9, 5, 1, 2}};
        /*
         36 59 71 15 26 82 87
         56 36 59 71 15 26 82
         15  0 36 59 71 15 26
         * */
        /*
         1 2 3 4
         5 1 2 3
         9 5 1 2
         **/
        me me = new me();
        boolean toeplitzMatrix = me.isToeplitzMatrix(arr);
        System.out.println(toeplitzMatrix);
    }
}
