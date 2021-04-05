package Q92reverseBetween;

import Leetcode.ListNode;

/**
 * @ClassName me
 * @Deacription TODO
 * @Author bingham
 * @Date 2021/2/25 21:13
 * @Version 1.0
 **/
public class me {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode pre = new ListNode(0);

        ListNode cur = head;
        pre.next = cur;
        ListNode dummy = pre;

        int index = 1;
        while(index < left){
            cur = cur.next ;
            pre = pre.next;
            index++;
        }
        while(index <= right){
            ListNode temp = cur.next;
            cur.next = pre;

            pre = cur;
            cur = temp;
            index++;
        }
        while (cur != null){
            cur = cur.next ;
            pre = pre.next;
        }
        return dummy.next;
    }
}
