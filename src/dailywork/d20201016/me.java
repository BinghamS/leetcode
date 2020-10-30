package dailywork.d20201016;

import java.util.ArrayList;
import java.util.Arrays;

public class me {
    public int[] sortedSquares(int[] A) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int [] arr = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            arr[i] = A[i] * A[i];
        }
        Arrays.sort(arr);
        return arr;
    }
}
