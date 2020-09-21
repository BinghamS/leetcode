package Leetcode.Jianzhioffer.Q18deleteNode;

import Leetcode.ListNode;

public class run {
    public static void main(String[] args) {
        int[] arr = {4,5,1,9};
        int val = 5;
        ListNode listNode = ListNode.makeNode(arr);
        me me = new me();
        ListNode listNode1 = me.deleteNode(listNode, val);
        while (listNode1 != null){
            System.out.println(listNode1.val);
            listNode1 = listNode1.next;
        }
    }
}
