package Q92reverseBetween;

import Leetcode.ListNode;

/**
 * @ClassName run
 * @Deacription TODO
 * @Author bingham
 * @Date 2021/2/25 21:13
 * @Version 1.0
 **/
public class run {
    public static void main(String[] args) {
        int m = 2, n = 4;
        int arr[] = {1,2,3,4,5};
        ListNode head = ListNode.makeNode(arr);
        me me = new me();
        ListNode listNode = me.reverseBetween(head, m, n);
        while(listNode!=null){
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
}
