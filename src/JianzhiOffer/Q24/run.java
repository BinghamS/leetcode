package JianzhiOffer.Q24;

import JianzhiOffer.ListNode;

import java.util.ArrayList;

public class run {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        ListNode listNode = ListNode.makeNode(arr);
        mr mr = new mr();
        ListNode listNode1 = mr.reverseList(listNode);
        ArrayList<Integer> traverse = ListNode.traverse(listNode1);
        for (int a:
             traverse) {
            System.out.println(a);
        }
    }
}
