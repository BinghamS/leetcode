package Leetcode.Q19removeNthFromEnd;

import Leetcode.ListNode;

/**
 * @ClassName me
 * @Deacription TODO
 * @Author bingham
 * @Date 2021/1/3 18:30
 * @Version 1.0
 **/
public class me {

    public ListNode removeNthFromEnd(ListNode head, int n) {

        int num = 0;
        while (head!=null){
            head = head.next;
            num++;
        }

        for (int i = 0; i < n; i++) {
            
        }
        return null;
    }
}
