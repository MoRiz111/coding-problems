package leetcode_problems.hashing_leetcode_problems.hashing_lc_nc_150;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LC3_LongestSubstringWithoutRepeatingCharacters {
	/**
	 * Hashing
	 * TC - O(N)
	 * SC - O(K) (distinct character given in string)
	 */
	public int lengthOfLongestSubstring_my_solution_most_efficient(String s) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        int start = 0;
        int size = 0;
        int res = 0;

        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);

            if (map.containsKey(c) && map.get(c) >= start) {
                start = map.get(c)+1;
                size = i-start;
            }
   
            map.put(c,i);
            size++;
            res = Math.max(res, size);
        }

        return res;
	}
	
	/**
	 * Hashing and sliding window
	 * (This is a little bit less efficient as,
	 * the next start is found by removing the elements one-by-one,
	 * while my solution directly jumps)
	 * TC - O(N)
	 * SC - O(K) (distinct character given in string)
	 */
	public int lengthOfLongestSubstring_neetCode_solution(String s) {
		Set<Character> set = new HashSet<Character>();
		int res = 0;
		int l = 0;
		int size = 0;

		for (int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			
			if (set.contains(c)) {
				while (set.contains(c)) {
					set.remove(s.charAt(l));
					l++;
				}
			}
			
			set.add(c);
			size = (i-l)+1;
			res = Math.max(size, res);
		}
		
		return res;
	}

}
