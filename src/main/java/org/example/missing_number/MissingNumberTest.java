package org.example.missing_number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MissingNumberTest {

    @Test
    void testMissingNumber1() {
        assertEquals(MissingNumber.missingNumber(new int[]{3, 0, 1}), 2);
    }

    @Test
    void testMissingNumber2() {
        assertEquals(MissingNumber.missingNumber(new int[]{0, 1}), 2);
    }

    @Test
    void missingNumber3() {
        assertEquals(MissingNumber.missingNumber(new int[]{9,6,4,2,3,5,7,0,1}), 8);
    }
}
