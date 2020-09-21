package test;

import java.util.ArrayList;

public class reverseList {
    public static ListNode reverseList(ListNode head) {
        //申请节点，pre和 cur，pre指向null
        ListNode pre = null;
        ListNode cur = head;
        ListNode tmp = null;
        while(cur!=null) {
            //记录当前节点的下一个节点
            tmp = cur.next;
            //然后将当前节点指向pre
            cur.next = pre;
            //pre和cur节点都前进一位
            pre = cur;
            cur = tmp;
        }
        return pre;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        ListNode listNode1 = ListNode.makeNode(arr);
        ListNode listNode = reverseList(listNode1);
        ArrayList<Integer> traverse = ListNode.traverse(listNode);
        for (int i = 0; i < traverse.size(); i++) {
            System.out.println(traverse.get(i));
        }

    }
}
