package Leetcode.Jianzhioffer.Q104maxDepth;

import Leetcode.Jianzhioffer.TreeNode;

public class me {
    public static int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
    }
}
