package Leetcode.Jianzhioffer.Q11minArray;

import java.util.Arrays;

public class me {
    public int minArray(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[0];
    }
}
