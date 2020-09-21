package test;

import java.util.Stack;

public class getRightNode {
    public static TreeNode getRight(TreeNode root){
        Stack<TreeNode> treeNodes = new Stack<TreeNode>();
        while (root.right!=null){
            treeNodes.push(root.right);
            root = root.right;
        }
        return root;
    }

    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;

        TreeNode res = getRight(treeNode1);
        System.out.println(res.val);
    }
}
