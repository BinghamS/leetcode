package meituan;

import java.util.Arrays;

public class QuickSort {
    public static int partion(int[] arr, int start, int end) {
        int tmp = arr[start];
        while (start < end) {
            while (arr[end] >= tmp && start < end) {
                --end;
            }
            if (start >= end) {
                break;
            }else {
                arr[start] = arr[end];
            }
            while (start < end && arr[start] <= tmp) {
                ++start;
            }
            if (start >= end) {
                break;
            }else {
                arr[end] = arr[start];
            }
        }
        arr[start] = tmp;
        return start;
    }

    public static void quickSort(int[] arr) {
        int[] stack = new int[arr.length];
        int top = 0;
        int low = 0;
        int high = arr.length - 1;
        int par = partion(arr, low, high);
        // 若基准左边至少存在两个数据，新的索引入栈
        if(par > low + 1) {
            stack[top++] = low;
            stack[top++] = par - 1;
        }
        // 若基准右边至少存在两个数据，新的索引入栈
        if (par < high - 1) {
            stack[top++] = par + 1;
            stack[top++] = high;
        }
        /** 每次出栈两个元素，栈里还有元素，找完一次基准再次入栈，这样就实现了重复找基准  */
        while (top > 0) {
            // 两个新索引依次出栈
            high = stack[--top];
            low = stack[--top];
            par = partion(arr, low, high);
            // 再次入栈
            if (par > low + 1) {
                stack[top++] = low;
                stack[top++] = par - 1;
            }

            if (par < high - 1) {
                stack[top++] = par + 1;
                stack[top++] = high;
            }
        }
    }

        public static void main(String[] args) {
            int[] arr = {20, 23, 12 , 14, 45, 2, 89, 100, 65, 77, 96};
            quickSort(arr);
            System.out.println(Arrays.toString(arr));
        }
}
