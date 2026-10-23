package leetcode_problems.linked_list_leetcode_problems.linked_list_lc_non_nc_150;

import leetcode_problems.linked_list_leetcode_problems.ListNode;

/**
 * Use nested loop
 * TC - O(N) - all nodes are visited only once.
 * SC - O(1)
 */
public class LC83_RemoveDuplicatesFromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
    		return null;
    	}
        
        ListNode cur = head;
    	
    	while (cur != null) {
    		while (cur.next != null && cur.val == cur.next.val) {
    			cur.next = cur.next.next;
    		}

    		cur = cur.next;
    	}
    	
    	return head;
    }
}
