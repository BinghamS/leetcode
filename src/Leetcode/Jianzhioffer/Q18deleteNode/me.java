package Leetcode.Jianzhioffer.Q18deleteNode;

import Leetcode.ListNode;

public class me {
    public ListNode deleteNode(ListNode head, int val) {

        ListNode first = head;
        if (head.val == val){
            first = head.next;
            return first;
        }
        ListNode pre = head;
        head = head.next;

        while (head != null){
            if (head.val == val){
                pre.next = head.next;
                head = head.next;
                break;
            }else {
                pre = head;
                head = head.next;
            }
        }

        return first;
    }
}
