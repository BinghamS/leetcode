package test;

import java.util.ArrayList;

public class deleteNode {
    public void deleteNode(ListNode node) {

    }

    public static void main(String[] args) {
        int[] arr = {4,5,1,9};
        ListNode listNode = ListNode.makeNode(arr);
        ArrayList<Integer> traverse = ListNode.traverse(listNode);
        for (int i = 0; i < traverse.size(); i++) {
            System.out.println(traverse.get(i));
        }
    }
}
