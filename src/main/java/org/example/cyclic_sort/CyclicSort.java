package org.example.cyclic_sort;

import java.util.ArrayList;
import java.util.List;

public class CyclicSort {
    public static List<Integer> cyclicSort(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            /**
             * Correct position for nums[i] element.
             * In case of '4' element - it would be '3', because correct index of '4' in sorted array,
             * which start from '1' - third index.
             */
            int correctPos = nums[i] - 1;
            /**
             * If element at correct position of current element not equals to current element - we need
             * to swap its places in array.
             */
            if (nums[i] != nums[correctPos]) {
                int tmp = nums[i];
                nums[i] = nums[correctPos];
                nums[correctPos] = tmp;
            } else {
                i++;
            }
        }

        List<Integer> seen = new ArrayList<>();

        /**
         * When array "sorted" - we need to check if each element in array is equals to
         * k + 1. Because if first element of array is '1' and we don't have '1' at index 0 - that's not okay.
         */
        for (int k = 0; k < nums.length; k++) {
            if (nums[k] != k + 1) {
                seen.add(k + 1);
            }
        }

        return seen;
    }
}
