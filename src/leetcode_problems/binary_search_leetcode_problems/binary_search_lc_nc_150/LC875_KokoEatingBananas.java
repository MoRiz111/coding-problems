package leetcode_problems.binary_search_leetcode_problems.binary_search_lc_nc_150;

/**
 * Binary Search
 * TC - O(N.log(Max))
 * SC - O(1)
 */
public class LC875_KokoEatingBananas {
    public int minEatingSpeed(int[] piles, int h) {
    	int l = 1; //start with 1, as 0 cannot be a solution
        int r = 0;
        
        for (int pile: piles) {
        	r = Math.max(r, pile);
        }
        
        while (l<r) {
        	int m = l + (r-l)/2;
        	int t = 0;
        	
        	for (int pile: piles) {
        		t += (pile + m - 1)/m; //(int) (Math.ceil ((float) pile/m));
        	}
        		
    		if (t <= h) {
    			r = m;
    		} else {
    			l = m+1;
    		}
        }
        
        return r; //both l or r can be returned, as the while loop exists at l == r   
    }
}
