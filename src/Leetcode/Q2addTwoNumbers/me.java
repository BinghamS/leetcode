package Leetcode.Q2addTwoNumbers;

import Leetcode.ListNode;

import java.util.*;

public class me {
    /*
     * @Author bingham
     * @Description
     *
     * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
     * 输出：7 -> 0 -> 8
     * 原因：342 + 465 = 807
     *
     * @Date 13:25 2020/12/23
     * @Param [l1, l2]
     * @return Leetcode.ListNode
     **/
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int a = reverse(l1);
        int b = reverse(l2);

        int res = a + b;

        ListNode res_node = reverse2(res);

        return res_node;
    }

    public static int reverse(ListNode l){
        int res = 0;
        Stack<Integer> stack1 = new Stack<Integer>();
        while(l!=null){
            stack1.push(l.val);
            l = l.next;
        }
        int i = 0;
        int ii = 0;
        while (!stack1.isEmpty()){
            res = (int) (stack1.pop() * Math.pow(10,i)) + ii;
            ii = res;
            i++;
        }
        return res;
    }

    public static ListNode reverse2(int a){
        ListNode res = null;
        ListNode cur = res;

        ArrayList<Integer> arrayList = new ArrayList<>();

        while(a > 0){
            int i = a % 10;
            a= a / 10;
            arrayList.add(i);
        }

        boolean flag = false;
        for (int ans :
                arrayList) {
            ListNode listNode = new ListNode();
            listNode.val = ans;
            cur.next = listNode;
            cur = cur.next;

            if(flag == false){
                res = cur;
                flag = true;
            }
        }
        return res;
    }


}
