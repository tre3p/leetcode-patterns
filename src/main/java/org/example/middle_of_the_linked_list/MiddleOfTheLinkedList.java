package org.example.middle_of_the_linked_list;

import org.example.ListNode;

public class MiddleOfTheLinkedList {
    static ListNode getMiddleOfTheLinkedList(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        /**
         * Two pointers strategy.
         *
         * When fast pointer will reach end of the linked list - slow will have link to middle element.
         */
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }
}
