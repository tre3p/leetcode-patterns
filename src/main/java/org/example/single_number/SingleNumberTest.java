package org.example.single_number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SingleNumberTest {

    @Test
    void testSingleNumber1() {
        assertEquals(1, SingleNumber.singleNumber(new int[]{2, 2, 1}));
    }

    @Test
    void testSingleNumber2() {
        assertEquals(4, SingleNumber.singleNumber(new int[]{4, 1, 2, 1, 2}));
    }

    @Test
    void testSingleNumber3() {
        assertEquals(1, SingleNumber.singleNumber(new int[]{1}));
    }
}
