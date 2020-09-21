package Leetcode.Jianzhioffer.Q22getKthFromEnd;


import Leetcode.ListNode;

public class run {
    public static void main(String[] args) {
        me me = new me();
        int arr[] = {1,2,3,4,5};
        ListNode listNode = new ListNode();
        listNode.makeNode(arr);
        ListNode kthFromEnd = me.getKthFromEnd(listNode, 2);
        System.out.println(kthFromEnd.val);
        while (kthFromEnd.next != null){
            System.out.println(kthFromEnd.next.val);
        }
    }
}
