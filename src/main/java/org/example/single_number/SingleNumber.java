package org.example.single_number;

// https://leetcode.com/problems/single-number/
public class SingleNumber {
    /**
     * Solves via XOR operation.
     * XOR example:
     * 0011
     * 0101
     * ____
     * 0110
     *
     * So the number, which single in array will not destroy itself, and the pairs will do.
     * @param nums - input array
     * @return - unique number from array
     */
    public static int singleNumber(int[] nums) {
        int mask = 0;

        for (int i : nums) {
            mask ^= i;
        }

        return mask;
    }
}
