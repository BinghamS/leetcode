package OddUpEvenDown;

import test.ListNode;

/**
 * @ClassName me
 * @Deacription TODO
 * @Author bingham
 * @Date 2021/3/27 14:53
 * @Version 1.0
 **/
public class me {
    public ListNode OddUpEvenDown(ListNode head){
        ListNode listOdd = new ListNode(0);
        ListNode listEven = new ListNode(0);

        ListNode head1 = listOdd;
        ListNode head2 = listEven;

        int index = 1;
        while(head != null){
            if(index % 2 == 1){
                // 奇数
                listOdd.next = head;
                listOdd = listOdd.next;
            }else{//偶数
                listEven.next = head;
                listEven = listEven.next;
            }
            head = head.next;
            index++;
        }
        listOdd.next = null;
        listEven.next = null;

        ListNode head2_reverse = reverseList(head2.next);
        ListNode res = merge(head1.next,head2_reverse);
        return res;

    }

    public static ListNode reverseList(ListNode head){
        ListNode pre = null;
        ListNode next = null;
        while(head != null){
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }

    public static ListNode merge(ListNode l1, ListNode l2) {
        ListNode dum = new ListNode(0), cur = dum;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                cur.next = l1;
                l1 = l1.next;
            } else {
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }
        cur.next = l1 != null ? l1 : l2;
        return dum.next;
    }

}
