package org.example.peak_index_in_a_mountain_array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PeakIndexInAMountainArrayTest {

    @Test
    void shouldCorrectlySolve1() {
        Assertions.assertEquals(1, PeakIndexInAMountainArray.peakIndexInAMountainArray2(new int[]{0, 1, 0}));
    }

    @Test
    void shouldCorrectlySolve2() {
        Assertions.assertEquals(1, PeakIndexInAMountainArray.peakIndexInAMountainArray2(new int[]{0, 2, 1, 0}));
    }

    @Test
    void shouldCorrectlySolve3() {
        Assertions.assertEquals(1, PeakIndexInAMountainArray.peakIndexInAMountainArray2(new int[]{0, 10, 5, 2}));
    }
}
