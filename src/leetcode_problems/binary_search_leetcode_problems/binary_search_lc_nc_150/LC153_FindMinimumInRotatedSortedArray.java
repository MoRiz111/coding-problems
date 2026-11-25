package leetcode_problems.binary_search_leetcode_problems.binary_search_lc_nc_150;

/**
 * Binary Search
 * TC - O(logN)
 * SC - O(1)
 */
public class LC153_FindMinimumInRotatedSortedArray {
	public int findMin(int[] nums) {
		int l = 0;
		int r = nums.length-1;
		
		while (l<=r) {
			if (nums[l] < nums[r]) {
				return nums[l];
			}
			
			if (l == r) {
				return nums[l];
			}
			
			int m = (l+r)/2;
			
			if (nums[l] <= nums[m]) {
				l = m+1;
			} else {
				r = m;
			}
		}
		
		return -1;
	}
}
