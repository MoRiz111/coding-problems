package leetcode_problems.sorting_leetcode_problems.sorting_lc_nc_150;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Max Heap
 * TC - O(NlogN + KlogN)
 * SC - O(1)
 */
public class LC347_TopKFrequentElements {
	/**
	 * TC - O(N)
	 * SC - O(N)
	 */
	public int[] topKFrequent(int[] nums, int k) {
		Map<Integer, Integer> freq = new HashMap<>(); //SC - O(N)
		int size = nums.length;
		Queue<Integer>[] bucket = new Queue[size+1]; //SC - O(N)
		int[] res = new int[k];
		
		//TC - O(N)
		for (int num: nums) {
			freq.put(num, freq.getOrDefault(num, 0)+1);
		}
		
		//TC - O(N)
		for (Integer key : freq.keySet()) {
			int val = freq.get(key);
			
			if (bucket[val] == null) {
				bucket[val] = new ArrayDeque<Integer>();
			}
			
			bucket[val].add(key);
		}
		
		//TC - O(N)
		for (int i = size; i >= 0; i--) {
			if (bucket[i] != null) {
				while (!bucket[i].isEmpty()) {
					res[k-1] = bucket[i].poll();
					k--;
					
					if (k == 0) {
						return res;
					}
				}
			}
		}
		
		return res;
		
	}
	
	
	/**
	 * HashMap + Min.Heap
	 * TC - O(N + KlogK)
	 * SC - O(N + K) => O(N)
	 */
	public int[] topKFrequentMoreEfficient(int[] nums, int k) {
		Map<Integer, Integer> freq = new HashMap<>(); //SC - O(N)
		PriorityQueue<int[]> minHeap = new PriorityQueue<>((a,b) -> Integer.compare(a[1], b[1])); //SC - O(K)
		int[] res = new int[k];
		
		//TC - O(N)
		for (int num: nums) {
			freq.put(num, freq.getOrDefault(num, 0)+1);
		}
		
		//TC - O(K. logK) [in worst case, K = no. of unique elements)
		for (Integer key : freq.keySet()) {
			minHeap.offer(new int[] {key, freq.get(key)}); //TC - O(logK)
			
			if (minHeap.size() > k) {
				minHeap.poll();
			}
		}
		
		int i = 0;
		
		//TC - O(K)
		while (!minHeap.isEmpty()) {
			res[i] = minHeap.poll()[0];
			i++;
		}
		
		return res;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
    public int[] topKFrequentInEfficient(int[] nums, int k) {
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
