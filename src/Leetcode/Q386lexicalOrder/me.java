package Leetcode.Q386lexicalOrder;

import java.util.*;

public class me {
    public List<Integer> lexicalOrder(int n) {
        PriorityQueue<String> heaq = new PriorityQueue<>((o1, o2) -> o1.compareTo(o2));

        for (int i = 1; i <= n; i++)
            heaq.offer(String.valueOf(i));

        List<Integer> ans = new ArrayList<>();
        while (!heaq.isEmpty())
            ans.add(Integer.parseInt(heaq.poll()));
        return ans;
    }
}
