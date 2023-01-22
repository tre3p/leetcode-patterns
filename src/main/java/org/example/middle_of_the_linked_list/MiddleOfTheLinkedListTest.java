package org.example.middle_of_the_linked_list;

import org.example.ListNode;
import org.junit.Ignore;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class MiddleOfTheLinkedListTest {

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
    @Ignore("TODO fix")
    void shouldCorrectlyReturnMiddleOfTheListIfCountIsEven() {
        ListNode middle = MiddleOfTheLinkedList.getMiddleOfTheLinkedList(first);

        assertEquals(4, middle.val);
        assertEquals(5, middle.next.val);
        assertEquals(6, middle.next.next.val);
       //assertNull(middle.next);
    }

    @Test
    @Ignore("TODO fix")
    void shouldCorrectlyReturnMiddleOfTheListIfCountIsNotEven() {
        ListNode middle = MiddleOfTheLinkedList.getMiddleOfTheLinkedList(fourth);

        assertEquals(5, middle.val);
        assertEquals(6, middle.next.val);
        //assertNull(middle.next);
    }

    @Test
    void shouldCorrectlyReturnMiddleOfTheListIfCountIsOne() {
        ListNode middle = MiddleOfTheLinkedList.getMiddleOfTheLinkedList(sixth);

        assertEquals(6, middle.val);
        assertNull(middle.next);
    }
}
