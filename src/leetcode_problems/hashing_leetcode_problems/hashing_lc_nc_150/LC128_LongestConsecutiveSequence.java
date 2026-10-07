package leetcode_problems.hashing_leetcode_problems.hashing_lc_nc_150;

import java.util.HashSet;
import java.util.Set;

/**
 * HashSet. And for start elements only, check if following elements are present in Set.
 * TC - O(N)
 * SC - O(K) - K is the no. of distinct elements
 */
public class LC128_LongestConsecutiveSequence {
	public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        int res = 0;

        for (int num: nums) {
            set.add(num);
        }

        for (int num: set) {
            int size = 0;

            if (!set.contains(num-1)) {
                while (set.contains(num+size)) {
                    size++;
                }
                res = Math.max(size, res);
            }
        }

        return res;
    }
}
