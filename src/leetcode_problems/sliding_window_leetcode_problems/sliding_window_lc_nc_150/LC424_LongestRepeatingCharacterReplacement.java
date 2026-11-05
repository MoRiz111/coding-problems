package leetcode_problems.sliding_window_leetcode_problems.sliding_window_lc_nc_150;

public class LC424_LongestRepeatingCharacterReplacement {
    public int characterReplacement(String s, int k) {
        int size = s.length();
        int ch = k;
        int l = 0,r = 0;
        int res = 0;
        int modified = 0;
        
        while (r<size) {
        	if (s.charAt(l) != s.charAt(r)) {
        		if (ch > 0) {
        			if (k == ch) {
        				modified = r;
        			}
        			ch--;
        		} else {
        			int len = r-l;
        			res = Math.max(res, len);
        			l = modified;
        			r = modified;
        			ch = k;
        		}
        	}
        	r++;
        }
        
        res = Math.max(res, r-l+1);
        
        return res;
    }
}
