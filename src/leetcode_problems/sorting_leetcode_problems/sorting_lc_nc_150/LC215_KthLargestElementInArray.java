package leetcode_problems.sorting_leetcode_problems.sorting_lc_nc_150;

public class LC215_KthLargestElementInArray {
    public int findKthLargest(int[] nums, int k) {
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
