package OddUpEvenDown;

import test.ListNode;

/**
 * @ClassName run
 * @Deacription TODO
 * @Author bingham
 * @Date 2021/3/27 14:54
 * @Version 1.0
 **/
public class run {
    public static void main(String[] args) {
        int arr[] = {1,8,3,6,5,4,7,2};
        ListNode head = ListNode.makeNode(arr);
        me me = new me();
        ListNode res = me.OddUpEvenDown(head);
        while (res!=null){
            System.out.println(res.val);
            res = res.next;
        }
    }
}
