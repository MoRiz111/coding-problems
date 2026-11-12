package leetcode_problems.greedy_leetcode_problems.greed_lc_nc_150;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Greedy
 * TC - O(N)
 * SC - O(26) -> O(1)
 */
public class LC763_PartitionLabels {
    public List<Integer> partitionLabels(String s) {
    	List<Integer> res = new ArrayList<>();
    	Set<Character> pending = new HashSet<>();
    	int[] freq = new int[26];
    	int size = s.length();
    	int l = 0;
    	int r = 0;
    	
    	for (char c: s.toCharArray()) {
    		freq[c-'a']++;
    	}
    	
    	while (r < size) {
    		char cur = s.charAt(r);
    		freq[cur-'a']--;
    		pending.add(cur);
    		
    		if (freq[cur-'a'] == 0) {
    			pending.remove(cur);
    			
    			if (pending.size() == 0) {
    				res.add(r-l+1);
    				r++;
    				l = r;
    				continue;
    			}
    		}
    		
    		r++;
    	}
    	
    	return res;
    }
}
