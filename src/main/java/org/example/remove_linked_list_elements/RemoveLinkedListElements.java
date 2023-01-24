package org.example.remove_linked_list_elements;

import org.example.ListNode;

public class RemoveLinkedListElements {
    public static ListNode removeLinkedListElements(ListNode head, int target) {
        ListNode result = new ListNode(0);
        result.next = head;

        ListNode current = result;

        while (current.next != null) {
            if (current.next.val == target) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        return result.next;
    }
}
