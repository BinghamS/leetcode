package test;

import java.util.ArrayList;

public class printListFromTailToHead {
    public static int[] printListFromTailToHead(ListNode a){
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (a.next != null){
            arrayList.add(a.val);
            a = a.next;
        }
        arrayList.add(a.val);
        int n = arrayList.size();
        int[] res = new int[n];
        for (int i = 0; i < arrayList.size(); i++) {
            res[i] = arrayList.get(i);
        }
        return res;
    }

    public static void main(String[] args) {
        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(2);
        ListNode a3 = new ListNode(3);
        a1.next = a2;
        a2.next = a3;


        int res[] = printListFromTailToHead(a1);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }

    }
}
