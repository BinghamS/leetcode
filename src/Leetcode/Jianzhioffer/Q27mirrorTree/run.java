package Leetcode.Jianzhioffer.Q27mirrorTree;

import Leetcode.Jianzhioffer.TreeNode;

public class run {
    public static void main(String[] args) {
        me me = new me();
        TreeNode root = new TreeNode(4);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(7);
        TreeNode node3 = new TreeNode(1);
        TreeNode node4 = new TreeNode(3);
        TreeNode node5 = new TreeNode(6);
        TreeNode node6 = new TreeNode(9);
        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;
        node2.left = node5;
        node2.right = node6;

        TreeNode treeNode = me.mirrorTree(root);

    }
}
