package org.example.max_profit;

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
    public static int maxProfit(int[] nums) {
        int maxProfit = 0;
        int currentMinPrice = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int currentPrice = nums[i];

            /**
             * If price of the day minus historical minimum price is less then maximum profit,
             * then max profit would be this number.
             */
            maxProfit = Math.max(maxProfit, currentPrice - currentMinPrice);
            currentMinPrice = Math.min(currentPrice, currentMinPrice);
        }

        return maxProfit;
    }
}
