package Q74searchMatrix;

/**
 * @ClassName me
 * @Deacription TODO
 * @Author bingham
 * @Date 2021/2/9 23:10
 * @Version 1.0
 **/
public class me {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int col = rows-1,row = 0;
        for (int i = 0; i < rows; i++) {
            if (matrix[i][0] < target){
                continue;
            }if(matrix[i][0] > target){
                if(i == 0){
                    return false;
                }
                col = i - 1;
                break;
            }else{
                return true;
            }
        }

        for (int i = 0; i < cols; i++) {
            if (matrix[col][i] < target){
                continue;
            }if(matrix[col][i] > target){
                return false;
            }else{
                return true;
            }
        }

        return false;
    }
}
