package org.example.maximum_subarray;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaximumSubarrayTest {

    @Test
    void testMaximumSubarray1() {
        Assertions.assertEquals(12, MaximumSubarray.maximumSubarray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }

    @Test
    void testMaximumSubarray2() {
        Assertions.assertEquals(1, MaximumSubarray.maximumSubarray(new int[]{1}));
    }

    @Test
    void testMaximumSubarray3() {
        Assertions.assertEquals(24, MaximumSubarray.maximumSubarray(new int[]{5,4,-1,7,8}));
    }
}
