package leetcode_problems.binary_search_leetcode_problems.binary_search_lc_nc_150;

/**
 * Basic Binary Search
 * TC - O(logN)
 * SC - O(1)
 */
public class LC704_BinarySearch {
	public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length-1;
        
        while (l <= r) {
        	int m = (r-l)/2 + l;
        	
        	if (nums[m] == target) {
        		return m;
        	} else if (nums[m] < target) {
        		l = m+1;
        	} else {
        		r = m-1;
        	}
        }
        
        return -1;
    }
}
