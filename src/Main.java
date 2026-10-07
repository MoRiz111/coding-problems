import leetcode_problems.binary_search_leetcode_problems.binary_search_lc_nc_150.LC875_KokoEatingBananas;

public class Main {
	public static void main(String[] args) {
		LC875_KokoEatingBananas lc875 = new LC875_KokoEatingBananas();
		
		int[] piles = {3,6,7,11};
		int h = 8;
		System.out.println("Res - " + lc875.minEatingSpeed(piles, h));
	}

}
