package leetcode_problems.linked_list_leetcode_problems.linked_list_lc_nc_150;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import leetcode_problems.linked_list_leetcode_problems.ListNode;

/**
 * Keep merging 2 lists at a time
 * TC - O(logK. N^2)
 * SC - O(N)
 */
public class LC23_MergeKSortedLists {
	 public ListNode mergeKLists(ListNode[] lists) {
		 if (lists.length == 0) {
			 return null;
		 }
		 
		 List<ListNode> unMergedLists = new ArrayList<>(Arrays.asList(lists)); //SC - O(N)
		 
		 while (unMergedLists.size() > 1) { //TC - O(logK. N^2)
			 List<ListNode> mergedLists = new ArrayList<ListNode>(); //SC - O(N)
			 
			 for (int i = 0; i<unMergedLists.size(); i+=2) { //TC - O(N^2)
				 if (i+1 < unMergedLists.size()) {
					 mergedLists.add(mergeTwoLists(unMergedLists.get(i), unMergedLists.get(i+1)));
				 } else {
					 mergedLists.add(unMergedLists.get(i));
				 }
				 
			 }
			 
			 unMergedLists = mergedLists;
		 }
		 
		 return unMergedLists.get(0);
	 }
	 
	 private ListNode mergeTwoLists(ListNode list1, ListNode list2) { //TC - O(N)
		 ListNode cur1 = list1;
		 ListNode cur2 = list2;
		 ListNode dummy = new ListNode(0);
		 ListNode res = dummy;
		 
		 while (cur1 != null && cur2 != null) {
			 if (cur1.val <= cur2.val) {
				 while (cur1 != null && cur2 != null && cur1.val <= cur2.val) {
					 res.next = cur1;
					 cur1 = cur1.next;
					 res = res.next;
				 }
			 } else {
				 while (cur1 != null && cur2 != null && cur2.val <= cur1.val) {
					 res.next = cur2;
					 cur2 = cur2.next;
					 res = res.next;
				 }
			 }
		 }
		 
		 if (cur1 == null) {
			 res.next = cur2;
		 } else {
			 res.next = cur1;
		 }
		 
		 return dummy.next;
	 }
}
