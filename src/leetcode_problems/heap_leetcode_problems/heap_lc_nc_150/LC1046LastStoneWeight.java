package leetcode_problems.heap_leetcode_problems.heap_lc_nc_150;

import java.util.Comparator;
import java.util.PriorityQueue;

public class LC1046LastStoneWeight {
	/**
	 * Max heap
	 * TC - O(NlogN)
	 * SC - O(N)
	 */
    public int lastStoneWeight(int[] stones) {
    	//SC - O(N)
        PriorityQueue<Integer> heap = new PriorityQueue<>(Comparator.reverseOrder()); //Integer.compare(b, a)
        
        //TC - O(NlogN)
        for (int stone: stones) {
        	heap.offer(stone); //TC - O(logN)
        }
        
        //TC - O(NlogN)
        while (heap.size() > 1) {
        	int firstStone = heap.poll();
        	int secondStone = heap.poll();
        	int diff = firstStone-secondStone;
        	
        	if (diff != 0) {
        		heap.offer(diff); //TC - O(logN)
        	}
        }
        
        return heap.isEmpty() ? 0: heap.peek();
    }
}
