package leetcode_problems.queue_leetcode_problems.queue_lc_nc_150;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * SC - O(N) - queue - N - no. of calls
 * TC - O(1) - amortized per call of ping()
 * 
 * 
 * 
 * ### Amortized Time Complexity – LC 933 (Number of Recent Calls)

**What is Amortized Time Complexity?**

Amortized time complexity calculates the average cost of an operation,
over a sequence of multiple operations, even if some individual operations are expensive.

**Example:**

Suppose the queue contains timestamps: `[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]`.

Now, a new ping arrives with timestamp `5000`.

- The new timestamp `5000` is inserted.
- All previous 10 timestamps are outside the valid range.
- All 10 previous timestamps must be removed.
- This particular ping operation takes O(N) time.

However, consider the entire sequence of operations:

1. Every timestamp is inserted into the queue exactly once.
2. Every timestamp can be removed from the queue at most once.
3. Therefore, across N ping calls, 
   the total number of insertions is O(N), and the total number of removals is also O(N).

**Total Time Complexity = O(N) + O(N) = O(N)**

If N operations take O(N) total time:

**Amortized Time Complexity per operation = O(N) / N = O(1)**

**Important distinction:**

- Worst-case TC of a single ping() call: O(N).
- Amortized TC per ping() call: O(1).
- Total TC for N ping() calls: O(N).

**Key takeaway:** Even if an individual operation takes O(N), 
  if the expensive work can happen only a limited number of times across the entire sequence of operations,
  the amortized time complexity can still be O(1).
 */
public class LC933_NoOfRecentCalls {
	Deque<Integer> queue;
	
    public LC933_NoOfRecentCalls() {
    	queue = new ArrayDeque<Integer>();
    }
    
    /**
     * TC - O(no. of values > t-3000) -> O(N)
     */
    public int ping(int t) {
        queue.offer(t);
        
        while (t-3000 > queue.peek()) {
        	queue.poll();
        }
        
        return queue.size();
    }
}
