package org.example.contains_duplicate;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// https://leetcode.com/problems/contains-duplicate/
public class ContainsDuplicate {
    public static <T> boolean containsDuplicate(List<T> elems) {
        return new HashSet<>(elems).size() != elems.size();
    }

    public static <E> boolean containsDuplicate(E[] elems) {
        return new HashSet<>(Arrays.asList(elems)).size() != Arrays.asList(elems).size();
    }

    // Actual leetcode solution
    public static boolean containsDuplicateActual(int[] nums) {
        Set<Integer> seen = new HashSet<>();

        for (int i : nums) {
            if (seen.contains(i)) {
                return true;
            }
            seen.add(i);
        }

        return false;
    }
}
