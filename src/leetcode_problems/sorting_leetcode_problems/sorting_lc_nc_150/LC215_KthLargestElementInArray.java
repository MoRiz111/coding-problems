package leetcode_problems.sorting_leetcode_problems.sorting_lc_nc_150;

import java.util.PriorityQueue;

public class LC215_KthLargestElementInArray {
	/**
	 * Min. Heap
	 * TC - O(N.logK)
	 * SC - O(K)
	 */
	public int findKthLargestHeap(int[] nums, int k) {
		PriorityQueue<Integer> heap = new PriorityQueue<>();
		
		for (int num: nums) {
			heap.offer(num);
			
			if (heap.size() > k) {
				heap.poll();
			}
		}
		
		return heap.peek();
	}
	
	/**
	 * Using Quickselect
	 * TC - O(N) (best & average case), O(N^2) - (worst case - if it is already sorted)
	 * SC - O(1)
	 */
    public int findKthLargestQuickSelect(int[] nums, int k) {
    	int l = 0;
    	int r = nums.length-1;
    	int req = nums.length-k;
    	
    	
    	while (l <= r) {
    		int pivot = getPivot(l,r,nums);
    		
    		if (pivot == req) {
    			return nums[pivot];
    		} else if (pivot < req) {
    			l = pivot+1;
    		} else {
    			r = pivot-1;
    		}
    	}
    	
    	return -1;
    }
    
    public int getPivot(int l, int r, int[] nums) {
    	int pivot = r;
    	int i = l;
    	
    	for (int j=i; j<pivot; j++) {
    		if (nums[j] < nums[pivot]) {
    			swap(i,j,nums);
    			i++;
    		}
    	}
    	
    	swap(i,r,nums);
    	return i;
    }
    
    public void swap(int l, int r, int[] nums) {
    	int temp = nums[l];
    	nums[l] = nums[r];
    	nums[r] = temp;
    }
}
