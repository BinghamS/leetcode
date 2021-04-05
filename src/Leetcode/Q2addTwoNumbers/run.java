package Leetcode.Q2addTwoNumbers;
import Leetcode.ListNode;

public class run {
    public static void main(String[] args) {
        int arr1[] = {2,4,3};
        int arr2[] = {5,6,4};
        ListNode listNode1 = ListNode.makeNode(arr1);
        ListNode listNode2 = ListNode.makeNode(arr2);

        me me = new me();
        ListNode res = me.addTwoNumbers(listNode1, listNode2);
        while(res != null){
            System.out.println(res.val);
            res = res.next;

        }

    }
}
