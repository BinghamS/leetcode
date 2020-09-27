package Leetcode.Q54spiralOrder;

import java.util.*;

public class me {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        if (matrix.length == 0 || matrix[0].length == 0) return list;
        int m = matrix.length;
        int n = matrix[0].length;
        int direction[][] = {{0,1},{0,-1},{1,0},{-1,0}};
        int cur[] = new int[2];

        Boolean [][]isvisited = new Boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                isvisited[i][j] = false;
            }
        }
        for (int i = 0; i < n; i++) {
            list.add(matrix[0][i]);
            isvisited[0][i] = true;
            cur[0] = 0;
            cur[1] = i;
        }
        Boolean flag = false;
        while (!flag) {
            for (int i = 0; i < 4; i++) {
                if (cur[0] + direction[i][0] < 0 || cur[0] + direction[i][0] >= m || cur[1] + direction[i][1] < 0 || cur[1] + direction[i][1] >= n) {
                    continue;
                } else {
                        inter:while (!isvisited[cur[0] + direction[i][0]][cur[1] + direction[i][1]]) {
                            list.add(matrix[cur[0] + direction[i][0]][cur[1] + direction[i][1]]);
                            cur[0] = cur[0] + direction[i][0];
                            cur[1] = cur[1] + direction[i][1];
                            isvisited[cur[0]][cur[1]] = true;
                            if (cur[0] + direction[i][0] < 0 || cur[0] + direction[i][0] >= m || cur[1] + direction[i][1] < 0 || cur[1] + direction[i][1] >= n){
                                break inter;
                            }
                        }
                }
            }
            flag = true;
            divide:for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (isvisited[i][j] == false){
                        flag = false;
                        break divide;
                    }
                }
            }
        }

        return list;
    }
}
