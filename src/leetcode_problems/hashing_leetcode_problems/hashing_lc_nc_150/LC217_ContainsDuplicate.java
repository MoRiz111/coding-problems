package leetcode_problems.hashing_leetcode_problems.hashing_lc_nc_150;

import java.util.HashSet;
import java.util.Set;

/**
 * Hashing with HashSet
 * TC - O(N)
 * SC - O(N)
 */
public class LC217_ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        
        for (int num: nums) {
        	if(!set.add(num)) {
        		return true;
        	}
        }
        
        return false;
    }
}
