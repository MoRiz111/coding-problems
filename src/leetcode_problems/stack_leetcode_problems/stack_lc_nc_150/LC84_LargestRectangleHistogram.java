package leetcode_problems.stack_leetcode_problems.stack_lc_nc_150;

import java.util.Stack;

public class LC84_LargestRectangleHistogram {
	public int largestRectangleArea(int[] heights) {
		Stack<int[]> stack = new Stack<int[]>();
		int res = 0;
		
		for (int i=0; i<heights.length; i++) {
			int val = heights[i];
			int index = i;
			
			while (!stack.isEmpty() && stack.peek()[0] >= val) {
				int[] stackVal = stack.pop();
				int popval = stackVal[0];
				index = stackVal[1];
				int area = popval * (i-index);
				res = Math.max(area, res);
			}
			
			stack.add(new int[] {val,index});
		}
		
		int end = heights.length-1;
		
		while (!stack.isEmpty()) {
			int[] stackVal = stack.pop();
			int popval = stackVal[0];
			int start = stackVal[1];
			int area = popval * (end-start+1); 
			res = Math.max(area, res);
		}
		
		return res;
    }
}
