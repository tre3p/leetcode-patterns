package org.example.range_sum_query_immutable;

// https://leetcode.com/problems/range-sum-query-immutable/
public class RangeSumQueryImmutable {
    static class NumArray {
        private final int[] nums;
        private final int[] sums;

        public NumArray(int[] nums) {
            this.nums = nums;
            this.sums = calcSums(nums);
        }

        public int sumRange(int left, int right) {
            /**
             * If we left border = 0, then we can just return right index border
             */
            if (left == 0) {
                return sums[right];
            }

            /**
             * If left border not equals to 0 - then we need to take right border and subtract
             * left border - 1 from right border
             *
             * If sums array equals to [-2, -2, 1, -4, -2, -3], and we want to get sums of elements
             * from second to fifth element, then:
             *
             * -3 - (-2) = -1
             *
             * We need to subtract left border - 1, because all borders are included.
             */
            return sums[right] - sums[left - 1];
        }

        /**
         * Calculates sum for each element of array and pushes it to result array.
         * For example:
         * input = [-2,0,3,-5,2,-1]
         * result = [-2,-2,1,-4,-2,-3] =>
         * 0 + (-2) = -2
         * -2 + 0 = -2
         * -2 + 3 = 1
         * 1 + (-5) = -4
         * -4 + 2 = -2
         * -2 + (-1) = -3
         */
        private int[] calcSums(int[] input) {
            int[] result = new int[input.length];
            int sum = 0;

            for (int i = 0; i < nums.length; i++) {
                sum += input[i];
                result[i] = sum;
            }

            return result;
        }
    }
}
