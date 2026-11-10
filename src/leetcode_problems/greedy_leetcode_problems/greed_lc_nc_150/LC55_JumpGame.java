package leetcode_problems.greedy_leetcode_problems.greed_lc_nc_150;

/**
 * Greedy - reverse traversal
 * TC - O(N)
 * SC - O(1)
 */
public class LC55_JumpGame {
    public boolean canJump(int[] nums) {
    	int len = nums.length;
    	int req = 0;
    	
    	if (len == 1) {
    		return true;
    	}
    	
    	for (int i=nums.length-2; i>=0; i--) {
    		req++;
    		
    		if (nums[i] >= req) {
    			req = 0;
    		}
    	}
    	
    	return (req == 0);
    }
}
