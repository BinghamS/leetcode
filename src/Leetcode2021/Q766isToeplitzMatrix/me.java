package Q766isToeplitzMatrix;

/**
 * @ClassName me
 * @Deacription TODO
 * @Author bingham
 * @Date 2021/2/22 10:12
 * @Version 1.0
 **/
public class me {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int m,n;
        for (int j = 0; j < rows-1; j++) {
            for (int i = 0; i < cols; i++) {
                int golden = matrix[j][i];
                m = j+1;
                n = i+1;
                while(m < rows && n < cols){
                    if(matrix[m][n] != golden) return false;
                    m++;
                    n++;
                }

            }
        }

        return true;

    }
}
