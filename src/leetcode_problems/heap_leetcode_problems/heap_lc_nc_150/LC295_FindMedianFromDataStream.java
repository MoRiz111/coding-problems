package leetcode_problems.heap_leetcode_problems.heap_lc_nc_150;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Min.Heap and Max.Heap
 * Make sure that size difference b/w minHeap and maxHeap is atmost 1.
 * 
 * TC - O(NlogN)
 * SC - O(N) (2 heaps)
 */
public class LC295_FindMedianFromDataStream {
	PriorityQueue<Integer> maxHeap;
	PriorityQueue<Integer> minHeap;

    public LC295_FindMedianFromDataStream() {
    	maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
    	minHeap = new PriorityQueue<>();
    }
    
    
    public void addNum(int num) { //TC - O(logN)
        if (!minHeap.isEmpty() && num > minHeap.peek()) {
        	minHeap.add(num);
        } else {
        	maxHeap.add(num);
        }
        
        if (maxHeap.size() > minHeap.size() + 1) {
        	minHeap.add(maxHeap.poll());
        }
        
        if (minHeap.size() > maxHeap.size()) {
        	maxHeap.add(minHeap.poll());
        }
    }
    
    public double findMedian() {
        if (maxHeap.size() > minHeap.size()) {
        	return maxHeap.peek();
        } else {
        	return (double)(maxHeap.peek() + minHeap.peek())/2;
        }
    }
}
