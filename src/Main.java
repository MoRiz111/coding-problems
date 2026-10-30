import leetcode_problems.binary_search_leetcode_problems.binary_search_lc_nc_150.LC875_KokoEatingBananas;
import leetcode_problems.heap_leetcode_problems.heap_lc_nc_150.LC295_FindMedianFromDataStream;
import leetcode_problems.queue_leetcode_problems.queue_lc_nc_150.LC239_SlidingWindowMaximum;
import leetcode_problems.sorting_leetcode_problems.sorting_lc_nc_150.LC215_KthLargestElementInArray;

public class Main {
	public static void main(String[] args) {
		LC295_FindMedianFromDataStream lc295 = new LC295_FindMedianFromDataStream();
		lc295.addNum(1);
		lc295.addNum(2);
		System.out.println(lc295.findMedian());
		lc295.addNum(3);
		System.out.println(lc295.findMedian());
		
		LC239_SlidingWindowMaximum lc239 = new LC239_SlidingWindowMaximum();
		//int nums[] = {1,3,1,2,0,5};
		//int k = 3;
		//System.out.println(lc239.maxSlidingWindow(nums, k));
		
		LC215_KthLargestElementInArray lc215 = new LC215_KthLargestElementInArray();
		//int nums[] = {3,2,1,5,6,4,8,7,10,9}; //{3,2,1,5,6,4};
		//int k = 2;
		//System.out.println(lc215.findKthLargest(nums, k));
		
		
		LC875_KokoEatingBananas lc875 = new LC875_KokoEatingBananas();
//		int[] piles = {312884470};
//		int h = 968709470;
//		System.out.println("Res - " + lc875.minEatingSpeed(piles, h));
	}

}
