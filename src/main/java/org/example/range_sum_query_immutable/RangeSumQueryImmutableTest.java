package org.example.range_sum_query_immutable;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RangeSumQueryImmutableTest {
    private final RangeSumQueryImmutable.NumArray numArr =
            new RangeSumQueryImmutable.NumArray(new int[]{-2,0,3,-5,2,-1});

    @Test
    void testRangeSumQueryImmutable1() {
        assertEquals(1, numArr.sumRange(0, 2));
    }

    @Test
    void testRangeSumQueryImmutable2() {
        assertEquals(-1, numArr.sumRange(2, 5));
    }

    @Test
    void testRangeSumQueryImmutable3() {
        assertEquals(-3, numArr.sumRange(0 ,5));
    }
}
