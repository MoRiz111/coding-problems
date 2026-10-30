package leetcode_problems.linked_list_leetcode_problems.linked_list_lc_nc_150;

import leetcode_problems.linked_list_leetcode_problems.ListNode;

/**
 * Assigning the next lowest pointer to the result inside while loop
 * TC - O(M+N)
 * SC - O(1) (as there are only pointers, no new node)
 */
public class LC21_MergeTwoSortedLists {
	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
	   ListNode dummy = new ListNode(0);
	   ListNode res = dummy;
	   
	   while (list1 != null && list2 != null) {
		   if (list1.val < list2.val) {
			   res.next = list1;
			   list1 = list1.next;
		   } else {
			   res.next = list2;
			   list2 = list2.next;
		   }
		   
		   res = res.next;
	   }
	   
	   res.next = (list1 != null) ? list1: list2;
	   
	   return dummy.next;
   }
}
