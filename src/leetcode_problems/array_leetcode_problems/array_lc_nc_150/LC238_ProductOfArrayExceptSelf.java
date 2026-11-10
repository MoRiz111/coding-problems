package leetcode_problems.array_leetcode_problems.array_lc_nc_150;

import java.util.Arrays;

/**
 * Forward and Backward multiplication
 * TC - O(N)
 * SC - O(1) [excluding the 'res' as it is required for output](as asked in follow-up)
 */
public class LC238_ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int size = nums.length;
        int[] res = new int[size];
        
        Arrays.fill(res, 1);
        
        for (int j = 1; j<size; j++) {
        	res[j] = res[j-1]*nums[j-1];
        }
        
        int prev = 1;
        
        for (int k = size-2; k>=0; k--) {
        	prev *= nums[k+1];
        	res[k] = res[k]*prev;
        }
        
        return res;
    }
}
