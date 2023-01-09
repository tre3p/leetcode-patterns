package org.example.cyclic_sort;

import java.util.ArrayList;
import java.util.List;

public class CyclicSort {
    public static void main(String[] args) {
        System.out.println(cyclicSort(new int[]{4,3,2,7,8,2,3,1}));
    }

    public static List<Integer> cyclicSort(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correctPos = nums[i] - 1;
            if (nums[i] != nums[correctPos]) {
                int tmp = nums[i];
                nums[i] = nums[correctPos];
                nums[correctPos] = tmp;
            } else {
                i++;
            }
        }

        List<Integer> seen = new ArrayList<>();

        for (int k = 0; k < nums.length; k++) {
            if (nums[k] != k + 1) {
                seen.add(k + 1);
            }
        }

        return seen;
    }
}
