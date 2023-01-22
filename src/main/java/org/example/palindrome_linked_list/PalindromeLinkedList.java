package org.example.palindrome_linked_list;


import org.example.ListNode;

public class PalindromeLinkedList {
    static boolean isPalindrome(ListNode head) {
        if (head == null) {
            return false;
        }

        /**
         * Get's middle of the linked list.
         *
         * For example, if head is: 1 -> 2 -> 2 -> 1, will return 2 -> 1
         */
        ListNode middle = middleOfTheLinkedList(head);

        /**
         * Makes middle part reversed.
         *
         * In case of part is 2 -> 1, then it will be 1 -> 2
         */
        ListNode reversed = reverseLinkedList(middle);

        while (reversed != null) {
            /**
             * Checks that value from head is equal to reversed middle of this list.
             *
             * Head: 1 -> 2 -> 2 -> 1
             * MiddleReversed: 1 -> 2
             * rp: reversed pointer
             * hp: head pointer
             *
             *    hp             rp (equal numbers, cause rp and hp both = 1)
             * 1) 1 -> 2 -> 2 -> 1
             *         hp   rp      (equal number, cause rp and hp both = 2)
             * 2) 1 -> 2 -> 2 -> 1
             *
             * So 1 -> 2 -> 2 -> 1 is palindrome.
             */
            if (head.val != reversed.val) {
                return false;
            }

            reversed = reversed.next;
            head = head.next;
        }

        return true;
    }

    private static ListNode middleOfTheLinkedList(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    private static ListNode reverseLinkedList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            ListNode tempNext = current.next;
            current.next = prev;

            prev = current;
            current = tempNext;
        }

        return prev;
    }
}
