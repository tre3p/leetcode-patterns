package org.example.contains_duplicate;

import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ContainsDuplicateTest {
    public static final List<String> containsDuplicateStringList = List.of("abc", "asd", "rfg", "fasdfqwe", "vas", "abc");
    public static final List<Integer> containsDuplicateIntegerList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1);
    public static final List<String> doNotContainsDuplicateStringList = List.of("abc", "asd", "rfg", "fasfas", "vas");
    public static final List<Integer> doNotContainsDuplicateIntegerList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    public static final int[] containsDuplicateIntArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1};
    public static final int[] doNotContainsDuplicateIntArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    @Test
    void shouldReturnTrueOnContainsDuplicateStringList() {
        assertTrue(ContainsDuplicate.containsDuplicate(containsDuplicateStringList));
    }

    @Test
    void shouldReturnTrueOnContainsDuplicateIntegerList() {
        assertTrue(ContainsDuplicate.containsDuplicate(containsDuplicateIntegerList));
    }

    @Test
    void shouldReturnFalseOnNotContainsDuplicateStringList() {
        assertFalse(ContainsDuplicate.containsDuplicate(doNotContainsDuplicateStringList));
    }

    @Test
    void shouldReturnFalseOnNotContainsDuplicateIntegerList() {
        assertFalse(ContainsDuplicate.containsDuplicate(doNotContainsDuplicateIntegerList));
    }

    @Test
    void shouldReturnTrueOnContainsDuplicateStringArray() {
        assertTrue(ContainsDuplicate.containsDuplicate(containsDuplicateStringList.toArray()));
    }

    @Test
    void shouldReturnTrueOnContainsDuplicateIntegerArray() {
        assertTrue(ContainsDuplicate.containsDuplicate(containsDuplicateIntegerList.toArray()));
    }

    @Test
    void shouldReturnFalseOnNotContainsDuplicateStringArray() {
        assertFalse(ContainsDuplicate.containsDuplicate(doNotContainsDuplicateStringList.toArray()));
    }

    @Test
    void shouldReturnFalseOnNotContainsDuplicateIntegerArray() {
        assertFalse(ContainsDuplicate.containsDuplicate(doNotContainsDuplicateIntegerList.toArray()));
    }

    @Test
    void shouldReturnTrueOnContainsDuplicateIntArray() {
        assertTrue(ContainsDuplicate.containsDuplicateActual(containsDuplicateIntArray));
    }

    @Test
    void shouldReturnFalseOnNotContainsDuplicateIntArray() {
        assertFalse(ContainsDuplicate.containsDuplicateActual(doNotContainsDuplicateIntArray));
    }
}
