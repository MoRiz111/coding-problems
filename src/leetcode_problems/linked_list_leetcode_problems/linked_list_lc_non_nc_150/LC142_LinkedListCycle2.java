package leetcode_problems.linked_list_leetcode_problems.linked_list_lc_non_nc_150;

import leetcode_problems.linked_list_leetcode_problems.ListNode;

/**
 * Floyd's Cycle Detection (Slow, Fast pointer)
 * TC - O(N) (O(N)*2 for 2 while loops)
 * SC - O(1)
 */
public class LC142_LinkedListCycle2 {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                slow = head;

                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }

                return slow;
            }
        }

        return null;
    }
}
