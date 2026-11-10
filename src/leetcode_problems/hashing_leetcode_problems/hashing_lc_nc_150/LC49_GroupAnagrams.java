package leetcode_problems.hashing_leetcode_problems.hashing_lc_nc_150;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Hashing (frequency array)
 * TC - O(N.M.26) -> O(N.M) [N - no. of words in strs, M - max. length on an element in strs]
 * SC - O(N.M)
 */
public class LC49_GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        
        for (int i = 0; i<strs.length; i++) {
        	String cur = strs[i];
        	StringBuilder sortedCur = new StringBuilder();
        	int[] arr = new int[26];
        	
        	//TC - O(M)
        	for (char c: cur.toCharArray()) {
        		arr[c-'a']++;
        	}
        	
        	//TC - O(26)
        	for (int j = 0; j<arr.length; j++) {
        		while (arr[j] > 0) {
        			sortedCur.append((char)('a'+j));
        			arr[j]--;
        		}
        	}
        	
        	map.computeIfAbsent(sortedCur.toString(), k -> new ArrayList<String>()).add(cur);
        }
        
        return new ArrayList<>(map.values());
    }
}
