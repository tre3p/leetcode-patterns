package org.example.reverse_linked_list;

public class ReverseLinkedList {
    static class ListNode {
        int val;
        ListNode next;

        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static ListNode reverseLinkedList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            /**
             * Remembers link to the next element
             *
             * c - current
             * t - tmpNext
             *
             *  c    t
             *  1 -> 2 -> 3 -> 4 -> 5 -> null
             */
            ListNode tmpNext = current.next;

            /**
             * Set link for current element to previous (at first iteration - null)
             *
             *
             * 1 -> null -> 3 -> 4 -> 5 -> null
             */
            current.next = prev;


            prev = current;
            current = tmpNext;
        }

        return prev;
    }
}
