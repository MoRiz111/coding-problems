package leetcode_problems.sliding_window_leetcode_problems.sliding_window_lc_nc_150;

public class LC424_LongestRepeatingCharacterReplacement {
	public int characterReplacement(String s, int k) {
		int i = 0;
		int first = 0;
		int last = 0;
		char cur = s.charAt(0);
		int r = k;
		int res = 0;
		
		if (k == 0) {
			return s.length();
		}
		
		while (i < s.length()) {
			if (s.charAt(i) != cur) {
				if (r == 0) {
					res = Math.max(res, i-last);
					cur = s.charAt(i);
					r = k;
					i = first;
					last = first;
				} else if (k == r) {
					first = i;
					r--;
				} else {
					r--;
				}
			}
			
			i++;
		}
		
		return Math.max(i-last+1, res);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
    public int characterReplacementWrong(String s, int k) {
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
