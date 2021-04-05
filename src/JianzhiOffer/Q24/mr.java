package JianzhiOffer.Q24;
import JianzhiOffer.ListNode;
public class mr {

    public ListNode reverseList(ListNode head) {
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

    public ListNode reverseList_me(ListNode head){
        ListNode pre = null;
        ListNode cur = head;
        ListNode temp = null;
        while(cur!=null){
             temp = cur.next;
             cur.next = pre;

             pre = cur;
             cur = temp;
        }
        return pre;
    }
}
