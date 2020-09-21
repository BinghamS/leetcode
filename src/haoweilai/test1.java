package haoweilai;

import Leetcode.Jianzhioffer.TreeNode;

import java.util.*;

public class test1 {
    public String notReCuPreOrder (TreeNode root) {
        LinkedList<TreeNode> stack = new LinkedList<>();
        String res = "";
        if (root == null) {
            return res;
        }

        stack.add(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pollLast();
            res = res+node.val+",";
            if (node.right != null) {
                stack.add(node.right);
            }
            if (node.left != null) {
                stack.add(node.left);
            }
        }
        res = res.substring(0,-1);
        return res;
    }

    public String notReCuPreOrder1 (TreeNode root) {
        String res = "";
        TreeNode node = root;
        while (node != null) {
            if (node.left == null) {
                res = res+node.val+"";
                node = node.right;
            }
            else {
                TreeNode predecessor = node.left;
                while ((predecessor.right != null) && (predecessor.right != node)) {
                    predecessor = predecessor.right;
                }

                if (predecessor.right == null) {
                    res = res+node.val+"";
                    predecessor.right = node;
                    node = node.left;
                }
                else{
                    predecessor.right = null;
                    node = node.right;
                }
            }
        }
        String out = res.substring(0,res.length()-1);
        return out;


    }

    public static void main(String[] args) {

    }
}
