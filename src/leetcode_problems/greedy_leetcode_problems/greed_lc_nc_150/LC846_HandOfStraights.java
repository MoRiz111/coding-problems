package leetcode_problems.greedy_leetcode_problems.greed_lc_nc_150;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * Min-Heap + HashMap / TreeMap
 * TC - O(N.logN) [O(N + K log K), where K is the no. of unique elements,
 *                 which is O(N log N) in the worst case]
 * SC - O(N)
 */
public class LC846_HandOfStraights {
    public boolean isNStraightHand(int[] hand, int groupSize) {
    	if (hand.length % groupSize != 0) {
    		return false;
    	}
    	
        Map<Integer, Integer> freq = new HashMap<>();
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        
        for (int num: hand) {
        	if (!freq.containsKey(num)) {
        		minHeap.offer(num);
        		freq.put(num, 1);
        	} else {
        		freq.put(num, freq.get(num)+1);
        	}
        }
        
        while (minHeap.size() > 0) {
        	int start = minHeap.peek();
        	
        	for (int i =0; i < groupSize; i++) {
        		int next = start+i;
        		
        		if (freq.getOrDefault(next, 0) <= 0) {
        			return false;
        		} else {
        			freq.put(next, freq.get(next)-1);
        			
        			if (freq.get(next) == 0) {
        				if (next != minHeap.peek()) {
        					return false;
        				}
        				
        				minHeap.poll();
        			}
        		}
        	}
        }
        return true;
    }
}
