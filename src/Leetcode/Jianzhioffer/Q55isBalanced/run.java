package Leetcode.Jianzhioffer.Q55isBalanced;

import Leetcode.Jianzhioffer.TreeNode;

public class run {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        TreeNode treeNode1 = new TreeNode(9);
        TreeNode treeNode2 = new TreeNode(20);
        TreeNode treeNode3 = new TreeNode(15);
        TreeNode treeNode4 = new TreeNode(7);

        root.left = treeNode1;
        root.right = treeNode2;
        treeNode2.left = treeNode3;
        treeNode2.left = treeNode4;

        me me = new me();
        boolean balanced = me.isBalanced(root);
        System.out.println(balanced);

    }
}
