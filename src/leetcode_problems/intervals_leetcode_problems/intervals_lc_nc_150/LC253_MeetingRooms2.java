package leetcode_problems.intervals_leetcode_problems.intervals_lc_nc_150;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;


public class LC253_MeetingRooms2 {
	/**
	 * Sorting, directly comparing start and end time with 2 lists
	 * TC - O(N.logN) - sorting
	 * SC - O(N) - Java List.sort() uses TimSort (worst case) for sorting, minHeap
	 */
	public int minMeetingRoomsEfficient(List<Interval> intervals) {
		int res = 0;
		int rooms = 0;
		int start = 0;
		int end = 0;
		intervals.sort((a,b) -> Integer.compare(a.start, b.start)); //sort by start time
		List<Interval> endSortedIntervals = new ArrayList<>(intervals); 
		endSortedIntervals.sort((a,b) -> Integer.compare(a.end, b.end)); //sort by end time
		
		while (start < intervals.size()) {
			if (intervals.get(start).start < endSortedIntervals.get(end).end) {
				rooms++;
				start++;
				res = Math.max(rooms, res);
			} else {
				rooms--;
				end++;
			}
		}
		
		return res;
	}

	/**
	 * Using Min. Heap and sorting
	 * TC - O(N.logN) - sorting, adding/remove elements from Min. Heap
	 * SC - O(N)
	 */
    public int minMeetingRooms(List<Interval> intervals) {
    	int res = 0;
    	PriorityQueue<Integer> minHeap = new PriorityQueue<>(); //O(N)
    	
    	intervals.sort((a,b) -> Integer.compare(a.start, b.start)); //O(N.logN)
    	
    	for (Interval interval : intervals) {
    		while (!minHeap.isEmpty() && interval.start >= minHeap.peek()) {
    			minHeap.poll(); //O(logN)
    		}
    		
    		minHeap.add(interval.end); //O(logN)
    		res = Math.max(res, minHeap.size());
    	}
    	
    	return res;
    }
}
