package leetcode_problems.linked_list_leetcode_problems.linked_list_lc_nc_150;

import leetcode_problems.linked_list_leetcode_problems.ListNode;

class LC206_ReverseLinkedList {
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
    public ListNode reverseListIterative(ListNode head) {
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
    
    /**
     * Recursive : 
	   Keep sending the newHead (last element),
 	       from base case.
	   Then use : 
	   head.next.next = head
	   head.next = null
     * 
     * TC - O(N)
	 * SC - O(N) (recursion stack)
     */
    public ListNode reverseListRecursive(ListNode head) {
    	if (head == null || head.next == null) {
            return head;
        }

        ListNode newHead = reverseListRecursive(head.next);

        head.next.next = head;
        head.next = null;

        return newHead;
    }
}
