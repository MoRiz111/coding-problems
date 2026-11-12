package leetcode_problems.greedy_leetcode_problems.greed_lc_nc_150;

import java.util.Arrays;

public class LC1899_MergeTripletsToFormTargetTriplets {
    public boolean mergeTriplets(int[][] triplets, int[] target) {
    	int[] res = {0,0,0};
    	
    	for (int[] triplet: triplets) {
    		boolean consider = false;
    		int[] temp = res.clone();
    		
    		for (int i = 0; i<3; i++) {
    			if (triplet[i] == target[i]) {
    				consider = true;
    				temp[i] = target[i];
    			}
    			
    			if (triplet[i] > target[i]) {
    				consider = false;
    				break;
    			}
    		}
    		
    		if (consider) {
    			res = temp.clone();
    		}
    	}
    	
        return Arrays.equals(res, target);
    }
}
