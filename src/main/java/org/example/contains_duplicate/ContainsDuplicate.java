package org.example.contains_duplicate;

import java.util.HashSet;
import java.util.List;

public class ContainsDuplicate {
    public static void main(String[] args) {
        System.out.println(containsDuplicate(List.of("asd", "asd", "bca", "123"))); // true
        System.out.println(containsDuplicate(List.of(123, 321, 3222, 332, 321))); // true
        System.out.println(containsDuplicate(List.of(123, 456, 789, 1011, 1213, 1415))); // false
    }

    public static <T> boolean containsDuplicate(List<T> elems) {
        return new HashSet<>(elems).size() != elems.size();
    }
}
