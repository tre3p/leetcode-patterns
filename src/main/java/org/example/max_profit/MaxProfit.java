package org.example.max_profit;

// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
public class MaxProfit {

    /**
     * Counts max profit for price of the day.
     *
     * For example for input array [7,1,5,3,6,4], the best profit would be 5.
     * Explanation:
     * If we buy something at second day with price 1[prices[1]], and then sell with price 6[prices[4]] -
     * we would get max profit from this deal.
     * And then our profit would be 6 - 1 = 5
     */
    static int maxProfit(int[] nums) {
        int historicalMinimalPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < nums.length; i++) {
            int currentPrice = nums[i];

            if (currentPrice < historicalMinimalPrice) {
                historicalMinimalPrice = currentPrice;
            }

            int todaySellProfit = currentPrice - historicalMinimalPrice;

            if (todaySellProfit > maxProfit) {
                maxProfit = todaySellProfit;
            }
        }

        return maxProfit;
    }
}
