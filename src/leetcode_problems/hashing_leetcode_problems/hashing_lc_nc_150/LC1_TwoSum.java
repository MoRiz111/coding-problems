package leetcode_problems.hashing_leetcode_problems.hashing_lc_nc_150;

import java.util.HashMap;
import java.util.Map;

/**
 * Hashing
 * TC - O(N)
 * SC - O(N)
 */
public class LC1_TwoSum {
	public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i=0; i<nums.length; i++) {
            int num = nums[i];
            int req = target-num;

            if (map.containsKey(req)) {
                return new int[]{i, map.get(req)};
            } else {
                map.put(num, i);
            }
        }

        return new int[]{0,0};
    }
}
