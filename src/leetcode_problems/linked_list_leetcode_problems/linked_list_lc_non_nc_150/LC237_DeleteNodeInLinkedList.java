package leetcode_problems.linked_list_leetcode_problems.linked_list_lc_non_nc_150;

import leetcode_problems.linked_list_leetcode_problems.ListNode;

/**
 * Copy the value from next node, and remove the next node from linked list
 */
public class LC237_DeleteNodeInLinkedList {
	public void deleteNode(ListNode node) {
        node.val = node.next.val; //always exists, as given node to delete is not the last node in linked list
        node.next = node.next.next;
    }
}
