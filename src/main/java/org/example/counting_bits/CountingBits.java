package org.example.counting_bits;

public class CountingBits {
    public static int[] countingBits(int n) {
        int[] result = new int[n + 1];
        /**
         * Count of '1' in number '0' - zero.
         */
        result[0] = 0;

        /**
         * Count of '1' in each next number can be calculated with formulae.
         *
         * For example, to calculate amount of '1' in number '1':
         * 1) Take count of '1' in 1 / 2 (already stored in array)
         * 2) Add this value to i % 2, because if number is even - it will end with '1' in binary representation.
         */
        for (int i = 1; i < n + 1; i++) {
            result[i] = result[i >> 1] + i % 2;
        }

        return result;
    }
}
