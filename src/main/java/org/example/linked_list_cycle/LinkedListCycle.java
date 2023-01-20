package org.example.linked_list_cycle;

public class LinkedListCycle {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static boolean isCycle(ListNode head) {
        if (head == null) {
            return false;
        }

        ListNode fast = head;
        ListNode slow = head;

        /**
         * Two pointers strategy.
         *
         * Fast pointer will go on two steps forward, and the slow will go on one step forward.
         * If LinkedList is cycled - slow and fast pointers will have the same link.
         */
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                return true;
            }
        }

        return false;
    }
}
