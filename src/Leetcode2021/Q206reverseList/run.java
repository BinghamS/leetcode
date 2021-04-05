package Q206reverseList;

import Leetcode.ListNode;

/**
 * @ClassName run
 * @Deacription TODO
 * @Author bingham
 * @Date 2021/2/22 13:08
 * @Version 1.0
 **/
public class run {
    public static void main(String[] args) {
//        ListNode listNode = new ListNode();
        int arr[] = {1,2,3,4,5,6,7,8,9};
        ListNode listNode = ListNode.makeNode(arr);
        me me = new me();
        ListNode listNode1 = me.reverseList(listNode);
        while(listNode1 != null){
            System.out.println(listNode1.val);
            listNode1 = listNode1.next;
        }
    }
}
