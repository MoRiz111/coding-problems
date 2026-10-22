package leetcode_problems.linked_list_leetcode_problems.linked_list_lc_non_nc_150;

import leetcode_problems.linked_list_leetcode_problems.ListNode;

public class LC83_RemoveDuplicatesFromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
    		return null;
    	}
        
        ListNode cur = head;
    	
    	while (cur != null && cur.next != null) {
    		ListNode nextNode = cur.next;
    		
    		while (cur.val == nextNode.val) {
    			cur.next = nextNode.next;
    			nextNode = nextNode.next;

                if (nextNode.next != null) {
                	cur = nextNode.next.next;
                }
                
                cur = nextNode;
                continue;
    		}

    		cur = nextNode;
    	}
    	
    	return head;
    }
}
