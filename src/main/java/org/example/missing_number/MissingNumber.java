package org.example.missing_number;

import java.util.Arrays;

public class MissingNumber {
    /**
     * Arithmetic progression rule.
     *
     * nums.length * (nums.length + 1) / 2 - allows us to know sum of arithmetic progression
     * For example, we have array, which contains 3 elements - [3, 0, 1]
     * So length of array with arithmetic progression of size 3 would be 6, because
     * arithmetic progression of 3 numbers will look like 1 + 2 + 3 = 6
     *
     * So with this formula we can compute actual size of arithmetic progression of given array,
     * and then just subtract correct arithmetic progression sum from actual given array.
     * So in case of array [3, 0, 1]:
     * 1) Sum of arithmetic progression would be nums.length * (nums.length + 1) / 2.
     *    So 3 * (3 + 1) / 2 = 6
     * 2) Sum of actual given array is 3 + 0 + 1 = 4;
     * 3) Then we just subtract sum of elements given array from correct arithmetic progression sum.
     *    So we have 6 - 4 = 2
     *
     * @param nums
     * @return
     */
    public static int missingNumber(int[] nums) {
        int sum = Arrays.stream(nums).sum();
        return nums.length * (nums.length + 1) / 2 - sum;
    }
}
