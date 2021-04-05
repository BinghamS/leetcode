package Q98isValidBST;

import Leetcode.Jianzhioffer.TreeNode;

import java.util.*;

/**
 * @ClassName me
 * @Deacription TODO
 * @Author bingham
 * @Date 2021/2/25 21:54
 * @Version 1.0
 **/
public class me {
    public boolean isValidBST(TreeNode root) {
        List<Integer> integers = inorderTraversal(root);
        int arrr[] = new int[integers.size()];
        int i = 0;
        for (int a:
             integers) {
            if (i == 0){
                arrr[i] = a;
                i++;
                continue;
            }
            if (a < arrr[i-1]){
                return false;
            }
            arrr[i] = a;
            i++;
        }
        return true;
    }

    public static List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        getMidOrder(root,res);
        return res;
    }
    public static void getMidOrder(TreeNode node,List res){
        if (node == null){
            return;
        }
        getMidOrder(node.left,res);
        res.add(node.val);
        getMidOrder(node.right,res);
    }
}
