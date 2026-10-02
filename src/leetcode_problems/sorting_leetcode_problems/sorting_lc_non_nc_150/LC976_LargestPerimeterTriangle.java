package leetcode_problems.sorting_leetcode_problems.sorting_lc_non_nc_150;

import java.util.Arrays;

/**
 * Sorting
 * TC - O(N)
 * SC - O(1)
 */
public class LC976_LargestPerimeterTriangle {
	public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);

        for (int i=nums.length-1; i>=2; i--) {
            if (nums[i] < nums[i-1] + nums[i-2]) {
                return nums[i] + nums[i-1] + nums[i-2];
            }
        }

        return 0;
    }
}
