package leetcode_problems.intervals_leetcode_problems.intervals_lc_nc_150;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

/**
 * Sorting and Min. Heap for overlapping rooms
 * TC - O(N.logN) - sorting
 * SC - O(N) - Java List.sort() uses TimSort (worst case) for sorting, minHeap
 */
public class LC253_MeetingRooms2 {
	public int minMeetingRoomsEfficient(List<Interval> intervals) {
		int res = 0;
		int rooms = 0;
		int start = 0;
		int end = 0;
		intervals.sort((a,b) -> Integer.compare(a.start, b.start)); //sort by start time
		List<Interval> endSortedIntervals = new ArrayList<>(intervals); 
		endSortedIntervals.sort((a,b) -> Integer.compare(a.end, b.end)); //sort by end time
		
		while (end < intervals.size()) {
			if (endSortedIntervals.get(end).end < intervals.get(start).end) {
				rooms++;
				res = Math.max(rooms, res);
			} else {
				rooms--;
				start++;
			}
			
			end++;
		}
		
		return res;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
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
