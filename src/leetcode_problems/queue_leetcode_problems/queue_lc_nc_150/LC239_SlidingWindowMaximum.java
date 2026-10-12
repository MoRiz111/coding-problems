package leetcode_problems.queue_leetcode_problems.queue_lc_nc_150;

import java.util.ArrayDeque;

public class LC239_SlidingWindowMaximum {
	public int[] maxSlidingWindow(int[] nums, int k) {
		ArrayDeque<Integer> queue = new ArrayDeque<Integer>();
		int len = nums.length;
		int[] res = new int[len-k+1];
		
		for (int i=0; i<len; i++) {
			while (!queue.isEmpty() && (nums[queue.peekLast()] <= nums[i])) {
				queue.pollLast();
			}
			queue.add(i);
			
			if (!queue.isEmpty() && queue.peekFirst() + k <= i) {
				queue.pollFirst();
			}
			
			if (i >= k-1) {
				res[i-k+1] = nums[queue.peekFirst()];
			}
		}
		
		return res;
    }
}
