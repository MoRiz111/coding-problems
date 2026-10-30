package leetcode_problems.heap_leetcode_problems.heap_lc_nc_150;

import java.util.PriorityQueue;

/**
 * Heap, retrieve the heap min K times
 * 
 * TC - O(N)
 * SC - O(N) [heap]
 */
public class LC973_KClosestPointsToOrigin {
    public int[][] kClosest(int[][] points, int k) {
        int[][] res = new int[k][2];
        PriorityQueue<int[]> heap = new PriorityQueue<int[]>(
        		(a,b) -> Integer.compare(a[0], b[0]));
        
        for (int i=0; i<points.length; i++) {
        	int dis = (int) (Math.pow(points[i][0],2) + Math.pow(points[i][1],2));
        	heap.offer(new int[]{dis, i});
        }
        
        int i = 0;
        
        while (i<k) {
        	res[i] = points[heap.poll()[1]];
        	i++;
        }
        
        return res;
    }
}
