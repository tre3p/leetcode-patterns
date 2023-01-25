package org.example.merge_two_sorted_lists;

import org.example.ListNode;

public class MergeTwoSortedLists {


    public static ListNode mergeTwoSortedLists(ListNode list1, ListNode list2) {
        ListNode merged = new ListNode(0);
        ListNode result = merged;

        while (list1 != null && list2 != null) {
            /**
             * If value from first list is less than value from second - we should append to merged
             * this value, because it's lower.
             *
             * If value from first list is bigger or equal to second - we should append to merged
             * this value, because it's lower.
             */
            if (list1.val < list2.val) {
                merged.next = new ListNode(list1.val);
                list1 = list1.next;
            } else {
                merged.next = new ListNode(list2.val);
                list2 = list2.next;
            }

            merged = merged.next;
        }

        /**
         * If lists are not equal by length - we need to make sure that we've appended all of it's parts.
         */
        while (list1 != null) {
            merged.next = new ListNode(list1.val);
            list1 = list1.next;
            merged = merged.next;
        }

        while (list2 != null) {
            merged.next = new ListNode(list2.val);
            list2 = list2.next;
            merged = merged.next;
        }

        return result.next;
    }
}
