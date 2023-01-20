package org.example.middle_of_the_linked_list;

public class MiddleOfTheLinkedList {
    public static void main(String[] args) {

    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode getMiddleOfTheLinkedList(ListNode head) {
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
