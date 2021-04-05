package Q98isValidBST;
import Leetcode.Jianzhioffer.TreeNode;

/**
 * @ClassName run
 * @Deacription TODO
 * @Author bingham
 * @Date 2021/2/25 21:54
 * @Version 1.0
 **/
public class run {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(3);
        root.left = node1;
        root.right = node2;
        me me = new me();
        boolean validBST = me.isValidBST(root);
        System.out.println(validBST);
    }
}
