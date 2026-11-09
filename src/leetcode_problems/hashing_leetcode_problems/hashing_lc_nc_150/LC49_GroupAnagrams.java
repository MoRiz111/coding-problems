package leetcode_problems.hashing_leetcode_problems.hashing_lc_nc_150;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LC49_GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<Integer>> map = new HashMap<>();
        List<List<String>> res = new ArrayList<>();
        
        for (int i = 0; i<strs.length; i++) {
        	String cur = strs[i];
        	StringBuilder sortedCur = new StringBuilder();
        	int[] arr = new int[26];
        	
        	for (char c: cur.toCharArray()) {
        		arr[c-'a']++;
        	}
        	
        	for (int j = 0; j<arr.length; j++) {
        		while (arr[j] > 0) {
        			sortedCur.append((char)('a'+arr[j]));
        			arr[j]--;
        		}
        	}
        	
        	map.computeIfAbsent(sortedCur.toString(), k -> new ArrayList<Integer>()).add(i);
        }
        
        for (String key : map.keySet()) {
        	List<Integer> value = map.get(key);
        	List<String> curGroup = new ArrayList<>();
        	
        	for (int k=0; k < value.size(); k++) {
        		curGroup.add(strs[value.get(k)]);
        	}
        	
        	res.add(curGroup);
        }
        
        return res;
    }
}
