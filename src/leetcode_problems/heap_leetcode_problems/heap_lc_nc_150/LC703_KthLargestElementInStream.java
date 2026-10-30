package leetcode_problems.heap_leetcode_problems.heap_lc_nc_150;

import java.util.PriorityQueue;

public class LC703_KthLargestElementInStream {
	PriorityQueue<Integer> heap = new PriorityQueue<Integer>();
	
    public LC703_KthLargestElementInStream(int k, int[] nums) {
        for (int num: nums) {
        	heap.offer(num);
        	
        	if (heap.size() > k) {
        		heap.poll();
        	}
        }
    }
    
    public int add(int val) {
    	if (heap.size() < k) {
    		heap.offer(val);
    	} else if (heap.peek() < val) {
        	heap.offer(val);
        	heap.poll();
        }
        
        return heap.peek();
    }
}
