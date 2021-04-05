package Q94inorderTraversal;
import Leetcode.Jianzhioffer.TreeNode;

import java.util.List;

/**
 * @ClassName run
 * @Deacription TODO
 * @Author bingham
 * @Date 2021/2/25 21:42
 * @Version 1.0
 **/
public class run {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(3);
        root.right = node1;
        node1.left = node2;
        me me = new me();
        List<Integer> integers = me.inorderTraversal(root);
        for (int a:
                integers) {
            System.out.println(a);
        }
    }
}
