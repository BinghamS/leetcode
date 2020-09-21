package hw;

import java.util.Scanner;

public class test993 {

    public int getMax(TreeNode root,int res){
        if (root.left != null){
            getMax(root.left,res+root.left.weight);
        }else if (root.right != null){
            getMax(root.right,res+root.right.weight);
        }else {
            return res;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] arr = new int[N][4];
        for (int i = 0; i < N; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
            arr[i][2] = sc.nextInt();
            arr[i][3] = sc.nextInt();
        }
        for (int i = N-1; i >= 0; i--) {
            TreeNode treeNode = new TreeNode(arr[i][0], arr[i][1]);
        }


    }
}
