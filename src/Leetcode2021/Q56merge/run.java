package Q56merge;

/**
 * @ClassName run
 * @Deacription TODO
 * @Author bingham
 * @Date 2021/2/25 11:40
 * @Version 1.0
 **/
public class run {
    public static void main(String[] args) {
        int arr[][] = {{1, 4}, {4, 5}};
        me me = new me();
        int[][] merge = me.merge(arr);
        for (int i = 0; i < merge.length; i++) {
            for (int j = 0; j < merge[0].length; j++) {
                System.out.print(merge[i][j]+"     ");
            }
            System.out.println();
        }
    }
}
