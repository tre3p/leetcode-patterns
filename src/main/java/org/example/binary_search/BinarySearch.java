package org.example.binary_search;

public class BinarySearch {
    public static int binarySearch(int[] input, int target) {
        int low = 0;
        int high = input.length - 1;

        while (low <= high) {
            int middle = low + (high - low) / 2;
            int value = input[middle];

            if (value < target) {
                low = middle + 1;
            } else if (value > target) {
                high = middle - 1;
            } else {
                return value;
            }
        }

        return -1;
    }
}
