package leetcode_problems.binary_tree_leetcode_problems.binary_tree_lc_nc_150;

import leetcode_problems.binary_tree_leetcode_problems.TreeNode;

/**
 * Recursive - DFS
 * Calculate both max sum path passing through current node,
 * and max sum returned to parent.
 * TC - O(N)
 * SC - O(H) -> O(logN) (as height = logN for balanced binary tree),
 *              but for worst case skewed tree - SC - O(N)
 */
public class LC124_BinaryTreeMaximumPathSum {
	public int maxPathSum(TreeNode root) {
		int[] maxSum = {root.val};
		maxSum[0] = Math.max(maxSum[0], helper(root, maxSum));
		
		return maxSum[0];
    }
	
	public int helper(TreeNode root, int[] maxSum) {
		if (root == null) {
			return 0;
		}
		
		int val = root.val;
		int leftVal = helper(root.left, maxSum);
		int rightVal = helper(root.right, maxSum);
		
		maxSum[0] = Math.max(val, Math.max(maxSum[0], val + leftVal + rightVal)); //Math.max(leftVal, Math.max(rightVal, val+leftVal+rightVal));
		return val + Math.max(0, Math.max(leftVal, rightVal));
	}
}
