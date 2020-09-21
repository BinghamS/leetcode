package test;

import java.util.PriorityQueue;

public class topk {
    public static int[] topK(int[]data,int k){
        HeapSort heapSort = new HeapSort();
        int[] topk = new int[k];//根据传进来的K创建长度为k的数组

        for (int i = 0; i < k; i++) {
            topk[i] = data[i];//先将源数据的前k个的数赋值给topK数组
        }

        heapSort.buildHeap(topk,k);//对这个topK数组进行一次最小堆的构建。

        for (int i = k; i < data.length; i++) {//从源数据的第K个数开始循环，如果循环的数比堆顶元素还小，直接pass，
            // 如果比堆顶元素要大，就将此数放在堆顶，同时进行一次以它为起始点的树的调整。
            int temp = data[i];
            if (topk[0]<temp){
                topk[0] = temp;
                heapSort.adjustTree(topk,k,0);
            }
        }
        return topk;
    }


    public static void main(String[] args) {
        int[] data = new int[]{1,3,4,2,8,9,5,6,7,32,56,23,87,32};//原始数据

        int[] topk = topK(data,5);//调用topK方法，返回前k大的数组，返回的数组并不是有序的，而是一个小顶堆，如果想返回一个有序的，可以调用上面HeapSort类中的heapSort方法

        for (int i = 0; i < topk.length; i++) {//循环输出小顶堆
            System.out.println(topk[i]);
        }
    }
}
