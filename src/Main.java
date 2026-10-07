import leetcode_problems.binary_search_leetcode_problems.binary_search_lc_nc_150.LC875_KokoEatingBananas;
import leetcode_problems.sorting_leetcode_problems.sorting_lc_nc_150.LC215_KthLargestElementInArray;

public class Main {
	public static void main(String[] args) {
		LC215_KthLargestElementInArray lc215 = new LC215_KthLargestElementInArray();
		
		int nums[] = {3,2,1,5,6,4,8,7,10,9}; //{3,2,1,5,6,4};
		int k = 2;
		System.out.println(lc215.findKthLargest(nums, k));
		
		
		LC875_KokoEatingBananas lc875 = new LC875_KokoEatingBananas();
		
		int[] piles = {3,6,7,11};
		int h = 8;
		//System.out.println("Res - " + lc875.minEatingSpeed(piles, h));
	}

}
