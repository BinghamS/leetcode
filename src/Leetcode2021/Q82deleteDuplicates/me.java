package Q82deleteDuplicates;

import Leetcode.ListNode;

import java.util.*;

/**
 * @ClassName me
 * @Deacription I made a mistake that the question want me to remove all the duplicates,but this function is for remain only one of the
 * duplicates node. I write a new function in class me2
 * @Author bingham
 * @Date 2021/2/8 9:19
 * @Version 1.0
 **/
public class me {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode cur = head;
        ListNode next = head.next;
        while(next != null){
            if (cur.val == next.val){
                cur.next = next.next;
                next = next.next;
            }
            cur = cur.next;
            next = next.next;
        }
        return head;
    }
}
