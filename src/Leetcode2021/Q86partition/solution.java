package Q86partition;

import Leetcode.ListNode;

/**
 * @ClassName solution
 * @Deacription TODO
 * @Author bingham
 * @Date 2021/2/25 20:49
 * @Version 1.0
 **/
public class solution {
    public ListNode partition(ListNode head, int x) {
        ListNode small = new ListNode(0);
        ListNode smallHead = small;
        ListNode large = new ListNode(0);
        ListNode largeHead = large;
        while (head != null) {
            if (head.val < x) {
                small.next = head;
                small = small.next;
            } else {
                large.next = head;
                large = large.next;
            }
            head = head.next;
        }
        large.next = null;
        small.next = largeHead.next;
        return smallHead.next;
    }



}
