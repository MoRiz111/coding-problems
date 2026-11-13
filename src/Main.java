import java.util.Arrays;

import leetcode_problems.array_leetcode_problems.array_lc_nc_150.LC271_EncodeAndDecodeStrings;
import leetcode_problems.greedy_leetcode_problems.greed_lc_nc_150.LC1899_MergeTripletsToFormTargetTriplets;
import leetcode_problems.hashing_leetcode_problems.hashing_lc_nc_150.LC36_ValidSudoku;
import leetcode_problems.hashing_leetcode_problems.hashing_lc_nc_150.LC49_GroupAnagrams;

public class Main {
	public static void main(String[] args) {
		LC36_ValidSudoku lc36 = new LC36_ValidSudoku();
		char[][] board = new char[][] {
		    {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
		    {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
		    {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
		    {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
		    {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
		    {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
		    {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
		    {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
		    {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
		};
		System.out.println(lc36.isValidSudoku(board));
		
//		LC1899_MergeTripletsToFormTargetTriplets lc1899 = new LC1899_MergeTripletsToFormTargetTriplets();
//		
//		System.out.println(lc1899.mergeTriplets(new int[][]{{3, 1, 7}, {1, 5, 10}}, new int[]{3, 5, 7}));
		
//		LC271_EncodeAndDecodeStrings lc271 = new LC271_EncodeAndDecodeStrings();
//		String encoded = lc271.encode(Arrays.asList("eat","tea","tan","ate","nat","bat"));
//		System.out.println("Encoded : " + encoded + "\nDecoded : " + lc271.decode(encoded));
		
		
//		LC49_GroupAnagrams lc49 = new LC49_GroupAnagrams();
//		System.out.println(lc49.groupAnagrams(new String[] {"eat","tea","tan","ate","nat","bat"}));
		
//		LC981_TimeBasedKeyValueStore lc981 = new LC981_TimeBasedKeyValueStore();
//		lc981.set("foo", "bar", 1);
//		lc981.set("foo", "bar2", 2);
//		lc981.set("goo", "car", 3);
//		System.out.println("Res : " + lc981.get("foo", 1));
		
//		LC567_PermuatationInString lc567 = new LC567_PermuatationInString();
//		System.out.println(lc567.checkInclusion("hello", "ooolleoooleh"));
		
//		LC295_FindMedianFromDataStream lc295 = new LC295_FindMedianFromDataStream();
//		lc295.addNum(1);
//		lc295.addNum(2);
//		System.out.println(lc295.findMedian());
//		lc295.addNum(3);
//		System.out.println(lc295.findMedian());
		
//		LC239_SlidingWindowMaximum lc239 = new LC239_SlidingWindowMaximum();
		//int nums[] = {1,3,1,2,0,5};
		//int k = 3;
		//System.out.println(lc239.maxSlidingWindow(nums, k));
		
//		LC215_KthLargestElementInArray lc215 = new LC215_KthLargestElementInArray();
		//int nums[] = {3,2,1,5,6,4,8,7,10,9}; //{3,2,1,5,6,4};
		//int k = 2;
		//System.out.println(lc215.findKthLargest(nums, k));
		
		
//		LC875_KokoEatingBananas lc875 = new LC875_KokoEatingBananas();
//		int[] piles = {312884470};
//		int h = 968709470;
//		System.out.println("Res - " + lc875.minEatingSpeed(piles, h));
	}

}
