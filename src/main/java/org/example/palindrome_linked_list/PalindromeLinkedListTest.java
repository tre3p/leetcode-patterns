package org.example.palindrome_linked_list;

import org.example.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PalindromeLinkedListTest {

    private static ListNode first = new ListNode(1);
    private static ListNode second = new ListNode(2);
    private static ListNode third = new ListNode(2);
    private static ListNode fourth = new ListNode(1);

    @BeforeEach
    void beforeEach() {
        first.next = second;
        second.next = third;
        third.next = fourth;
    }

    @Test
    void shouldReturnTrueIfListIsPalindrome() {
        Assertions.assertTrue(PalindromeLinkedList.isPalindrome(first));
    }

    @Test
    void shouldReturnTrueIfListIsSingleElement() {
        Assertions.assertTrue(PalindromeLinkedList.isPalindrome(fourth));
    }

    @Test
    void shouldReturnFalseIfListIsNull() {
        Assertions.assertFalse(PalindromeLinkedList.isPalindrome(null));
    }

}
