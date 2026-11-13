package leetcode_problems.intervals_leetcode_problems.intervals_lc_nc_150;

import java.util.List;

/**
 * TC - O(N.logN) - due to sorting
 * SC - O(N) - Java List.sort() uses TimSort (worst case) for sorting
 */
public class LC252_MeetingRooms {
    public boolean canAttendMeetings(List<Interval> intervals) {
    	intervals.sort((a,b) -> Integer.compare(a.start,b.start)); //always use this.
    	int prevEnd = 0;
    	
    	for (Interval interval : intervals) {
    		
    		if (interval.start < prevEnd) {
    			return false;
    		}
    		
    		prevEnd = interval.end;
    	}
    	
    	return true;
    }
}

class Interval {
    public int start, end;
    
    public Interval(int start, int end) {
        this.start = start;
        this.end = end;
     }
 }
