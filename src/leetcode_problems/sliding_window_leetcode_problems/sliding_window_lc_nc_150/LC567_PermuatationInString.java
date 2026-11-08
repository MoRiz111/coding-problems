package leetcode_problems.sliding_window_leetcode_problems.sliding_window_lc_nc_150;

public class LC567_PermuatationInString {
    public boolean checkInclusion(String s1, String s2) {
    	int[] s1Freq = new int[26];
    	int[] s2Freq = new int[26];
    	int req = 0;
    	
    	for (char c: s1.toCharArray()) {
    		s1Freq[c-'a']++;
    		
    		if (s1Freq[c-'a'] == 1) {
    			req++;
    		}
    	}
    	
    	int l=0;
    	int r=0;
    	
    	while (r < s2.length()) {
    		char c = s2.charAt(r);
    		
    		if (s1Freq[c-'a'] == 0 || s2Freq[c-'a'] > s1Freq[c-'a']) { //not present in s1, so move the left pointer
    			while (l <= r) {
    				if (c != s2.charAt(l)) {
    					s2Freq[s2.charAt(l)-'a']--;
    				}
    				
    				if (s2Freq[s2.charAt(l)-'a'] == s1Freq[s2.charAt(l)-'a']-1) {
    					req++;
    				}
    				
    				l++;
    			}
    		} else {
    			s2Freq[c-'a']++;
    			
    			if (s2Freq[c-'a'] == s1Freq[c-'a']) {
    				req--;
    				
    				if (req == 0) {
    					return true;
    				}
    			}
    		}
    		
    		r++;
    	}
    	
        return false;
    }
}
