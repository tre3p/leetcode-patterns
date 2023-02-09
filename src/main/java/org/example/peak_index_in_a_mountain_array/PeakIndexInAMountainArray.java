package org.example.peak_index_in_a_mountain_array;

public class PeakIndexInAMountainArray {
    public static int peakIndexInAMountainArray(int[] arr) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int middle = low + (high - low) / 2;

            if (arr[middle] < arr[middle + 1]) {
                low = middle + 1;
            } else {
                high = middle - 1;
            }
        }

        return low;
    }
}
