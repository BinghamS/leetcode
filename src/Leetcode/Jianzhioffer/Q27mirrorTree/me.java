package Leetcode.Jianzhioffer.Q27mirrorTree;

import Leetcode.Jianzhioffer.TreeNode;

public class me {
    public TreeNode mirrorTree(TreeNode root) {
        if (root == null) return null;
        TreeNode temp = root.left;
        root.left = mirrorTree(root.right);
        root.right = mirrorTree(temp);
        return root;
    }
}
