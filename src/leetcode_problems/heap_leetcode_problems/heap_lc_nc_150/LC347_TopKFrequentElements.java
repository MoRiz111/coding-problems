package leetcode_problems.heap_leetcode_problems.heap_lc_nc_150;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * Max Heap
 * TC - O(NlogN + KlogN)
 * SC - O(1)
 */
public class LC347_TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
    	Map<Integer, Integer> freq = new HashMap<>();
    	int[] res = new int[k];
    	
    	for (int num: nums) { //TC - O(N)
    		freq.put(num, freq.getOrDefault(num, 0)+1);
    	}
    	
    	PriorityQueue<int[]> heap = new PriorityQueue<int[]>((a,b) -> Integer.compare(b[0], a[0]));
    	
    	for (Map.Entry<Integer, Integer> ent : freq.entrySet()) { //O(N.logN)
    		heap.offer(new int[]{ent.getValue(), ent.getKey()});
    	}
    	
    	int i = 0;
    	while (i < k) { //O(K.logN)
    		int[] elt = heap.poll();
    		res[i] = elt[1];
    		i++;
    	}
    	
    	return res;
    }
}
