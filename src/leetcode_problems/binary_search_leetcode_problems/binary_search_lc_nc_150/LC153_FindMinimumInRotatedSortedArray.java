package leetcode_problems.binary_search_leetcode_problems.binary_search_lc_nc_150;

public class LC153_FindMinimumInRotatedSortedArray {
    public int findMin(int[] nums) {
        int size = nums.length;
        int l = 0;
        int r = size-1;
        

        
        while (l < r) {
        	int m = (l+r)/2;
        	
            if (nums[l] < nums[r]) {
            	return nums[l];
            } else if (m != 0 && nums[m-1] > nums[m]) {
        		return nums[m];
        	} else if (nums[l] < nums[m]) {
        		l = m+1;
        	} else {
        		r = m-1;
        	}
        }
        
        return nums[0];
    }
}
