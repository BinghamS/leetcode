package Leetcode.Jianzhioffer.Q55maxDepth;

import test.TreeNode;

public class me {
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}
