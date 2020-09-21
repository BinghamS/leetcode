package Leetcode.Q25mergeTwoLists;

import java.util.ArrayList;

public class mergeTwoLists {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dum = new ListNode(0), cur = dum;
        while(l1 != null && l2 != null) {
            if(l1.val < l2.val) {
                cur.next = l1;
                l1 = l1.next;
            }
            else {
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }
        cur.next = l1 != null ? l1 : l2;
        return dum.next;
    }

    public static void main(String[] args) {
        int[] a = {1,2,4};
        int[] b = {1,3,4};
        ListNode l1 = ListNode.makeNode(a);
        ListNode l2 = ListNode.makeNode(b);
        ListNode listNode = mergeTwoLists(l1, l2);
        ArrayList<Integer> traverse = ListNode.traverse(listNode);
        for (int i = 0; i < traverse.size(); i++) {
            System.out.print(traverse.get(i)+" ");
        }
    }
}
