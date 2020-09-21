package Leetcode.Q122maxProfit;

public class me {
    public int maxProfit(int[] prices) {
        int sum = 0;
        int sum1 = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i; j < prices.length; j++) {
                sum1 = prices[j]-prices[i];
                for (int k = j; k < prices.length; k++) {
                    for (int l = k; l < prices.length; l++) {
                        sum = Math.max(sum,sum1 + prices[l]-prices[k]);
                    }
                }
            }
        }
        return sum;
    }
}
