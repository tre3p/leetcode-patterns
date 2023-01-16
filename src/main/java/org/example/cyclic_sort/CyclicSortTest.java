package org.example.cyclic_sort;

import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CyclicSortTest {

    @Test
    void testCyclicSort1() {
        assertEquals(List.of(5, 6), CyclicSort.cyclicSort(new int[]{4,3,2,7,8,2,3,1}));
    }

    @Test
    void testCyclicSort2() {
        assertEquals(List.of(2), CyclicSort.cyclicSort(new int[]{1, 1}));
    }
}
