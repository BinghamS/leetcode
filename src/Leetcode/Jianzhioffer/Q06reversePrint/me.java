package Leetcode.Jianzhioffer.Q06reversePrint;

import Leetcode.ListNode;

import java.util.Stack;

public class me {
    public int[] reversePrint(ListNode head) {
        if (head == null) {
            int arr[] = {};
            return arr;
        }

        Stack<Integer> stack = new Stack<>();
        stack.push(head.val);
        while (head.next != null){
            stack.push(head.next.val);
            head = head.next;
        }

        int arr[] = new int[stack.size()];
        int num = stack.size();
        for (int i = 0; i < num; i++) {
            arr[i] = stack.pop();
        }
        return arr;
    }
}
