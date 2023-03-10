package org.example.maximum_subarray;

// https://leetcode.com/problems/maximum-subarray/
public class MaximumSubarray {
    static int maximumSubarray(int[] nums) {
        int currentSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];

            /**
             * currentSum - variable for storing sums of digits.
             *
             * If we take current number and add it to current sum, and this would be
             * worse than current num - we should start to count from this num, and do not count
             * digits on the left side.
             *
             * For example:
             * currentSum = -5
             * num = 10
             *
             * -5 + 10 = -5
             * So would be better, if we will start counting from 10, and adding digits to this num.
             */
            currentSum = Math.max(currentSum + num, num);

            /**
             * Rewriting maxSum depends on max sum.
             */
            maxSum = Math.max(currentSum, maxSum);
        }

        return maxSum;
    }
}
