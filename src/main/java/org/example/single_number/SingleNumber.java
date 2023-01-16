package org.example.single_number;

// https://leetcode.com/problems/single-number/
public class SingleNumber {
    /**
     * Solves via XOR operation.
     * XOR example:
     * 0101
     * 0101
     * ____
     * 0000
     *
     * So the number, which single in array will not destroy itself, and the pairs will do.
     * @param nums
     * @return
     */
    public static int singleNumber(int[] nums) {
        int mask = 0;

        for (int i : nums) {
            mask ^= i;
        }

        return mask;
    }
}
