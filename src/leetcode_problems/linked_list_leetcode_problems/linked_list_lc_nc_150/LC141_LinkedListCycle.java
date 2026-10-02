package leetcode_problems.linked_list_leetcode_problems.linked_list_lc_nc_150;

import leetcode_problems.linked_list_leetcode_problems.ListNode;

/**
 * Slow and Fast pointer (Floyd's cycle detection)
 * 
 */
public class LC141_LinkedListCycle {
	public boolean hasCycle(ListNode head) {
		ListNode slow = head;
		ListNode fast = head;
		
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			
			if (slow == fast) {
				return true;
			}
		}
		
		return false;
	}
}
