package Q94inorderTraversal;

import Leetcode.Jianzhioffer.TreeNode;

import java.util.*;

/**
 * @ClassName me
 * @Deacription TODO
 * @Author bingham
 * @Date 2021/2/25 21:42
 * @Version 1.0
 **/
public class me {
    public List<Integer> inorderTraversal(TreeNode root) {
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
