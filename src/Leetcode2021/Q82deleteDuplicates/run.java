package Q82deleteDuplicates;

import Leetcode.ListNode;

/**
 * @ClassName run
 * @Deacription TODO
 * @Author bingham
 * @Date 2021/2/8 9:19
 * @Version 1.0
 **/
public class run {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 3, 4, 4, 5};
        ListNode listNode1 = ListNode.makeNode(arr);
        me2 me2 = new me2();
        ListNode listNode = me2.deleteDuplicates(listNode1);
        while(listNode != null){
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
}
