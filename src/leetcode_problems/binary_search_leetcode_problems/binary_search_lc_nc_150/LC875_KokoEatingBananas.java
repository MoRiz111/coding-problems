package leetcode_problems.binary_search_leetcode_problems.binary_search_lc_nc_150;

public class LC875_KokoEatingBananas {
    public int minEatingSpeed(int[] piles, int h) {
        int l=0;
        int r=0;
        int res=0;
        
        for (int pile: piles) {
        	r = Math.max(pile, r);
        }
        res = r;
        
        while (l<r) {
        	int m = l + (r-l)/2;
        	int t = 0;
        	
        	for (int pile: piles) {
        		t += (int)Math.ceil((double) pile/m);
        	}
        	
        	if (t>=h) {
        		l = m+1;
        	} else {
        		r = m;
        	}
        	
        	res = Math.min(m, res);
        }
        
        return res;
    }
}
