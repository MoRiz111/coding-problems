package leetcode_problems.heap_leetcode_problems.heap_lc_nc_150;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class LC295_FindMedianFromDataStream {
	PriorityQueue<Integer> heap = new PriorityQueue<>();

    public LC295_FindMedianFromDataStream() {
        
    }
    
    public void addNum(int num) {
        heap.offer(num);
    }
    
    public double findMedian() {
        int size = heap.size();
        double median = 0;
        int m = size/2;
        List<Integer> removed = new ArrayList<Integer>();
        
        if (size%2 == 0) { //even
        	int k = 0;
        	
        	
        	while (k <= m) {
        		int elt = heap.poll();
        		removed.add(elt);
        		
        		if (k == m-1 || k == m) {
        			median += elt;
        		}
        		k++;
        	}
        	
        	median = median/2;
        } else {
        	int k = 0;
        	
        	while (k <= m) {
        		int elt = heap.poll();
        		removed.add(elt);
        		
        		if (k == m) {
        			median += elt;
        		}
        		k++;
        	}
        }
        
        
        for (int elt : removed) {
        	heap.offer(elt);
        }
        
        return median;
    }
}
