package leetcode_problems.linked_list_leetcode_problems.linked_list_lc_nc_150;

import leetcode_problems.linked_list_leetcode_problems.ListNode;

/**
 * Memorize the Linked List reversing mechanism
 * ListNode next = cur.next;
   cur.next = prev;
   prev = cur;
   cur = next;
 * 
 * TC - O(N)
 * SC - O(1)
 */
class LC206_ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode cur = head;

        while (cur != null) {
            ListNode next = cur.next;

            cur.next = prev;
            prev = cur;
            cur = next;
        }

        return prev;
    }
}
