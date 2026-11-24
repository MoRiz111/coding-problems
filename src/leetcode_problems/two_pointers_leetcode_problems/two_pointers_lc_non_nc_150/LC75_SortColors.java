package leetcode_problems.two_pointers_leetcode_problems.two_pointers_lc_non_nc_150;

public class LC75_SortColors {
	/**
	 * Two Pointers (my custom)
	 * TC - O(N)
	 * SC - O(1)
	 */
    public void sortColors(int[] nums) {
    	int r = 0;
    	int w = 0;
    	
    	for (int i = 0; i<nums.length; i++) {
    		if (nums[i] == 0) {
    			swap(nums, r, i);
    			
    			if (nums[i] == 1) {
    				swap(nums, w, i);
    			}
    			
    			r++;
    			w++;
    		} else if (nums[i] == 1) {
    			swap(nums, w, i);
    			w++;
    		}
    	}
    }
    
	/**
	 * Dutch National Flag algo / shrink unknown region
	 * TC - O(N)
	 * SC - O(1)
	 */
    public void sortColors2(int[] nums) {
    	int low = 0;
    	int mid = 0;
    	int high = nums.length-1;
    	
    	while (mid <= high) {
    		if (nums[mid] == 0) {
    			swap(nums, mid, low);
    			low++;
    			mid++;
    		} else if (nums[mid] == 1) {
    			mid++;
    		} else {
    			swap(nums, mid, high);
    			high--;
    		}
    	}
    }
    
    private void swap(int[] nums, int index1, int index2) {
    	int temp = nums[index1];
    	nums[index1] = nums[index2];
    	nums[index2] = temp;
    }
}
