package Leetcode.Jianzhioffer.Q06reversePrint;

import Leetcode.ListNode;

public class run {
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(3);
        ListNode listNode3 = new ListNode(2);
        listNode1.next = listNode2;
        listNode2.next = listNode3;

        me me = new me();
        int[] ints = me.reversePrint(listNode1);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }
}
