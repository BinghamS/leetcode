package Q86partition;

import Leetcode.ListNode;

/**
 * @ClassName me
 * @Deacription TODO
 * @Author bingham
 * @Date 2021/2/25 20:03
 * @Version 1.0
 **/
public class me {
    public ListNode partition(ListNode head, int x) {
        int target = 0;
        int index = 1;
        ListNode dummy = head;
        while (index < x){
            dummy = dummy.next;
            index++;
        }
        target = dummy.val;

        dummy = head;
        ListNode left = new ListNode(0);
        ListNode right = new ListNode(0);
        Boolean flag_left = true;
        Boolean flag_right = true;
        ListNode left_first = new ListNode(0);
        ListNode right_first = new ListNode(0);
        while(dummy != null){
            if (dummy.val < target){
                if(flag_left){
                    left.next = dummy;
                    left_first = left.next;
                    flag_left = false;
                    left = left.next;
                }else{
                    left.next = dummy;
                    left = left.next;
                }
            }else{
                if(flag_right){
                    right.next = dummy;
                    right_first = right.next;
                    flag_right = false;
                    right = right.next;
                }else{
                    right.next = dummy;
                    right = right.next;
                }
            }
            dummy = dummy.next;
        }
        left.next = right_first;

        return left_first;
    }
}
