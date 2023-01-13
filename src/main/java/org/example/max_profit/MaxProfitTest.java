package org.example.max_profit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaxProfitTest {
    public static int[] maxProfit1 = {7,1,5,3,6,4};
    public static int[] maxProfit2 = {7,6,4,3,1};

    @Test
    void testMaxProfit1() {
        Assertions.assertEquals(MaxProfit.maxProfit(maxProfit1), 5);
    }

    @Test
    void testMaxProfit2() {
        Assertions.assertEquals(MaxProfit.maxProfit(maxProfit2), 0);
    }
}
