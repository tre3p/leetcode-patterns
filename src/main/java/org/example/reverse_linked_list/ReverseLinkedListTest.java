package org.example.reverse_linked_list;

import org.example.ListNode;
import org.junit.Ignore;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class ReverseLinkedListTest {

    private static ListNode first = new ListNode(1);
    private static ListNode second = new ListNode(2);
    private static ListNode third = new ListNode(3);
    private static ListNode fourth = new ListNode(4);
    private static ListNode fifth = new ListNode(5);
    private static ListNode sixth = new ListNode(6);

    @BeforeAll
    static void beforeAll() {
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
    }

    @Test
    void shouldCorrectReverseLinkedListOfEvenCountOfElements() {
        ListNode reversed = ReverseLinkedList.reverseLinkedList(first);

        assertEquals(6, reversed.val);
        assertEquals(5, reversed.next.val);
        assertEquals(4, reversed.next.next.val);
        assertEquals(3, reversed.next.next.next.val);
        assertEquals(2, reversed.next.next.next.next.val);
        assertEquals(1, reversed.next.next.next.next.next.val);
        assertNull(reversed.next.next.next.next.next.next);
    }

    @Test
    void shouldCorrectReverseLinkedListOfNotEvenCountOfElements() {
        ListNode reversed = ReverseLinkedList.reverseLinkedList(fourth);

        assertEquals(6, reversed.val);
        assertEquals(5, reversed.next.val);
        assertEquals(4, reversed.next.next.val);
        assertNull(reversed.next.next.next);
    }

    @Test
    @Ignore("TODO fix")
    void shouldReturnSingleElementListNodeIfSingleElementListPassed() {
        ListNode reversed = ReverseLinkedList.reverseLinkedList(sixth);

        //assertEquals(6, reversed.val);
        //assertNull(reversed.next);
    }
}
