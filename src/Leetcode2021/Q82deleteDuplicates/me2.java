package Q82deleteDuplicates;

import Leetcode.ListNode;

import java.util.*;

/**
 * @ClassName me2
 * @Deacription TODO
 * @Author bingham
 * @Date 2021/2/8 9:35
 * @Version 1.0
 **/
public class me2 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode cur = head;

        HashMap<Integer, Integer> map = new HashMap<>();

        while(cur != null){
            if (map.containsKey(cur.val)) {
                int temp_val = map.get(cur.val);
                map.put(cur.val,temp_val+1);
            }else{
                map.put(cur.val,1);
            }
            cur = cur.next;
        }
        ListNode newlst = new ListNode();
        ListNode first = null;
        int index = 0;
        cur = head;
        while (cur != null){
            if (map.get(cur.val)==1){
                //ListNode now = new ListNode(cur.val);
                newlst = cur;
                ListNode newnode = null;

                if (index ==0){
                    first = newlst;
                }
                newlst.next = newnode;
                newlst = newlst.next;

                index++;
            }
            cur = cur.next;
        }

        return first;
    }
}
