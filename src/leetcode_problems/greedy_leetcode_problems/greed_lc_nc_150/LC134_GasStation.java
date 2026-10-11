package leetcode_problems.greedy_leetcode_problems.greed_lc_nc_150;

/**
 * Greedy - running sum
 * TC - O(N)
 * SC - O(1)
 */
public class LC134_GasStation {
	public int canCompleteCircuit(int[] gas, int[] cost) {
		int len = gas.length;
        int totalGas = 0;
        int totalPath = 0;
        int res = 0;
        int sum = 0;
        
        for (int i=0; i<len; i++) {
        	totalGas += gas[i];
        	totalPath += cost[i];
        	sum += gas[i] - cost[i];
        	
        	if (sum < 0) {
        		res = i+1;
        		sum = 0;
        	}
        }
        
        return (totalPath > totalGas) ? -1 : res;
    }
}
