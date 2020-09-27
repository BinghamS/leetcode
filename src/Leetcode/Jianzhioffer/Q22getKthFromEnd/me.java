package Leetcode.Jianzhioffer.Q22getKthFromEnd;

import Leetcode.ListNode;

public class me {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode former = head, latter = head;
        for(int i = 0; i < k; i++)
            former = former.next;
        while(former != null) {
            former = former.next;
            latter = latter.next;
        }
        return latter;
    }

    public ListNode getKthFromEnd1(ListNode head, int k) {
        int n =0;
        ListNode temp = head;
        while (head.next!=null){
            head = head.next;
            n++;
        }
        for (int i = 0; i < n - k; i++) {
            temp = temp.next;
        }
        return temp;
    }

}
