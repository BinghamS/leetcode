package Q695reverseBetween;

import Leetcode.ListNode;

/**
 * @ClassName me
 * @Deacription TODO
 * @Author bingham
 * @Date 2021/2/24 9:56
 * @Version 1.0
 **/
public class me {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;
        ListNode superior = dummyHead;

        // 1. 遍历至m的前一个节点
        for ( int i = 1; i < m; i ++ ) {
            superior = superior.next;
        }

        ListNode prev = null;
        ListNode cur = superior.next;

        // 2. 180°旋转爆炸
        for ( int i = 0; i <= n-m; i ++ ) {
            ListNode next = cur.next;

            cur.next = prev;
            prev = cur;
            cur = next;
        }

        // 3. 修改m和n-m位置处的节点的指向
        superior.next.next = cur;
        superior.next = prev;
        return dummyHead.next;
    }
}
