package leetcode_problems.hashing_leetcode_problems.hashing_lc_nc_150;

import java.util.HashMap;
import java.util.Map;

public class LC76_MinimumWindowSubstring {
    public String minWindow(String s, String t) {
        int sLen = s.length();
        int tLen = t.length();
        Map<Character, Integer> sFreq = new HashMap<Character, Integer>();
        Map<Character, Integer> tFreq = new HashMap<Character, Integer>();
        int start = 0;
        
        
        if (tLen > sLen) {
        	return "";
        }
        
        for (char c: t.toCharArray()) {
        	tFreq.put(c, tFreq.getOrDefault(c, 0)+1);
        }
        int req = tFreq.size();
        
        for (int i=0; i<sLen; i++) {
        	char c = s.charAt(i);
        	sFreq.put(c, sFreq.getOrDefault(c, 0)+1);
        	
        	if (sFreq.get(c) == tFreq.get(c)) {
        		req--;
        		
        		if (req == 0) {
        			return s.substring(start,i+1);
        					
        		}
        	} else {
        		while (start != i) {
        			sFreq.put(c, 0);
        			start++;
        		}
        	}
        }
    }
}
