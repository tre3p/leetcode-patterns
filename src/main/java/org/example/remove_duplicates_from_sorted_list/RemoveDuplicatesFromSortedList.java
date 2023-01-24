package org.example.remove_duplicates_from_sorted_list;

import org.example.ListNode;

public class RemoveDuplicatesFromSortedList {
    public static ListNode removeDuplicatesFromSortedList(ListNode head) {
        ListNode current = head;

        while (current != null && current.next != null) {
            if (current.val == current.next.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        return head;
    }
}
