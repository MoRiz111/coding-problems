package leetcode_problems.linked_list_leetcode_problems.linked_list_lc_nc_150;

import leetcode_problems.linked_list_leetcode_problems.ListNode;

/**
 * Adding each node separately
 * TC - O(max(M,N))
 * SC - O(1) [only res needs O(max(M,N))]
 */
public class LC2_Add2Numbers {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		int carry = 0;
		ListNode dum = new ListNode(0);
		ListNode res = dum;
		
		while (l1 != null || l2 != null || carry != 0) {
			int sum = ((l1 != null)?l1.val:0) + ((l2 != null)?l2.val:0) + carry;
			carry = sum/10;
			res.next = new ListNode(sum%10);
			
			l1 = (l1 != null)?l1.next:l1;
			l2 = (l2 != null)?l2.next:l2;
			res = res.next;
		}
		
		return dum.next;
	}
}
