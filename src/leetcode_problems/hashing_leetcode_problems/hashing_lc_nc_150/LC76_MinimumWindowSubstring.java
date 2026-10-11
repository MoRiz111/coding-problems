package leetcode_problems.hashing_leetcode_problems.hashing_lc_nc_150;

import java.util.HashMap;
import java.util.Map;

/**
 * HashMap, Sliding window (a specialized type of 2-pointer).
 * TC - O(m+n)
 * Where:
   m = length of string t
   n = length of string s
   Building tFreq takes O(m) time because we iterate through t once.
   The for loop iterates through s once, taking O(n) time.
   Although the while loop is nested inside the for loop, 
   it takes only O(n) total time across all iterations 
   because start only moves forward and never moves backwards. 
   Each character is removed from the window at most once.
   We store the best window's start and end indices and call substring() only once at the end,
   taking at most O(n) time.
   Therefore, total time complexity:
   O(m + n + n) = O(m + n)
 * SC - O(m+n)
 */
public class LC76_MinimumWindowSubstring {
    public String minWindow(String s, String t) {
    	int sLen = s.length();
        int tLen = t.length();
        Map<Character, Integer> sFreq = new HashMap<Character, Integer>();
        Map<Character, Integer> tFreq = new HashMap<Character, Integer>();
        int start = 0;
        int minLength = sLen+1;
        int[] res= new int[2];
        
        
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
        	
        	if (tFreq.containsKey(c) && sFreq.get(c).equals(tFreq.get(c))) {
        		req--;
        	}
        	
        	while (req == 0) {
        		int len = (i-start)+1;
        		
        		if (len < minLength) {
        			minLength = len;
        			res = new int[]{start, i+1};
        		}
        		
        		char charToRemove =  s.charAt(start);
        		sFreq.put(charToRemove, sFreq.get(charToRemove)-1);
        		
        		if (tFreq.containsKey(charToRemove) && sFreq.get(charToRemove) < tFreq.get(charToRemove)) {
        			req++;
        		}
        		
        		start++;
        	}
        }
        
        return s.substring(res[0], res[1]);
    }
}
