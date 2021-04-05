package Q199rightSideView;

import test.TreeNode;

import java.util.*;

/**
 * @ClassName me
 * @Deacription TODO
 * @Author bingham
 * @Date 2021/3/26 14:10
 * @Version 1.0
 **/
public class me {
    public List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        if (root == null){
            return res;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(queue.size() > 0){
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode poll = queue.poll();
                if(poll.left != null){
                    queue.offer(poll.left);
                }if(poll.right != null){
                    queue.offer(poll.right);
                }
                if(i == size-1){
                    res.add(poll.val);
                }
            }
        }
        return res;
    }
}
