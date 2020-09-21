package test;

import java.util.PriorityQueue;
import java.util.Stack;

public class test0907 {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(3);
        int[] arr = {5,2,4,8,2,47,6,23,4,8,5,1,7,89,5};

        for (int i :
                arr) {
            priorityQueue.offer(i);
        }

        for (int i = 0; i < priorityQueue.size(); i++) {
            System.out.println(priorityQueue.poll());
        }

    }
}
