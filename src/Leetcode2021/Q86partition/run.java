package Q86partition;

import Leetcode.ListNode;

/**
 * @ClassName run
 * @Deacription TODO
 * @Author bingham
 * @Date 2021/2/25 20:03
 * @Version 1.0
 **/
public class run {
    public static void main(String[] args) {
        int arr[] = {1,4,3,2,5,2};
        ListNode listNode = ListNode.makeNode(arr);
        solution me = new solution();
        int x = 3;
        ListNode partition = me.partition(listNode, x);
        while(partition != null){
            System.out.println(partition.val);
            partition = partition.next;
        }
    }
}
