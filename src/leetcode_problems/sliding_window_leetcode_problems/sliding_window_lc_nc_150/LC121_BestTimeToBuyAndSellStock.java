package leetcode_problems.sliding_window_leetcode_problems.sliding_window_lc_nc_150;

/**
 * Sliding window, set left value to right if a lower right value is found.
 * (track min. price till the current index(r))
 * TC - O(N)
 * SC - O(1)
 */
public class LC121_BestTimeToBuyAndSellStock {
	public int maxProfit(int[] prices) {
        int size = prices.length;
        int l = 0;
        int r = 0;
        int res = 0;
        
        while (r < size) {
        	int profit = prices[r]-prices[l];
        	res = Math.max(res, profit);
        	
        	if (profit < 0) {
        		l=r;
        	}
        	r++;
        }
        
        return res;
    }
}
