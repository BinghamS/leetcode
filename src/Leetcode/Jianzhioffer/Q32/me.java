package Leetcode.Jianzhioffer.Q32;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class me {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();
        if(root != null) queue.add(root);
        while(!queue.isEmpty()) {
            List<Integer> tmp = new ArrayList<>();
            for(int i = queue.size(); i > 0; i--) {
                TreeNode node = queue.poll();
                tmp.add(node.val);
                if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);
            }
            res.add(tmp);
        }
        return res;
    }

    public List<List<Integer>> levelPrint(TreeNode root){
        Queue<TreeNode> treeNodes = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();
        if (root != null) treeNodes.offer(root);
        while (!treeNodes.isEmpty()){
            List<Integer> tmp = new ArrayList<>();
            for (int i = 0; i < treeNodes.size(); i++) {
                 TreeNode node = treeNodes.poll();
                 tmp.add(node.val);
                 if (node.left != null) treeNodes.offer(node.left);
                 if (node.right != null) treeNodes.offer(node.right);
            }

        }

        return null;
    }

}
